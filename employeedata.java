package day2.Package_B;

public class employeedata {
	   //non static

	int empId;

	String empName;

	 

	static String orgAddress ="ABC XYZ";

	static void orgAddressChange() {

	    orgAddress ="MNO PQR";

	}

	employeedata(int empId, String empName){

	    this.empId = empId;

	    this.empName = empName;

	}

	void display() {

	    System.out.println("Id of emp is" +empId +"and name of emp is" +empName +"and orgAddress is" + orgAddress);

	}

	public static void main(String[] args) {

		employeedata.orgAddressChange();
		employeedata e1 = new employeedata(123,"John");
		employeedata e2 = new employeedata(789,"charlie");

	    e1.display();
	    e2.display();

	}

	}
