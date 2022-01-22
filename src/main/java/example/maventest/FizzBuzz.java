package example.maventest;
import java.util.Scanner;

/*
 * For a given number greater than 0 return:
	"fizz" if it is multiple of 3
	"buzz" if it is multiple of 5
 */
public class FizzBuzz {
	public String displayFizz(String inputStr) {
		
		if(inputStr!=null && isNumber(inputStr)) {
			int inputNum =Integer.parseInt(inputStr);
			if(inputNum>0&&(inputNum%3==0&&inputNum%5==0)) {
				return "fizzbuzz";
			}else if (inputNum>0&&inputNum % 3 == 0) {
				System.out.println("fizz");
				return "fizz";
			}else if (inputNum>0&&inputNum % 5 == 0) {
				System.out.println("buzz");
				return "buzz";
			}else {
				return String.valueOf(inputNum);
			}
		}else {
			return inputStr;
		}
				
	}
	
	private boolean isNumber(String input) {
		try {
			Integer.parseInt(input);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
