package com.sb.j.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

//@Table(name = "PLAYER")
@Entity
@Table(name = "PLAYER")
public class Player implements Serializable {
//	private static final Long serialVersionUID = 1L;

	//@GeneratedValue(strategy = GenerationType.AUTO...IDENTITY)//@GeneratedValue
	@Id
	@GeneratedValue
	private Integer id;

	//@Column(name = "NAME")
	private String name;
	
	//@Column(name = "PASSWORD")
	private String password;
	
//	@Column(name = "LV")
	private String lv;
	
	//@Column(name = "HP")
	private Integer hp;
	
	//@Column(name = "MP")
	private Integer mp;
	
	//@Column(name = "STATUS")
	private String status;
	
	//@Column(name = "NEN")
	private String nen;
	
	//@Column(name = "CREATE_DATE")
	private Timestamp create_date;
	
	//@Column(name = "UPDATE_DATE")
	private Timestamp update_date;
	
	private String pocket0001;
	private String pocket0002;
	private String pocket0003;
	private String pocket0004;
	private String pocket0005;
	private String pocket0006;
	private String pocket0007;
	private String pocket0008;
	private String pocket0009;
	private String pocket0010;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLv() {
		return lv;
	}

	public void setLv(String lv) {
		this.lv = lv;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getMp() {
		return mp;
	}

	public void setMp(Integer mp) {
		this.mp = mp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNen() {
		return nen;
	}

	public void setNen(String nen) {
		this.nen = nen;
	}

	public Timestamp getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}

	public Timestamp getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Timestamp update_date) {
		this.update_date = update_date;
	}

	public String getPocket0001() {
		return pocket0001;
	}

	public void setPocket0001(String pocket0001) {
		this.pocket0001 = pocket0001;
	}

	public String getPocket0002() {
		return pocket0002;
	}

	public void setPocket0002(String pocket0002) {
		this.pocket0002 = pocket0002;
	}

	public String getPocket0003() {
		return pocket0003;
	}

	public void setPocket0003(String pocket0003) {
		this.pocket0003 = pocket0003;
	}

	public String getPocket0004() {
		return pocket0004;
	}

	public void setPocket0004(String pocket0004) {
		this.pocket0004 = pocket0004;
	}

	public String getPocket0005() {
		return pocket0005;
	}

	public void setPocket0005(String pocket0005) {
		this.pocket0005 = pocket0005;
	}

	public String getPocket0006() {
		return pocket0006;
	}

	public void setPocket0006(String pocket0006) {
		this.pocket0006 = pocket0006;
	}

	public String getPocket0007() {
		return pocket0007;
	}

	public void setPocket0007(String pocket0007) {
		this.pocket0007 = pocket0007;
	}

	public String getPocket0008() {
		return pocket0008;
	}

	public void setPocket0008(String pocket0008) {
		this.pocket0008 = pocket0008;
	}

	public String getPocket0009() {
		return pocket0009;
	}

	public void setPocket0009(String pocket0009) {
		this.pocket0009 = pocket0009;
	}

	public String getPocket0010() {
		return pocket0010;
	}

	public void setPocket0010(String pocket0010) {
		this.pocket0010 = pocket0010;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", password=" + password + ", lv=" + lv + ", hp=" + hp + ", mp="
				+ mp + ", status=" + status + ", nen=" + nen + ", create_date=" + create_date + ", update_date="
				+ update_date + ", pocket0001=" + pocket0001 + ", pocket0002=" + pocket0002 + ", pocket0003="
				+ pocket0003 + ", pocket0004=" + pocket0004 + ", pocket0005=" + pocket0005 + ", pocket0006="
				+ pocket0006 + ", pocket0007=" + pocket0007 + ", pocket0008=" + pocket0008 + ", pocket0009="
				+ pocket0009 + ", pocket0010=" + pocket0010 + "]";
	}
	
}
