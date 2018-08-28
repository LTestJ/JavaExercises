package problem_set2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClassiscBufferedWriter {
	//buffered writer does not use bytes
	//Buffered Writer writes directly using characters
	private static final String FILENAME = 
	"C:\\Users\\josep\\src\\JavaExercises\\problem_set2\\BufferedWriter.txt";
	//"E:\\test\\filename.txt";
	public static void main(String[] args) {
		// cannot have multiple lines//
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = "\1st line \n"
					+ "\nSecond line \n"
					+ "\n third line \n";

			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();
			}
		}	
	}	
}
