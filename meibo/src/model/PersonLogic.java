package model;

public class PersonLogic {

	public static void logic(Person person) {
		String[] data=person.getData().split(",");
		person.setName(data[0]);
		person.setfName(data[1]);
		person.setGender(data[2]);
		person.setBloodType(data[3]);
	}

}
