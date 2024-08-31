package project4;
import javax.swing.*;

public class guess {

	public static void main (String[] args) {
		//declare the variables
		int num; //variable to store the random number
		int guess; //variable to store the number guessed by the user
		int diff; //variable to store the absolute value
		int count = 5; //variable to store the number of tries 
		String strGuess;
		boolean done; //boolean variable to control the loop
	
		//generate random number
		num = (int) (Math.random() * 100);
		done = false; 
		while (!done) { 
		
		if (count == 5) {
		JOptionPane.showMessageDialog(null, "Random number generated: " + num);
		}
		
		//ask the user for input 
		strGuess = JOptionPane.showInputDialog("\nGuess a number between 1 and 100: ");
		guess = Integer.parseInt(strGuess); System.out.println();
		
		//calculation
		diff = Math.abs(num-guess);
		
		//if diff is 0 then the user guessed the correct number 
		if (diff == 0) {
		JOptionPane.showMessageDialog(null,"You guessed the correct number! - Congratulations, you won");
		done = true;
		System.exit(0);
		} //end of true
		
		//if diff is greater than or equal to 50
		else if (diff >=50)
		{
		if (guess>num)
			JOptionPane.showMessageDialog(null,"Your guess is much higher than the number. \nGuess again!");
		else
			JOptionPane.showMessageDialog(null,"Your guess is much lower than the number. \nGuess again!");
		}

		//if diff is greater than or equal to 30 and less than 50
		else if ((diff >=30)&&(diff<50))
		{
		if (guess>num)
			JOptionPane.showMessageDialog(null,"Your guess is higher than the number. \nGuess again!");
		else
			JOptionPane.showMessageDialog(null, "Your guess is lower than the number. \nGuess again!");
		}
		
		//if diff is greater than or equal to 15 and less than 30
		else if ((diff >=15)&&(diff<30))
		{
		if (guess>num)
			JOptionPane.showMessageDialog(null,"Your guess is moderately higher than the number. \nGuess again!");
		else
			JOptionPane.showMessageDialog(null, "Your guess is moderately lower than the number. \nGuess again!");
		}
		
		//if diff is greater than 0 and less than 15
		else if ((diff>0)&&(diff<15))
		{
		if (guess>num)
			JOptionPane.showMessageDialog(null,"Your guess is somewhat higher than the number. \nGuess again!");
		else
			JOptionPane.showMessageDialog(null, "Your guess is somewhat lower than the number. \nGuess again!");
		}
		
		//exit - user exceeds number of tries
		count--; // count = count - 1 
		if (count<=0)
		{
		JOptionPane.showMessageDialog(null, "Sorry you lost, you are out of guesses!");	
		System.exit(0);
		}
		
		} //end while
	} //end of main
}//end of class
