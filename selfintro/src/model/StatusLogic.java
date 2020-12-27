package model;
import java.util.Random;

public class StatusLogic {
	static String[] stName= {"体力","魔力","パワー","きようさ","すばやさ"};
	int[] maxArr= {100,100,100,50,50};
	static String[] races= {"人間","ハイエルフ","トロル","ドワーフ"};
	static String[] jobs= {"戦士","盗賊","僧侶","魔術師"};

	public StatusLogic(Avatar avatar) {
		int seed=0;
		for(int i=0;i<(avatar.getName()).length();i++) {
			seed+=avatar.getName().charAt(i);
		}
		Random rand=new Random(seed);
		int[] status=new int[maxArr.length];
		for(int i=0;i<maxArr.length;i++) {
			status[i]=rand.nextInt(maxArr[i])+1;
		}
		avatar.setHp(status[0]);
		avatar.setMp(status[1]);
		avatar.setPower(status[2]);
		avatar.setDex(status[3]);
		avatar.setSpd(status[4]);
	}

	public static String displayStatus(Avatar avatar) {
		return String.format("[体力:%d 魔力%d パワー%d きようさ%d すばやさ%d]",
								avatar.getHp(),avatar.getMp(),avatar.getPower(),avatar.getDex(),avatar.getSpd());
	}

	public static void raceBonusStatus(Avatar avatar,int raceNum,int hp,int mp,int power,int dex,int spd) {
		int[][] raceBonus={
				{10,10,10,10,10},
				{0,20,0,10,20},
				{30,0,20,0,0},
				{10,0,0,25,20},
			};
		avatar.setHp(hp+raceBonus[raceNum][0]);
		avatar.setMp(mp+raceBonus[raceNum][1]);
		avatar.setPower(power+raceBonus[raceNum][2]);
		avatar.setDex(dex+raceBonus[raceNum][3]);
		avatar.setSpd(spd+raceBonus[raceNum][4]);
		avatar.setRaceNum(raceNum);
		avatar.setRace(races[raceNum]);
	}

	public static void jobBonusStatus(Avatar avatar,int raceNum,int jobNum,int hp,int mp,int power,int dex,int spd) {
		raceBonusStatus(avatar,raceNum,hp,mp,power,dex,spd);
		double [][] jobBonus= {
				{1.6,1,1.4,1,1},
				{1.1,1,1.2,1.3,1.3},
				{1.3,1.5,1.1,1,1},
				{1,1.9,1,1,1},
		};
		avatar.setHp((int)(avatar.getHp()*jobBonus[jobNum][0]));
		avatar.setMp((int)(avatar.getMp()*jobBonus[jobNum][1]));
		avatar.setPower((int)(avatar.getPower()*jobBonus[jobNum][2]));
		avatar.setDex((int)(avatar.getDex()*jobBonus[jobNum][3]));
		avatar.setSpd((int)(avatar.getSpd()*jobBonus[jobNum][4]));
		avatar.setJob(jobNum);
		avatar.setJob(jobs[jobNum]);
	}

}
