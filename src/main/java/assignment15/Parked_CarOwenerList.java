package assignment15;

import java.util.ArrayList;

public class Parked_CarOwenerList {

	
	ArrayList<Parked_CarOwner_Details> parked_carList = new ArrayList<Parked_CarOwner_Details>();
	

	
	public ArrayList<Parked_CarOwner_Details> add_new_car(Parked_CarOwner_Details obj) {
		parked_carList.add(obj);
		return parked_carList;
	}
	
	public ArrayList<Parked_CarOwner_Details> remove_car(Parked_CarOwner_Details obj) {
		parked_carList.remove(obj);
		return parked_carList;
	}
	
	public int get_parked_car_location(Parked_CarOwner_Details obj) {
		return parked_carList.indexOf(obj);
	}
}
