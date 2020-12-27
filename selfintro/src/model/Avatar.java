package model;

import java.io.Serializable;

public class Avatar implements Serializable{

	private String name;
	private int hp;
	private int mp;
	private int power;
	private int dex;
	private int spd;
	private int raceNum;
	private String race;
	private int jobNum;
	private String job;

	public Avatar() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setJobNum(int jobNum) {
		this.jobNum = jobNum;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	public int getRaceNum() {
		return raceNum;
	}
	public void setRaceNum(int raceNum) {
		this.raceNum = raceNum;
	}
	public int getJobNum() {
		return jobNum;
	}
	public void setJob(int jobNum) {
		this.jobNum = jobNum;
	}
	public Avatar(String name) {
		this.name=name;
	}
}
