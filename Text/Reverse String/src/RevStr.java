import java.util.Scanner;

public class RevStr {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String inputString = input.nextLine();
		String reversedString = new StringBuilder(inputString).reverse().toString();
		System.out.println(reversedString);
		input.close();
		
	}
}
