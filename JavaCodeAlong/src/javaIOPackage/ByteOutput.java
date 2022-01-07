package javaIOPackage;
import java.io.*;
public class ByteOutput {

	public static void main(String[] args) {
		try {
			FileOutputStream fout1 = new FileOutputStream("/media/ashish/New Volume/javaText/f1.txt");
			FileOutputStream fout2 = new FileOutputStream("/media/ashish/New Volume/javaText/f2.txt");
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			String str = "hello Ashish";
			byte arr[] = str.getBytes();
			bout.write(arr);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			System.out.println("Success...");
			bout.flush();
			bout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
