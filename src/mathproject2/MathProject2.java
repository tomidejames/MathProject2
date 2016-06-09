/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproject2;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomide James
 */
public class MathProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AdvanceMath advanceMath = new AdvanceMath();
        
        String x = JOptionPane.showInputDialog("Please enter a Number");
        int a = Integer.parseInt(x);
        double Squareroot = advanceMath.squareRoot(a);
        JOptionPane.showMessageDialog(null, "The Suareroot of " +  " "  +a + " " +"is" + " " + Squareroot);
        
        String y = JOptionPane.showInputDialog("Please enter a Number");
        int b = Integer.parseInt(y);
        int square = advanceMath.Square(a);
        JOptionPane.showMessageDialog(null, "The Square of" + " "  + b  + " " + "is" + " " + square);
        
        String z1 = JOptionPane.showInputDialog("Please enter an initial Number");
        String z2 = JOptionPane.showInputDialog("Please enter a second Number");
        int c = Integer.parseInt(z1);
        int d = Integer.parseInt(z2);
        int e = advanceMath.multiplyAndRaise(c, d);
        JOptionPane.showMessageDialog(null, "The result of Multyplying" + " " + c + " " + "and" + " " + d+ " " + "AND" + " "+ "Squaring the result is" + " " + e );
        
        
    }
    
}
