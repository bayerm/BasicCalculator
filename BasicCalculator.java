import java.util.Scanner;

class BasicCalculator{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: "); //asks user for first number
		fnum = scan.nextDouble();
		System.out.println("Enter second num: "); //asks user for second number
		snum = scan.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}	