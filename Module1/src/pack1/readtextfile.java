package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readtextfile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
FileReader fr = new FileReader("D:\\Test.txt");
BufferedReader br = new BufferedReader(fr);
String x = " ";
x=br.readLine();
//System.out.println(x);
while((x=br.readLine())!=null)
{
	System.out.println(x);
}
	}

}
