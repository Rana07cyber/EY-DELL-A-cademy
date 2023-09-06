
public class letsetequalswithdefinedclass {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		import java.util.Objects;
		class employee{
			String firstName;
			//public String getfirstName() {
			//	return firstName;
		//	}
		//	public void setfirstName(string )
			
		
		
		public String getFirstName() {
				return firstName;
			}



			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}



		public class letsetequalswithdefinedclass{
				employee e1 = new employee();
				employee e2 = new employee();
				e1.setfirstName("ABC");
				e2.setfirstName("ABC")
				if (e1.equals(e2)) {
					System.out.println("=equals works for custom class" );

				}else {
					System.out.println("equals does not works for custom class" );

				}
				System.out.println("Memory address is "+ e1.hashCode() );
				System.out.println("Memory address is "+ e2.hashCode() );

			}
		
	}

}
