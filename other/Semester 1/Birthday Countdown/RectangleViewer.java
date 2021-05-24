import javax.swing.*;
import java.awt.geom.Line2D.Double;

public class RectangleViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400,210);
    frame.setTitle("Birthday Countdown");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    GraphicsComponent graphics = new GraphicsComponent();
    frame.add(graphics);

    frame.setVisible(true);
  }
}
