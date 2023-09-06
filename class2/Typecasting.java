package class2;

class Machine {
	//public static void main(String[] ) {
	void start1 () {
		System.out.println("machine has started" );
	}

	void stop () {
		System.out.println("machine has stopped" );
	}
	class Camera extends Machine{
		void start1 () {
			System.out.println("camera has started" );
		}

		void start() {
			System.out.println("camera has stopped" );
		}
		void Snap() {
			System.out.println("photo clicked" );

		}
	}
	public class Typecasting{
		public static void main(String[] args) {
			Machine m = new Machine();
			m.start1();
			m.start1();
			
			Camera C = new Camera ();
			C.start();
			C.stop();
			Machine pc = new Camera();
			pc.start1();
			pc.stop();
			
			//upcasting automatically
			Machine m2 = C;
			m2.start1();
			m2.stop();
			//downcasting - Correct
			Machine m3 = new Camera();
			Camera c2 =(Camera)m3;
			c2.start();
			c2.stop();
			c2.Snap();
			
			
		}
	}




	
	
	

}
}