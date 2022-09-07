package Has_a_relationshipPackage;

public class Employee {

	private Integer eid;
	private String ename;
	private String eaddress;
	private Account account;
	
	public Employee(Integer eid, String ename, String eaddress, Account account)
	{
		this.eid=eid;
		this.ename=ename;
		this.eaddress=eaddress;
		this.account=account;
	}
	
	

	public void display() {
		System.out.println("Employee:: display method called");
		System.out.println("*************EMPLOYEE DETAILS ARE****************");
		System.out.println("EID    is  :: " + eid);
		System.out.println("ENAME  is  :: " + ename);
		System.out.println("EADDR  is  :: " + eaddress);
		System.out.println("**************ACCOUNT DETAILS ARE*****************");
		System.out.println("ACCNO   is  ::" + account.getAccNo());
		System.out.println("ACCTYPE is  ::" + account.getAccType());
		System.out.println("ACCNAME is  ::" + account.getAccName());

	}

}