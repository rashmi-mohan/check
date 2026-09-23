package com.example.maven_github_demo1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + difference);

        sc.close();
    }

	public Integer add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public Integer subtract(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}
}

