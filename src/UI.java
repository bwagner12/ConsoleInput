import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UI {
	public static void main(String[] args) {
		Adding adding = new Adding();
		int sum = 0;
		int nums[] = {0,0};
		
		// Get both integers from the user
		nums = getIntegerInput("Please intput two integers...");
				
		// Add them together
		sum = adding.add(nums[0], nums[1]);
				
		JOptionPane.showMessageDialog(null, "The sum of " + nums[0] + " and " + nums[1] + " is: " + sum);
	}
	
	public static int[] getIntegerInput(String message)
	{
		JTextField firstNum = new JTextField();
		JTextField secondNum = new JTextField();
		Object[] mess = {"First number: ", firstNum, "Second number: ", secondNum}; 
		boolean validInput = false;
		int numbers[] = {0,0};
		
		// Loop until we have valid input
		while (!validInput) {
			try {
				JOptionPane.showConfirmDialog(null, mess, message, JOptionPane.OK_CANCEL_OPTION);
				
				numbers[0] = Integer.parseInt(firstNum.getText());
				numbers[1] = Integer.parseInt(secondNum.getText());
				validInput = true;
			}
			catch (NumberFormatException e)
			{
				// Will catch and display an error when the user doesn't enter an integer value
				JOptionPane.showMessageDialog(null, "Only integers are accepted, please try again.");
			}
		}
		
		return numbers;
	}
}
