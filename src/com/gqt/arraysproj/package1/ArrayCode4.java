package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class ArrayCode4 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the count of  university:");
				int uni =sc.nextInt();
				System.out.println("Enter the count of  School:");
				int scl =sc.nextInt();
				System.out.println("Enter the count of  classess:");
				int cls =sc.nextInt();
				System.out.println("Enter the count of  students:");
				int stu =sc.nextInt();
				int arr[][][][]=new int[uni][scl][cls][stu];
				
				for(int i=0;i<uni;i++) {
					System.out.println("Inside  university no:"+(i+1));
					for(int j=0;j<scl;j++) {
						System.out.println("Inside school no:"+(j+1));
						for(int k=0;k<cls;k++) {
							System.out.println("inside class no:"+(k+1));
							for(int l=0;l<stu;l++) {
								System.out.println("Enter the marks of the students no:"+(l+1));
								arr[i][j][k][l]=sc.nextInt();
							}
						}
					}
				}
					
					for(int i=0;i<uni;i++) {
						System.out.println("Inside  university no:"+(i+1));
						for(int j=0;j<scl;j++) {
							System.out.println("Inside school no:"+(j+1));
							for(int k=0;k<cls;k++) {
								System.out.println("inside class no:"+(k+1));
								for(int l=0;l<stu;l++) {
									System.out.println(" the marks of the students no:"+(l+1)+"is ="+arr[i][j][k][l]);
								}
							}
						}
					
					}
				

			}
		}

