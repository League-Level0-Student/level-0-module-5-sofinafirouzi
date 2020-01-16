import javax.swing.JOptionPane;

public class froloop_alotofthem {
public static void main(String[] args) {
	
	System.out.println("ingle For-Loops:");
	
	System.out.println("Numbers from 0-100");
	for(int i = 0; i<=100; i++){
		System.out.println(i);	
	}//end for 0-100
	
	System.out.println("Numbers from 100-0");
	for(int i = 100; i>=0; i--){	
		System.out.println(i);	
	}//end for 100-0

	System.out.println("Numbers from 2-100");
	for(int i = 2; i<=100; i++){	
		System.out.println(i);	
	}//end for 2-100

	System.out.println("Odd numbers from 1-99");
	for(int i = 1; i<100; i++){	
		if(i % 2 !=0) {
		System.out.println(i +" is odd");	
		}//end if
	}//end for 1-99
		
	System.out.println("Numbers from 1-500");
	for(int i = 1; i<=500; i++){
		if(i % 2 !=0) {
			System.out.println(i +" is odd");	
			}//end if
		else{
			System.out.println(i + " is even");	
		}//end else
	}//end for 1-99
	
	System.out.println("Multiples of 7 from 0-777");
	for(int i = 0; i<=777; i++) {
		if(i % 7 == 0) {
			System.out.println(i);
		}//end if
	}//end for 0-777
	
	
	for(int i=2004; i<= 2020; i++) {
	int age = i-2004;
		System.out.println("In " + i + " I was " + age + " years old.");
		
	}//end for years alive
	
	System.out.println("Nested For-Loops");
	
	System.out.println("Weird Order");
for(int i=0; i<=0; i++) {
		for(int a = 0; a <=2; a++) {
		System.out.println("" + 0 + " " + a);
	}//end for 0
		for(int b = 0; b <=2; b++) {
		System.out.println("" + 1 + " " + b);
	}//end for 0
		for(int c = 0; c <=2; c++) {
		System.out.println("" + 2 + " " + c);
	}//end for 0
	}//end for weird order 
System.out.println("3x3");
for(int i = 1; i<=3; i+=3) {
	System.out.println(i);
	for(int a = 0; a<=3;a++) {
		System.out.println("" + i +" " + (i + 1));
	}
	for(int b = 0; b<=3;b++) {
		System.out.println("" + i+" " + (i + 2));
	}
	for(int c = 0; c<=3;c++) {
		System.out.println("" + i+" " + (i + 3));
	}
	
}//end for 3x3





}//end main method
}//end main class
