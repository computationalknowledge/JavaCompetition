import java.util.*;

// take all the numbers entered by user:
// output the average:

public class MainApplication {
	public static void main(String[] args) {
		CalculateNumbers c = new CalculateNumbers();
		int[] results = new int[5];
		results = c.GetUserInput();
		System.out.println(c.findAverage(results));

	}
}

class CalculateNumbers {
	Scanner sc = new Scanner(System.in); // System.in is a standard input stream

	int[] userInput = new int[5];

	public int[] GetUserInput() {
		int counter = 0;
		int currentValue = -1;
		System.out.println("enter some numbers: enter -1 to finish:");
		currentValue = sc.nextInt();

		while (currentValue >= 0) {
			userInput[counter] = sc.nextInt();
		}
		return userInput;
		}
		
	public float findAverage(int[] a){
		float sum = 0;
		for ( int i = 0 ; i<a.length ; i++ ) {
			sum += a[i];
		}
		return sum / a.length;	
	}
}
