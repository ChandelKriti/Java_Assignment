package assignment12;

import java.io.File;
//import java.io.FileFilter;

public class Subdirectories {

		public static void main(String[] args) {
			File dir = new File("C:\\Program Files\\Java\\jdk1.8.0_162");
			/*// Filter sub-directories using anonymous class
			File[] subDirs1 = dir.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
			});

			System.out.println("-------------Using anonymous class------------");
			for (File file : subDirs1) {
				System.out.println(file.getName());
			}*/

			// Filter sub-directories using Lambda expression
			File[] subDirs2 = dir.listFiles((file)->{return file.isDirectory();});
			for (File file : subDirs2) {
				System.out.println(file.getName());
			}
		}
}
