package exercise;

import java.util.Scanner;

public class binaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        System.out.print(Converter.toBinary(x));
	    }

	}

	class Converter{
	    
	    public static long toBinary(int num){
	        String str = "";
	        int div = num;
	        int remainder = 0;
	        while(div > 0){

	        	remainder = div % 2;
	        	str = remainder + str;
	            div /= 2;
	            System.out.println("div: " + div);
	            System.out.println("remainder: "+ remainder);
	            System.out.println("str: " + str);
	        }
	        
//	        return Integer.parseInt(str);
	        return Long.parseLong(str);
	    }

	}