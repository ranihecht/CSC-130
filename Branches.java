import java.util.Scanner; 
public class Branches {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scnr = new Scanner(System.in);

	int numX;
	numX = scnr.nextInt();
	if ((numX & 1) == 0) {
		System.out.println(numX + " is an even number");
	}
	else {
		System.out.println(numX + " is an odd number");
	}
	
	int numDays;
	numDays= scnr.nextInt();
	if (numDays == 365) {
		System.out.println("It is not a leap year");
	}
	if (numDays == 366) {
		System.out.println("It is a leap year");
	}
}
}

