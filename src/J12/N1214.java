package J12;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class N1214 {
	public static void main(String[] args) throws IOException  {
		File file = new File("E:/sd.java");
		Reader reader=new FileReader(file);
		char[] c=new char[(int) file.length()];
		reader.read(c);
//		String d=new String(c);
		File file1=new File("F:/sd.java");
		Writer writer=new FileWriter(file1);
		writer.write(c);
		writer.close();
		reader.close();
	}
}