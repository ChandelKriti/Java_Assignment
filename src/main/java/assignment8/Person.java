package assignment8;


import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

	private String name;
	private LocalDate dob;
	

	
	public Person(String name, int date, int month, int year) 
	{
		super();
		this.name = name;
		this.dob = LocalDate.of(year, month, date);
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String dob() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		return formatter.format(dob);
	}

	
public String age() {
	Period p = Period.between(this.dob, LocalDate.now());
	return (p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days ");
}

	public void display()
	{
		System.out.println("Name " + getName());
		System.out.println("Birth " + dob());
		System.out.println("Age " + age() );
		
	}
	
	
	
	public String olderOne(Person pn) 
	{
		if(this.dob.isBefore(pn.dob)) {
			Period p = Period.between(this.dob, pn.dob);
			//System.out.println(this.name + " is older than " + pn.name + " by " + p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + "days");
		return (this.name + " is older than " + pn.name + " by " + p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + "days");
		}
		
		else {
			Period p = Period.between(pn.dob, this.dob);
			//System.out.println(pn.name + " is older than " + this.name + " by " + p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + "days");
	return (pn.name + " is older than " + this.name + " by " + p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + "days");
		}
		
	}
}
