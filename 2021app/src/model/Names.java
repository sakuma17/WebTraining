package model;
import java.util.Random;

public class Names {
	private String[] names= {"kirara","lump","yukari","hifumi","yuzuko","nadeshiko",
								"yui","rin","aoba","salt","suggar","aikawasan"};
	private int[] nums=new int[names.length];
	private int[] opend=new int[names.length];

	public int[] getOpend() {
		return opend;
	}

	public void setOpend(int position) {
		this.opend[position] = 1;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}

	public Names() {
		Random rand=new java.util.Random();
		for(int i=0;i<nums.length;i++) {
			this.nums[i]=i;
		}
		for(int i=0;i<nums.length;i++) {
			int index=rand.nextInt(nums.length-i);
			int temp=this.nums[index];
			this.nums[index]=this.nums[nums.length-1-i];
			this.nums[nums.length-1-i]=temp;
		}
	}
}
