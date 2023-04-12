package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class JaggedArrayCode5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of the classess:");
		int cls = sc.nextInt();
		int arr[][] = new int[cls][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of the Students inside class no:"+(i+1));
			arr[i]=new int[sc.nextInt()];
		}
			
		for(int i=0;i<arr.length;i++) {
				System.out.println("Inside class no:"+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the marks  of the Students no:"+(j+1));
					arr[i][j]=sc.nextInt();
					
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" the marks  of the Students no:"+(j+1)+"is="+arr[i][j]);
		}
	
	}
		
	}

}



/*
class 	students
0 			3
1 			4	
2			5
*/
