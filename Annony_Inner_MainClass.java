package IntrefaceExpPackage;
 interface Test {
public void score();
}


public class Annony_Inner_MainClass {

	public static void main(String[] args) {
		Test t= new Test() {public void score()
				{
				System.out.println("hi");
				}
		};
		t.score();
		
	}
	
}
		

	


