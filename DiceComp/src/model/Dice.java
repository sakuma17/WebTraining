package model;

import java.io.Serializable;

public class Dice implements Serializable{
	private int[] diceStates= {0,0,0,0,0,0};
	private int count=0;
	private int total=0;
	private int nowDice=0;
	private String msg="Push this Button";

	public int[] getDiceStates() {
		return diceStates;
	}
	public void setDiceStates(int[] diceStates) {
		this.diceStates = diceStates;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getNowDice() {
		return nowDice;
	}
	public void setNowDice(int nowDice) {
		this.nowDice = nowDice;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
