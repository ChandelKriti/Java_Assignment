package Assignment9;

public class Student {
  
	private int rollno;
	private String name;
	private int age ;
	private String course;
	
	public Student (int rollno, String name, int age, String course) throws AgeNotWithinRangeException,NameNotValidException  {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public int getAge() {

		if(this.age < 15 && this.age > 21) {
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		}
		else {
			return age;
		}
		
	}
	
	public String getName() {
		int f=0;
		for(int i=0;i<name.length();i++)
		{
			char c =name.charAt(i);
			if((c<'A' || c>'Z') && (c<'a' || c>'z'))
			{
				f=1;
				break;
			}
		}
		if(f==1) {
			throw new NameNotValidException("Name should contain alphabets only");
		}
		else {
			
			return name;
		}
		
	}
	
	
	public static void main(String args[]) {
		Student  s = new Student(1,"ABC",23,"Science");
		try {
			int ans = s.getAge();
			String ans2= s.getName();
			System.out.println(ans);
			System.out.println(ans2);
		}
		catch(AgeNotWithinRangeException e) {
			System.out.println(e.getMessage());
		}
		catch(NameNotValidException e) {
			System.out.println(e.getMessage());
		}
	}
}
