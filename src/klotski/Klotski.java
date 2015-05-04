
package klotski;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;

// Define the pixels of one Unit
// You may change the size of the block
class Unit {
  static final int W = 100; 
  static final int H = 100;
}

// Define a Board with 5 X 4 Unit
class Board {
  public static final int H = 5; 
  public static final int W = 4; 
}

class Klotski {
    
 void initScene()
  {
    JFrame frame=new JFrame("Klotski");
     
    frame.getContentPane().setPreferredSize(new java.awt.Dimension(Board.W*Unit.W + 0,Board.H*Unit.H));
    frame.getContentPane().setLayout(null);
 
    JPanel gameBoard = new JPanel();   
    gameBoard.setSize(new java.awt.Dimension(Board.W*Unit.W,Board.H*Unit.H));
 
    gameBoard.setBackground(Color.LIGHT_GRAY);
    gameBoard.setBorder(BorderFactory.createLoweredBevelBorder());
    frame.setLocation(50,100);
    frame.add(gameBoard);
    frame.setResizable(false);
    frame.pack();
 
    gameBoard.setLayout(null);
 
    /*  add block  soon  */
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( ()->new Klotski().initScene() );
    }
    
}
