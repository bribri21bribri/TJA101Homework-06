package hw3;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Homework3 h3 = new Homework3();
//		h3.printTriangle();

//		h3.guessNumber();
		
		h3.excludeLotteryNumber();
	}

	public void printTriangle() {
		Scanner sc = new Scanner(System.in);
		int[] inputArr = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Input: ");
			if (sc.hasNext()) {
				int input = sc.nextInt();
				inputArr[i] = input;
			}
		}

		if (inputArr[0] == 0 || inputArr[1] == 0 || inputArr[2] == 0) {
			System.out.println("不是三角形");
		} else if (inputArr[0] == inputArr[1] && inputArr[1] == inputArr[2]) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}
	}

	public void guessNumber() {
		int ans = (int) (Math.random() * 9);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input: ");
			if (sc.hasNext()) {
				int input = sc.nextInt();
				if(input == ans) {
					System.out.println("ans: " + ans);
					break;
				}
			}
		}
	}
	
	public void excludeLotteryNumber() {
		System.out.println("please enter hate number");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		if(sc.hasNext()) {
			int num = sc.nextInt();
			for(int i = 1; i <= 49; i++) {
				String compare = String.valueOf(i);
				if(!compare.contains(String.valueOf(num))) {
					System.out.print(compare + "\t");
					count++;
				};
			}
		}
		
		System.out.println("total selectable number: " + count);
	}
}
