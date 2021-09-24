package com.sb.j.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.stereotype.Service;

import com.sb.j.dao.PlayerDao;
import com.sb.j.entity.Player;

@Service
public class PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
	private final Integer MAX_HP=100;
	private final Integer MAX_MP=100;
	
	public String signUp(Player player) {// 註冊會員
		System.out.println("進svc註冊");
		String result = null;
		if(isNameExist(player.getName())) {
			result="此名稱已被註冊";
		}else {
			initPlayer(player);
			playerDao.save(player);
			result="註冊完成<a href=\"intro\">前往登入</a>";
		}
		return result;
	}
	
	private void initPlayer(Player player) {
		player.setLv("1");
		player.setHp(100);
		player.setMp(100);
		player.setStatus("Newbie");
		player.setNen("something");
		initPocket(player);
	}

	private void initPocket(Player player) {
		String arr[]=new String[5];
		for(int i=0;i<5;i++) {
			arr[i]= String.format("%04d", randomCardNum());
		}
		player.setPocket0001(arr[0]);
		player.setPocket0002(arr[1]);
		player.setPocket0003(arr[2]);
		player.setPocket0004(arr[3]);
		player.setPocket0005(arr[4]);
	}

	private Integer randomCardNum() {
		Random r = new Random();
		return ((r.nextInt(10))+1);
	}

	public Object signIn(Player inPlayer) {
		Player dbPlayer = null;
		List<Player> lst = playerDao.findByName(inPlayer.getName());
		if(lst.isEmpty()) {
			return "名稱錯誤";
		}else{
			dbPlayer = lst.get(0);
			if (dbPlayer.getPassword().equals(inPlayer.getPassword())) {
				return dbPlayer;
			}else {
				return "登入失敗";//密碼錯誤
			}
		}
//		System.out.println("\naaaaaaaaaaaa\n"+dbPlayer);
//		System.out.println("\nbbbbbbbbbbbb\n"+dbPlayer);
	}
	
	public List<Player> lstAll() {
		System.out.println(playerDao.findAll());
		return null;
	}
	
	public Boolean isNameExist(String name) {
//		System.out.println(false);
		List<Player> lst=playerDao.findByName(name);
		Boolean result=!(lst.isEmpty());
//		System.out.println(l);
//		System.out.println(l.isEmpty());
//		System.out.println(playerDao.findById(1));
//		playerDao.findById(1);
		return result;
	}

	public Integer getMAX_HP() {
		return MAX_HP;
	}

	public Integer getMAX_MP() {
		return MAX_MP;
	}
	
}
