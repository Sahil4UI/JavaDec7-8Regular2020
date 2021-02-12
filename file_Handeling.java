import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_Handeling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//			File obj = new File("myFile.txt");
//			if (obj.createNewFile()) {
//				System.out.println("file created.... : "+obj.getName());
//			}
//			else {
//				System.out.println("File already exists");
//			}
		
//		FileWriter obj = new FileWriter("myFile.txt");
//		
//		obj.write("Hello EveryOne");
//		obj.close();
//		System.out.println("File Successfully WEritten");
		
		File obj = new File("myFile.txt");
		Scanner sc = new Scanner(obj);
		System.out.println("file name : "+obj.getName());
		System.out.println("file path : "+obj.getAbsolutePath());
		System.out.println("file size : "+obj.length());
		while (sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);
		}		
	}

}
