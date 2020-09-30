// This program is to check if three numbers form a Pythagorean Triplet or not.
// We are required to check if a given set of numbers is a valid pythagorean triplet.
// Take as input three numbers a, b and c.
// Print true if they can form a pythagorean triplet and false otherwise.


import java.util.Scanner;

public class Pythagorean_Triplets {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int max = a;
		if(b >= max) {
			max = b;
		}
		
		if(c >= max) {
			max = c;
		}
		
		if(max == a) {
			boolean flag = ((b * b + c * c) == (a * a));
			System.out.println(flag);
		}
		if(max == b) {
			boolean flag = ((a * a + c * c) == (b * b));
			System.out.println(flag);
		}
		if(max == c) {
			boolean flag = ((b * b + a * a) == (c * c));
			System.out.println(flag);
		}
	}

}