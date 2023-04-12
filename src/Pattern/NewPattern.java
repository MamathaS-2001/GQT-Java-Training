package Pattern;

import java.util.Scanner;

public class NewPattern {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size");
			int n = sc.nextInt();
			for(int i=0;i<=n;i++) {
				//logic for I
				for(int j=1;j<=n;j++) {
					if(i==1 || i==n ||j==n/2 ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("         ");
				
				
				//logic for L
				for(int j=1;j<=n;j++) {
					if(j==1 || (i==n && j<=n )) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				
				
				//logic for O
				for(int j=1;j<=n;j++) {
					if((j==1 && i!=0 && i!=n && j!=n ) || (j==n && i!=0 && i!=n  ) || (i==1 && j!=0 && j!=n ) || (i==n && j!=0 && j!=n )) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("    ");
				
				
				//logic for V
				for(int j=1;j<=n;j++) {
					if(i==j || i/16+j==n) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("    ");
				
				
				//logic for E
				for(int j=0;j<n;j++) {
					if(j==0||i==0&&j<=(n/2)||i==(n/2)&&j<=(n/2)||i==(n-1)&&j<=(n/2)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("    ");
				
				
				//logic for G
				for(int j=0;j<n;j++) {
					if(j==0||i==0||i==(n/2)&&j>=(n/2)||i==(n-1)&&j<=(n/2)||
							j==(n/2)&&i>=(n/2)||j==(n-1)&&i>=(n/2) ) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("    ");
				
				
				//logic for q
				for(int j=0;j<n;j++) {
					if((i==0 && j!=0 && j<3*n/4)   ||(i==3*n/4 && j!=0 && j<3*n/4) ||( j==0 && i!=0 && i<3*n/4) || (i==3*n/4 && i!=0 && i<3*n/4) || (i==j && i>=n/2)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("    ");
				
				
				//logic for t
				for(int j=1;j<n;j++) {
					if(i==1 || j==n/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("    ");
				System.out.println();				
			}

	}

}
