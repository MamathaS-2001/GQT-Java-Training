package Pattern;
import java.util.Scanner;

public class GRNsir {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size");
				int n = sc.nextInt();

				for(int i=0;i<n;i++) {
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

					//logic for R
					for(int j=0;j<n;j++) {
						if(j==0||i==0&&j<=(n/2)||j==(n/2)&&i<=(n/2)||i==(n/2)&&j<=n/2||(i-j)==(n/2)) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.print("   ");
					//Logic for N
					for(int j=0;j<n;j++) {
						if(j==0||i==j||j==n-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.print("     ");
					//Logic for A
					for(int j=0;j<n;j++) {
						if(j==0||j==(n/2)||i==0 && j<=(n/2)||i==(n/2)&&j<=(n/2)) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					
					//Logic for R
					for(int j=0;j<n;j++) {
						if(j==0||i==0&&j<=(n/2)||j==(n/2)&&i<=(n/2)||i==(n/2)&&j<=n/2||(i-j)==(n/2)) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					
					//Logic for E
					for(int j=0;j<n;j++) {
						if(j==0||i==0&&j<=(n/2)||i==(n/2)&&j<=(n/2)||i==(n-1)&&j<=(n/2)) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					
					//Logic for N
					for(int j=0;j<n;j++) {
						if(j==0||i==j||j==n-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.print("     ");
					//Logic for D
					for(int j=0;j<n;j++) {
						if(j==0||(j==(n/2)&&i!=0&&i!=(n-1))||(i==0&&j<(n/2))||(i==(n-1)&&j<(n/2))) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					
					//Logic for R
					for(int j=0;j<n;j++) {
						if(j==0||i==0&&j<=(n/2)||j==(n/2)&&i<=(n/2)||i==(n/2)&&j<=n/2||(i-j)==(n/2)) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					
					//Logic for A
					for(int j=0;j<n;j++) {
						if(j==0||j==(n/2)||i==0 && j<=(n/2)||i==(n/2)&&j<=(n/2)) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					
					System.out.print("       ");
					System.out.println();
				}
			}
}