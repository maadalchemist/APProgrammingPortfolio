import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent {
  private int x, y, w, h;

  public RectangleComponent(int _x,int  _y,int  _w,int  _h){
    this.x = _x;
    this.y = _y;
    this.w = _w;
    this.h = _h;
  }

  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    Rectangle box = new Rectangle(x, y, w, h);
    g2.draw(box);
  }
}
