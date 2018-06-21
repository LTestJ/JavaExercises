package problem_set1;

public class AmericanFlag {

		public static void main(String[] args) {
		String line1 = "* * * * * * =================================="
				+ "\n * * * * *  ==================================";
		String line2 = "==============================================";
		System.out.println("American Flag: \n");
		
		for (int i = 0; i < 4; i++) {
		System.out.println(line1);
		}
		System.out.println("* * * * * * ==================================");
		for (int i = 0; i < 6; i++) {
		System.out.println(line2);
		}
		}
}
