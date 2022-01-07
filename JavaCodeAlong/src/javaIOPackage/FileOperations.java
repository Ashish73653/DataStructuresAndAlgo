package javaIOPackage;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		try {
			File file = new File("/media/ashish/New Volume/javaText/Hello.txt");
			if(file.createNewFile()) {
				System.out.println("File is created...");
			}else {
				System.out.println("File already created...");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
