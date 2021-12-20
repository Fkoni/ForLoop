package day16_forLoop;

import java.util.Scanner;

public class C06_forLoop {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak 
		// girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.

		
	      	Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
	        double num = scan.nextDouble();
	        int sayi=(int) num;
	        
	       
	            for (int i = 1; i <= num; i++) {
	                
	                if (i%3==0 || i%5==0) {
	                    System.out.print(i + " ");
	                }
	            }
	            scan.close();
	            
	        }
         
	        
	    }
	