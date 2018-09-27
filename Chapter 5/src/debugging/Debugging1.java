package debugging;
import javax.swing.JOptionPane;
public class Debugging1
{


public static void main(String args[]) throws Exception
// FixDebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
   {
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      String usersChoiceString;
   double usersChoice;
      double bill = 0.0;
      usersChoiceString = JOptionPane.showInputDialog(null,
         "Order please/n1 - Burger\2 - Hotdog" +
         "\n3 - Grilled cheese\n4 - Fish sandwich");
      usersChoice= Integer.parseDouble(usersChoiceString);
      if (usersChoice = (1 | usersChoice) == 2)
         bill = bill + HIGH_PRICE;
      else
         bill = bill + MED_PRICE;
      usersChoiceString = JOptionPane.showInputDialog(null,
          "Fries with that?\n1 - Yes\n2 - No");
      usersChoice = Integer.parseInt(usersChoiceString);
 
	if (usersChoice =  bill = bill + LOW_PRICE);
      JOptionPane.showMessageDialog(null,"Bill is " + bill);

}
}