package Assignment10;

import java.io.File;
import java.util.Scanner;

public class FileExist {

	public boolean fileExist(String filepath) {
	File f = new File(filepath);
	if(f.exists()) {
		return true;
	}
	else {
		return false;
	}
	}

}
