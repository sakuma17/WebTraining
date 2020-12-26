package model;

import java.io.Serializable;

public class Avatar implements Serializable{

	private String name;
	private int[] status=new int[5];
	private String race;
	private String job;

	public Avatar() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getStatus() {
		return status;
	}
	public void setStatus(int[] status) {
		this.status = status;
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
	public Avatar(String name) {
		this.name=name;
	}
}
