package problem_set1;

public class AmericanFlag {

	public static void main(String[] args) {
		String line1 = "* * * * * * =================================="
		+ "\n * * * * *  ==================================";
		String line2 = "==============================================";
		System.out.println("American Flag: \n");
		stars1(line1, line2);
		//System.out.println(stars1);		
	}	
	public static void stars1(String line1, String line2) {			
		for (int i = 0; i < 4; i++) {
		System.out.println(line1);
		}
		System.out.println("* * * * * * ==================================");
		for (int i = 0; i < 6; i++) {
		//\u000d System.out.println(line2);
		}
	}
}
