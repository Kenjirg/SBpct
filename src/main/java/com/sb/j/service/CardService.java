package com.sb.j.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class CardService {

	public String catchACard() {
		Integer i=randomCard();
		if(i>=110||i<10) {
			return null;
		}else {
			return cardNumToStr(i/10);
		}
	}
	
	private String cardNumToStr(Integer j) {
		return String.format("%04d", j);
//		String str=null;
//		str=String.format("%04d", j);
		
//		switch (j) {
//		case 10:
//			str=String.format("%04d", j);
//			break;
//		default:
//			break;
//		}
	}

	private Integer randomCard() {
		Random r = new Random();
		return ((r.nextInt(200))+1);
	}
}
