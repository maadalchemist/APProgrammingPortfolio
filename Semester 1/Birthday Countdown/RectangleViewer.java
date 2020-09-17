import javax.swing.*;

public class RectangleViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400,180);
    frame.setTitle("Birthday Countdown");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    RectangleComponent component = new RectangleComponent(10,10,10,10);
    frame.add(component);

    frame.setVisible(true);
  }

  public void drawAxis() {
    
  }
}
