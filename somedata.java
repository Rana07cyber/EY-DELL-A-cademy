package day2.Package_B;

interface sampledata {
	void fullname(String firstname, String lastname);
}

public class somedata {
	public void fullname(String firstname, String lastname) {
		System.out.println("name is" + firstname + " " + lastname);
	}

	public static void main(String[] args) {
		somedata obj = new somedata();
		obj.fullname("ABC", "XYZ");
	}

}
