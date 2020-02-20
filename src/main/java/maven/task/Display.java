package maven.task;

import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
			
		System.out.println("Enter the principle amount");
		double principle = sc.nextDouble();
		System.out.println("Enter the rate of interest");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Enter the time period");
		float time = sc.nextFloat();
		
		while(flag){
			System.out.println("Enter 1 to calculate Simple Interest");
			System.out.println("Enter 2 to calculate Compound Interest");
		
			int choice = sc.nextInt();
			char c;
			CalculateInterests ci = new CalculateInterests();
		
			switch(choice){
				case 1:
					System.out.println("Simple Interest : "+ci.SimpleInterest(principle, time, rateOfInterest));
					System.out.println("Do you want to continue? (y/n)");
					c = sc.next().charAt(0);
					if(c == 'n' || c == 'N'){
						flag = false;
						System.out.println("Thank You!!");
					}
					break;
				case 2:
					System.out.println("Compound Interest : "+ci.CompundInterest(principle, time, rateOfInterest));
					System.out.println("Do you want to continue? (y/n)");
					c = sc.next().charAt(0);
					if(c == 'n' || c == 'N'){
						flag = false;
						System.out.println("Thank You!!");
					}
					break;
				default:
					System.out.println("Please enter a valid number!");
			}
		}
	}
}
