package assignment15;

public class Parked_CarOwner_Details {

	
	private String owerName;
	private int carModel;
	private int carNO;
	private int owerMobileNo;
	private String owerAddress;
	
	public Parked_CarOwner_Details(String owerName, int carModel, int carNO, int owerMobileNo, String owerAddress) {
		super();
		this.owerName = owerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.owerMobileNo = owerMobileNo;
		this.owerAddress = owerAddress;
	}

	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	public int getCarModel() {
		return carModel;
	}

	public void setCarModel(int carModel) {
		this.carModel = carModel;
	}

	public int getCarNO() {
		return carNO;
	}

	public void setCarNO(int carNO) {
		this.carNO = carNO;
	}

	public int getOwerMobileNo() {
		return owerMobileNo;
	}

	public void setOwerMobileNo(int owerMobileNo) {
		this.owerMobileNo = owerMobileNo;
	}

	public String getOwerAddress() {
		return owerAddress;
	}

	public void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}
	
}
