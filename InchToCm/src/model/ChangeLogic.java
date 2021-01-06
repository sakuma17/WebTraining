package model;

public class ChangeLogic {

	public void Change(Info info) {
		double cm=info.getInch()*2.54;
		info.setCm(cm);
	}

}
