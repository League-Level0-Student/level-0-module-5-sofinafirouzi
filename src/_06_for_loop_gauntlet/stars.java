package _06_for_loop_gauntlet;

public class stars {
public static void main(String[] args) {
	

System.out.println("Star Staircase");

for(int i = 1; i<7; i++) {
	for(int a = 0; a<i; a++) {
		System.out.print("" + "*" + " ");
	}
	System.out.println();
}// end for
	
	
}//main
}
