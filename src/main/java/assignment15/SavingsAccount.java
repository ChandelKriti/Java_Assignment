package assignment15;

import java.io.Serializable;

public class SavingsAccount implements Serializable {

	private double accBal;
	private int accId;
	private String accHolderName;
	private boolean isSalaryAcc;
	
	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public boolean isSalaryAcc() {
		return isSalaryAcc;
	}

	public void setSalaryAcc(boolean isSalaryAcc) {
		this.isSalaryAcc = isSalaryAcc;
	}

	public SavingsAccount(double accBal, int accId, String accHolderName, boolean isSalaryAcc) {
		super();
		this.accBal = accBal;
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.isSalaryAcc = isSalaryAcc;
	}
	
	public int withdraw(int accBal, int withdraw_amt) {
		if(accBal > withdraw_amt ) {
			accBal = accBal - withdraw_amt;
			return accBal;
		}
		else return 0;
	}
	
	public int deposit(int accBal, int deposit_amt) {
	accBal = accBal + deposit_amt;
	return accBal;
	}
	
	public String toString() {
        return "SavingsAccount [accBal="+accBal+",id=" + accId + ",Name=" + accHolderName + ",Salary Account=" + isSalaryAcc + "]";
    }
	
	
	public int hashCode(){
        int hashcode = 0;
        hashcode = accId*20;
        hashcode += accHolderName.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        if (obj instanceof SavingsAccount) {
        	SavingsAccount sa = (SavingsAccount) obj;
            return (sa.accHolderName.equals(this.accHolderName) && sa.accId == this.accId);
        } else {
            return false;
        }
    }

	
	
	
}
