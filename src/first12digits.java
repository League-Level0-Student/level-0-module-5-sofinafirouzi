
public class first12digits {
public static void main(String[] args) {
	
	 int num1 = 0;
	 int num2 = 1;
	 int sum = 1;
	 for(int i = 0; i<=11; i++) {
		 System.out.println(num1 + num2);
		 sum = num1+num2;
		 num1= num2;
		 num2 = sum;
	 }//end for	 
}//end main
}
