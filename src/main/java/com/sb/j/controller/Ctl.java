package com.sb.j.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.Session;
import com.sb.j.entity.Player;
import com.sb.j.service.CardService;
import com.sb.j.service.PlayerService;
import com.sb.j.service.SignUpService;

@Controller
public class Ctl {

	@Autowired
	private SignUpService signUpService;
	@Autowired
	private PlayerService playerService;
	@Autowired
	private CardService cardService;
//	@Autowired
//	private Player player;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping("/index") // (value = {"/","/index"})
	public ModelAndView indexA() {
		return new ModelAndView("index");
	}

	@RequestMapping("/intro")
	public ModelAndView intro() {
		return new ModelAndView("intro");
	}

	@RequestMapping("/signUp")
	public ModelAndView signUp(
			@RequestParam("sup_usrname") String usrname,
			@RequestParam("sup_password") String password) {
		ModelAndView mv = new ModelAndView("signup_pg");
		String notice;

		Player player = new Player();
		player.setName(usrname);
		player.setPassword(password);

		notice = playerService.signUp(player);
		mv.addObject("notice", notice);
		return mv;
	}

	@RequestMapping("/signIn")
	public ModelAndView signIn(
			@RequestParam("sin_usrname") String usrname,
			@RequestParam("sin_password") String password,
			HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("intro");
		HttpSession session=request.getSession();
		String notice;
		Object result;

		Player player = new Player();
		player.setName(usrname);
		player.setPassword(password);

		result = playerService.signIn(player);
		if (result.getClass() == String.class) {
			notice = (String) result;
			mv.addObject("notice", notice);
		} else if (result.getClass() == Player.class) {
			mv = new ModelAndView("justSignIn");
			session.setAttribute("signIn", true);
			System.out.println("/signIn\nSESSION："+session.getId()+"\n.signIn："+session.getAttribute("signIn"));//print狀態
//			session.setAttribute("fromStt", false);
			Player showPlayer = null;
			showPlayer = transToShow((Player) result);
			session.setAttribute("player", showPlayer);
			mv.addObject("player", showPlayer);
		} else {
			mv.addObject("notice", "Error");
		}
		return mv;
	}
	
	@RequestMapping("/stt")
	public ModelAndView stt(HttpServletRequest request) {
		ModelAndView mv=null;
		HttpSession session=request.getSession();
		System.out.println("/stt\nSESSION："+session.getId()+"\n.signIn："+session.getAttribute("signIn"));//print狀態
		if((Boolean)session.getAttribute("signIn")) {
			mv = new ModelAndView("stt");
//			session.setAttribute("fromStt", true);
		}else {
			mv = new ModelAndView("intro");
			mv.addObject("notice", "您尚未登入");
		}
		
		return mv;
	}
	
	@RequestMapping("/signOut")
	public ModelAndView signOut(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("signIn", false);
		System.out.println("/signOut\nSESSION："+session.getId()+"\n.signIn："+session.getAttribute("signIn"));//print狀態
		
		ModelAndView mv=new ModelAndView("intro");
		mv.addObject("notice", "已登出");
		
		return mv;
	}
	
	@RequestMapping("/catchACard")
	public ModelAndView catchACard(HttpServletRequest request) {
		HttpSession session=request.getSession();
		ModelAndView mv=new ModelAndView("stt");
		String newCard =cardService.catchACard();
		if(newCard==null) {
			mv.addObject("notice","沒有抽中卡片...");
		}else {
			session.setAttribute("handCard", newCard);
			mv.addObject("notice","抽中卡片No. "+newCard+
					"．你要... <a href=\"dropHandCard\">丟棄</a>/放入第幾格：<a href=\"updatePocket\">1</a>");
		}
		return mv;
	}
	
	@RequestMapping("/dropHandCard")
	public ModelAndView dropHandCard(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.setAttribute("handCard", null);
		ModelAndView mv=new ModelAndView("stt");
		return mv;
	}

	private Player transToShow(Player player) {
		Player showPlayer = null;
		showPlayer = player;
		showPlayer.setPassword(null);
		return showPlayer;
	}

	@RequestMapping("/lst_all")
	public ModelAndView lstAll() {
		ModelAndView mv = new ModelAndView("signup_pg");
		playerService.lstAll();
		return mv;
	}

	@RequestMapping("/test")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView("test");

//		Player p = new Player();
//		playerService.initPocket(p);
//		Player player=new Player();
//		player.setName(usrname);
//		player.setPassword(password);
//		playerService.isNameExist();
//		playerService.isNameExist(player);
		return mv;
	}
	
	@RequestMapping("/t1")
	public ModelAndView t1(HttpSession session, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("test");
		HttpSession sessionQ= request.getSession();
		System.out.println("s\n"+session.getId());
		System.out.println("q\n"+sessionQ.getId());
		System.out.println("s\n"+session.getAttribute("a"));
		System.out.println("s\n"+session.getAttribute("aa"));
		
		session.setAttribute("aa", "bb");
		return mv;
	}

	@RequestMapping("/signup_pg")
	public ModelAndView signup() {
		return new ModelAndView("signup_pg");
	}

	@RequestMapping("/hw")
	public ModelAndView hello() {
		return new ModelAndView("hw");
	}
}
