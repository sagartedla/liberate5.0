package pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writetextfile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
FileWriter fw = new FileWriter("D:\\Test.txt");
BufferedWriter bw = new BufferedWriter(fw);
//bw.write("sample test");
//bw.flush();
//bw.newLine();
//bw.write("sample test new line");
//bw.flush();
for(int i=0;i<11;i++)
{
bw.write("sample text"+i);
bw.flush();
bw.newLine();
}
	}

}
