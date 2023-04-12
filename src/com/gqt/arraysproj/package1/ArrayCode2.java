package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class ArrayCode2 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the count of the classes:");
				int cls = sc.nextInt();
				System.out.println("Enter the count of the students:");
				int stu = sc.nextInt();
				int arr[][]= new int[cls][stu];
				//storing of data
				for(int i=0;i<cls;i++) {
					System.out.println("Inside class :"+(i+1));
					for(int j=0;j<stu;j++) {
						System.out.println("enter marks of Students no:"+(j+1));
					arr[i][j]=sc.nextInt();
				}
				}
				//Fetching data
				for(int i=0;i<cls;i++) {
					System.out.println("inside class:"+(i+1));
					for(int j=0;j<stu;j++) {
						System.out.println("the marks of student no:"+(j+1)+"is :"+arr[i][j]);
					}
				}
				

			}
	}

