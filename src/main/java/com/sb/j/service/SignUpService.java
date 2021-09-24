package com.sb.j.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sb.j.dao.PlayerDao;
import com.sb.j.entity.Player;

@Service
public class SignUpService {
	
	@Autowired
	private PlayerDao playerDao;

	public String signUp(Player player) {// 註冊會員
		System.out.println("進svc註冊");
//		String result=null;
		// 檢查Email
//		if (!emailVali(user.getEmail())) {//若格式錯誤
//			System.out.println("email錯誤");
//			return "註冊失敗，email格式錯誤";
//		}
		// encode
//		System.out.println(user);
//		if (!"".equals(user.getPassword())) {//若鍵入的碼不是空的
//			String enc = encode(user.getPassword());
//			user.setPassword(enc);
//		}
//		System.out.println(user);
		// DAO
		playerDao.save(player);
		return "註冊完成";
	}
	
	
}
