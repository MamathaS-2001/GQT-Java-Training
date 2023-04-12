package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class ArrayCode7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of University:");
		int uni =sc.nextInt();
		int arr[][][][]=new int[uni][][][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of college inside university:"+(i+1));
			arr[i]=new int[sc.nextInt()][][];	
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the university no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of classess inside college:"+(j+1));
				arr[i][j]=new int[sc.nextInt()][];
			}
		}
	
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the university no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside college no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the count of Students inside class:"+(k+1));
				arr[i][j][k]=new int[sc.nextInt()];
			}
		}
		}
		
		

		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the university no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside college no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Inside class no :"+(k+1));
				for(int l=0;l<arr[i][j][k].length;l++) {
					System.out.println("Enter the marks of the students no:"+(l+1));
				arr[i][j][k][l]=sc.nextInt();
			}
		}
		}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the university no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside college no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Inside class no :"+(k+1));
				for(int l=0;l<arr[i][j][k].length;l++) {
					System.out.println(" the marks of the students no:"+(l+1)+"is ="+arr[i][j][k][l]);
			}
		}
		}
		}
				
		
	}

}



/* uni	-	   college	--	  class	-- 	students
 *
 * 	RV			3   1		 4		->	5
 * 				    2 	     4		->	5
 * 				    3	 	 4		->	5	
 * 
 * 
 *  VR			2  1		 3		->  6
 * 				   2		 3		->  6
 * 
 */
