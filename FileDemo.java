package FileHandling;
import java.io.*;
public class FileDemo 
{
	public static void main(String[] args) throws Exception 
	{
		File f =new File("D:\\SAI KUMAR NAIK.txt");
		if(f.createNewFile()) 
		{
			System.out.println("File created successfully");
		}
		else 
		{
			System.out.println("File not created");
		}
		String data = "101,sai,jammalamadugu,india";
		FileWriter fw = new FileWriter("DemoFile.txt");
		fw.write(data);
		System.out.println("Data is written successfully");
		fw.close();
		FileReader fr = new FileReader(f);
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.println((char)ch);
		}
		System.out.println("successfully completed reading data from file");
		String data1 = "This data is appended:  ";
		FileWriter fw1 = new FileWriter(f,true);
		fw1.write(data1);
		System.out.println("Data appended Successfully.");
		fw1.close();
	}
		
}
