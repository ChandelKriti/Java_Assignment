package assignment15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SavingsArrayList {

	public void FileStorage() {
		
		ArrayList<SavingsAccount> savings_account = new ArrayList<SavingsAccount>();
		
		SavingsAccount sa1 = new SavingsAccount(10000.00, 1 , "ABC", true);
		SavingsAccount sa2 = new SavingsAccount(20000.00, 2 , "DEF", false);
		SavingsAccount sa3 = new SavingsAccount(30000.00, 3 , "GHI", true);
		SavingsAccount sa4 = new SavingsAccount(40000.00, 4 , "JKL", false);
		SavingsAccount sa5 = new SavingsAccount(50000.00, 5 , "MNO", true);
		
		savings_account.add(sa1);
		savings_account.add(sa2);
		savings_account.add(sa3);
		savings_account.add(sa4);
		savings_account.add(sa5);
		
		try{
		    FileOutputStream writeData = new FileOutputStream("SavingsAccount.ser");
		    ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

		    writeStream.writeObject(savings_account);
		    writeStream.flush();
		    writeStream.close();

		}catch (IOException e) {
		    e.printStackTrace();
		}
		
		try{
		    FileInputStream readData = new FileInputStream("SavingsAccount.ser");
		    ObjectInputStream readStream = new ObjectInputStream(readData);

		    ArrayList<SavingsAccount> sa= (ArrayList<SavingsAccount>) readStream.readObject();
		    readStream.close();
		    System.out.println(sa.toString());
		}catch (Exception e) {
		    e.printStackTrace();
		}
		
		//for(SavingsAccount sa: savings_account) 
			//System.out.println(sa);
	}
}

