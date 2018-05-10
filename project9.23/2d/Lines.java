import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.util.Random;


public class Lines extends JPanel {

  public void paintComponent(Graphics g) {
      super.paintComponent(g);

      Graphics2D g2d = (Graphics2D) g;

      g2d.setColor(Color.blue);

      Dimension size = getSize();
      Insets insets = getInsets();

      int w =  size.width - insets.left - insets.right;
      int h =  size.height - insets.top - insets.bottom;

	  int xres = size.width / 10;
	  int yres = size.height / 10;

      int y = 0;
	  int x1 = 0;
	  int x2 = size.width;
      for (int i=0; i<10; i++) {
		  y = i * yres;
          g2d.drawLine(x1, y, x2, y);
      }
  }

  public static void main(String[] args) {

      JFrame frame = new JFrame("Lines");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new Lines());
      frame.setSize(250, 200);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
  }
}
