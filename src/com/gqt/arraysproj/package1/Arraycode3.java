package com.gqt.arraysproj.package1;

import java.util.Scanner;

public class Arraycode3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of the school:");
		int sch = sc.nextInt();
		System.out.println("Enter the count of the classes:");
		int cls = sc.nextInt();
		System.out.println("Enter the count of the students:");
		int stu = sc.nextInt();
		int arr[][][]= new int[sch][cls][stu];
		//storing of data
		for(int i=0;i<sch;i++) {
			System.out.println("Inside school :"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("inside class no:"+(j+1));
				for(int k=0;k<stu;k++){
					System.out.println("enter the marks of the students no:"+(k+1));
			arr[i][j][k]=sc.nextInt();
		}
		}
		}
		//Fetching data
		for(int i=0;i<sch;i++) {
			System.out.println("inside school:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("inside class no:"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("the marks of the student no:"+(k+1)+"is ="+arr[i][j][k]);
					
				}
			}
		}
		

	}
}

