package problem_set2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);              
        System.out.println("Input your file name: ");        
        String fileName = sc.next(); 
        sc.close();        
        String content = "This is my new contentxx";
        Files.write(Paths.get(fileName), content.getBytes(StandardCharsets.UTF_8), 
        		StandardOpenOption.CREATE);        
	}
}
