import java.util.*;
import java.lang.*;
import java.io.*;

class Calculator {
    public static int calc(int x, int a, int b) {
        int results = 0;
	switch(x) {
	    case 1:
                results = a + b;
		System.out.println("Add: " + results);
		break;
	    case 2:
		results = a - b;
		System.out.println("Sub: " + results);
		break;
	    case 3:
		results = a * b;
		System.out.println("Mul: " + results);
		break;
	    case 4:
		if(b != 0) {
                    results = a / b;
		    System.out.println("Div: " + results);
		    break;
                }
        }
	return results;
    }

    public static void main(String[] args) {
        System.out.println("---- Calculator ----");
	Scanner sc = new Scanner(System.in);
	
	int cnt = 0; 
	int result = 0;
	while(true) {
	    if(cnt == 0) {
	        System.out.println("1. add  2. sub  3. mul  4. div");
	        int choice = sc.nextInt();
	    
	        System.out.println("Enter two numbers");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        
		result = calc(choice, num1, num2);
		cnt++;
            }

	    else {
	        System.out.println("1. add  2. sub  3. mul  4. div");
		int choice = sc.nextInt();

		System.out.println("Use the previous results?  1. yes  2. no");
		int select = sc.nextInt();

		if(select == 1) {
		    System.out.println("Enter the number");
		    int num = sc.nextInt();
                    
		    result = calc(choice, result, num);
	        }
		
		else {
		    System.out.println("Enter two numbers");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    result = calc(choice, num1, num2);
	        }
		cnt++;
	    }

	    System.out.println("finish the calculation?  1. yes  2. no");
	    if(sc.nextInt() == 1) {
		System.out.println("finish");
                sc.close();
		System.exit(0);
	    }
        }
    }
}
