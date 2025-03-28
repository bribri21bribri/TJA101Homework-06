package hw1;

public class Homework1 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int sum = 12 + 6;
		int product = 12 * 5;
		
		// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggDozens = 200 / 12;
		System.out.println("200顆蛋等於" + eggDozens + "打");
		
		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int seconds = 256559;
		int days = seconds / (24 * 60 * 60);
		seconds = seconds % (24 * 60 * 60);
		int hours = seconds / (60 * 60);
		seconds = seconds % (60 * 60);
		int minutes = seconds / 60;
		int leftSeconds = seconds % 60;
		
		
		System.out.println(
				"256559秒為等於" +
				days + "天" +
				hours + "小時" + 
				minutes + "分" + 
				leftSeconds + "秒"
		);
		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		double circleArea = 5 * 5 * pi;
		double circumference = 5 * 2 * pi;
		System.out.println("圓面積為" + circleArea);
		System.out.println("圓周長為" + circumference);
		
		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
		int base = 1500000;
		double rate = 0.02;
		int years = 10;
		
		double total = base * Math.pow(1 + rate, years);
		System.out.println("10年後本金加利息" + total);
		
		// 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		System.out.println(5 + 5); // 正常整數相加結果為10
		System.out.println(5 + '5'); // '5'為char型別會先轉為對應符號的10進位編碼
		System.out.println(5 + "5"); // "5"為String型別會直接做串接
	}
}
