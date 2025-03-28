package hw2;

public class Homework2 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0; 
        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        
        // 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
        int product = 1;
        for (int i = 1; i <= 10; i++) {
        	product *= i;
        }
        System.out.println(product);
        
        //請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
        int product2 = 1;
        int count = 1;
        while(count <= 10) {
        	product2 *= count;
        	count++;
        }
        System.out.println(product2);
        // 請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
        for(int i = 1; i<=10; i++) {
        	System.out.print(i * i + "\t");
        }
        
        int numCount = 0;
        for(int i = 1; i <=49; i++) {
        	String str = i + "";
        	if(!str.contains("4")) {
        		System.out.println("lottery num: " + str);
        		numCount++;
        	}
        }
        System.out.println(numCount);
        // 請設計一隻Java程式,輸出結果為以下:
        for(int i = 10; i >= 1; i--) {
        	for(int j = 1; j<= i; j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        }

        // 請設計一隻Java程式,輸出結果為以下:
        char alphbet = 'A';
        for(int i = 1; i <= 6; i++) {
        	
        	for(int j = 1; j<= i; j++) {
        		
        		System.out.print(alphbet);
        	}
        	System.out.println();
        	alphbet++;
        }
	}
}
