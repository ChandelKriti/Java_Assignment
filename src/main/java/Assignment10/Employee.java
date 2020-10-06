package Assignment10;

public class Employee implements java.io.Serializable{

	private static final long serialVersionUID = 4422425950935124621L;
	int id;
	 String name;
	 double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
