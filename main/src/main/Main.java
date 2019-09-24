package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int count = sc.nextInt();
		int out;
		if (count == 0)
			out = 0;
		else
			out = fibonacci(0, 1, count - 1);
		System.out.println(out);
	}
	public static int fibonacci(int before, int after, int count) {
		if (count == 0)
			return after;
		return fibonacci(after, after + before, count - 1);
	}
}
