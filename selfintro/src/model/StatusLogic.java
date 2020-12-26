package model;
import java.util.Random;

public class StatusLogic {
	static String[] stName= {"体力","魔力","パワー","きようさ","すばやさ"};
	static String[] races= {"人間","ハイエルフ","トロル","ドワーフ"};
	int[] maxArr= {100,100,100,50,50};

	public StatusLogic(Avatar avatar) {
		int seed=0;
		for(int i=0;i<(avatar.getName()).length();i++) {
			seed+=(avatar.getName()).charAt(i);
		}
		Random rand=new Random(seed);
		int[] status=avatar.getStatus();
		for(int i=0;i<maxArr.length;i++) {
			status[i]=rand.nextInt(maxArr[i])+1;
		}
	}

	public static String displayStatus(int[] status) {
		String st="[";
		for(int i=0;i<status.length;i++) {
			st+=stName[i]+":"+status[i]+" ";
		}
		st+="]";
		return st;
	}

	public static int[] raceBonusStatus(int[] status,int raceNum) {
		int[][] raceBonus={
				{10,10,10,10,10},
				{0,20,0,10,20},
				{30,0,20,0,0},
				{10,0,0,25,20},
			};
		int[]secondStatus=new int[raceBonus.length];
		for(int i=0;i<secondStatus.length;i++) {
			secondStatus[i]=status[i]+raceBonus[raceNum][i];
		}
		return secondStatus;
	}

	public static String race(int raceNum) {
		String race=races[raceNum];
		return race;
	}

}
