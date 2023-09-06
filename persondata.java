package day2.Package_B;

public class persondata implements Cloneable {
	int person_id;
	int person_name;

	persondata(int person_id, String peraon_name) {
		this.person_id = person_id;
		this.person_name = person_name;
	}

	public static void main(String[] ags) {
		persondata obj1 = new persondata(123, "ABC");
		persondata obj2 = (persondata) obj1.Clone();
		System.out.println("person id id " + obj1.person_id + "and name is " + obj1.person_name);
		System.out.println("person id id " + obj2.person_id + "and name is " + obj2.person_name);

	}

}
