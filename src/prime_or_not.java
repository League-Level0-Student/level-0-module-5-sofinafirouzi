import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Please type in a random number.");
	int number = Integer.parseInt(answer);
	for(int i=2; i<number/2 ;i++) {
		if(number % i == 0) {
			JOptionPane.showMessageDialog(null, number + " is composite");
			System.exit(0);;
		}//end if
		
	}//end for
	JOptionPane.showMessageDialog(null,  number + " is prime");
}//end main
}
