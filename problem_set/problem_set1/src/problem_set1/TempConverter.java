package problem_set1;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter temparature in Faraneheit: ");
		float temperature = scan.nextFloat();	
		System.out.println("Temp in Degree celsius = " + tempCel(temperature));
	}	
	public static float tempCel(float temperature) {
		temperature = ((temperature - 32) * 5) / 9;
		return temperature;
	}
}
