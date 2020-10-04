package assignment8;

public class PersonMainTest {

	public static void main(String args[]) {
	Person p = new Person("ABC", 8, 4, 1999);
	Person p1 = new Person("DEF", 12, 6 , 1996);
	
	p.display();
	p1.display();
	
	 p1.olderOne(p);
	}
	
}
