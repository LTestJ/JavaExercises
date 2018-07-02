package problem_set2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileContents {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);              
        System.out.println("Input your file name: ");        
        String fileName = sc.next(); 
        sc.close();        
        String content = new String(Files.readAllBytes(Paths.get(fileName)));
        System.out.println(content);
        
	}
}
