
/*
 * Ben Bovi
 * Quarter Back passer rating class
 */
import java.util.Scanner;

public class QBrating {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		//Input is received.
		System.out.println("Number of completions: ");
		int comp = in.nextInt();
		
		System.out.println("Number of passing yards: ");
		int yds = in.nextInt();
		
		System.out.println("Number of touchdown passes: ");
		int td = in.nextInt();
		
		System.out.println("Number of interceptions: ");
		int intcps = in.nextInt();
		
		System.out.println("Number of passing attempts: ");
		int attempts = in.nextInt();
		
		//making sure to close the scanner
		in.close();
		
		double a = ((comp/attempts)-0.3)*5;
		double b = ((yds/attempts)-3)*0.25;
		double c = (td/attempts)*20;
		double d = 2.375-((intcps/attempts)*25);
		
		//This is the passer rating calculation.
		double passer_rating = ((a+b+c+d)/6)*100;
		System.out.println("Passer Rating: "+passer_rating);
	}
}
