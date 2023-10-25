/**
 *
 * @author user
 */
import javax.swing.JOptionPane;

public class SqrtException {

   public static void main(String[] args) {
       int number;
       String snum;
       snum = JOptionPane.showInputDialog(null, "Enter your value here: ", "Integer Dialog",JOptionPane.QUESTION_MESSAGE);
       number = Integer.parseInt(snum);
       try {
          if(number>=0)
           {
              JOptionPane.showMessageDialog(null, "  the square root of the value: " + Math.sqrt(number));
           }
           else
           {
              throw new ArithmeticException(" You entered an invalid integer, or the value is negative or has the wrong data type.");
           }
       } 
       catch (ArithmeticException mistake) {
        
        JOptionPane.showMessageDialog(null, "You entered an invalid integer, or the value is negative or has the wrong data type");
       }
   }
}
