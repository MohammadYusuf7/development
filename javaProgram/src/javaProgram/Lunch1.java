package javaProgram;

public class Lunch1 {

	public static void main(String[] args) {

		int n = 10;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j == (n-1)/2) {
					System.out.print("*");

				} else {
					System.out.print(" ");

				}
			}
			for (int j = 0; j<n; j++) {

				if (i==j || j==0 || j == n-1) {

					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}

			// E
			for (int j= 0; j<n; j++) {

				if ((i==0 &&j<n-1  &&j>n/4)||(i==n-1 && j<n-1 &&j>n/4 )||(i==(n-1)/2 && j<n-1 && j>n/4)||j==n/4) {
					
					System.out.print("*");
					
				} else {
					System.out.print(" ");
				}
			}

			// u
			
			for (int j = 0; j < n; j++) {

				if (j ==0 && i<n-1  || j == n- 1 && i<n-1 || (i == n-1 && j>0 && j<(n-1))) {

				//	j==0 && i>0 && i<n-1 
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			
			//R
			for (int j = 0; j < n; j++) {

				if (j ==n/4 && i>0  || (i ==0  && j>n/4 && j<n-1 ) || j == n-1 && i<(n-1)/2 && i>0 || i==(n-1)/2 && j>=(n-1)/2 && j<n-1  || i==j && i>n/2 && j>n/2 ) {

				//	j==0 && i>0 && i<n-1 
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			
			for (int j = 0; j < n; j++) {

				if (j ==n/4&& i>0 && i<n-1 || j == n-1 && i>0 && i<n-1   || i==0 && j>n/4 &&j<n-1 || i==n-1 && j>n/4 &&j<n-1 ) {

				//	(i == n-1 && j>0 && j<(n-1
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			
			for (int j = 0; j<n; j++) {

				if (i==j && i>n/4 && j>n/4|| j==n/4 || j == n-1) {

					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}

	}

