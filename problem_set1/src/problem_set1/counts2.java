package problem_set1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class counts2 {
	
		public static int letters = 0;
	  	public static int lowerCase = 0;
	    public static int numberCount = 0;
	    public static int specialCharCount = 0;
	    public static int spaceCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String givenExample = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        System.out.print("Enter your string here: \n");
        for (char c : dataIn.readLine().toCharArray()) {
            if (Character.isLetter(c)){ letters++; }
            else if (Character.isDigit(c)){ numberCount++;}
            else if (Character.isWhitespace(c)){ spaceCount++;}
            else { specialCharCount++; }
        }
	    System.out.printf("Your string contains: %d letters, %d digits, %d spaces and %d special characters.\n\n", 
	        letters, numberCount, spaceCount, specialCharCount);
	    }
}
