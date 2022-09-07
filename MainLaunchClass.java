package Has_a_relationshipPackage;

public class MainLaunchClass {

	public static void main(String[] args) {
		
		Account account=new Account("ISBN11724","Current","ZeusBlank"); //Dependent Object
		
		Employee employee=new Employee(07, "Hades", "BBI", account); //Target object
		
		employee.display();
		
		

	}

}
