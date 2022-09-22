package FileHandling;
import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) throws Exception 
	{
		FileWriter fw =new FileWriter("Sai.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = "101,Sai,jammalamadugu,Kadapa";
		bw.write(s);;
		bw.newLine();
		char[] ch1 = {'a','b','c','d'};
		bw.write(ch1);
		bw.flush();
		bw.close();
		FileReader fr = new FileReader("Sai.txt");
	    BufferedReader br = new BufferedReader(fr);
		String Line = br.readLine();
		while(Line!=null)
		{
			System.out.println(Line);
			Line=br.readLine();
		}
		br.close();
		String data1 = "This data is appended:  ";
		FileWriter fw1 = new FileWriter("Sai.txt",true);
		fw1.write(data1);
		System.out.println("Data appended Successfully.");
		fw1.close();
	}

}
