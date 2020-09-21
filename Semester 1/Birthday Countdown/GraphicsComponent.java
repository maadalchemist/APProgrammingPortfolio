import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

public class GraphicsComponent extends JComponent {
  private int x, y, w, h;

  public GraphicsComponent(){}

  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    // Draw Axis
    Line2D.Double xAxis = new Line2D.Double(30, 130, 370, 130);
    Line2D.Double yAxis = new Line2D.Double(30, 10, 30, 130);
    g2.draw(xAxis);
    g2.draw(yAxis);
    Line2D.Double ticMarks;
    for (int i = 0; i <= 7; i++) {
      ticMarks = new Line2D.Double(30 + (48*i), 125, 30 + (48*i), 135);
      g2.draw(ticMarks);
      g2.drawString(Integer.toString(i*50), (30 + (48*i)) - (5 * (Boolean.compare(i*50 >= 10, false))) - (5 * (Boolean.compare(i*50 >= 100, false))), 150);
    }
    g2.drawString("Days", 185, 165);

    // draw FamilyMember
    FamilyMember[] members = new FamilyMember[6];
    members[0] = new FamilyMember("Emily",   1919, 10,  1);
    members[1] = new FamilyMember("Michael", 1919,  5, 15);
    members[2] = new FamilyMember("Joseph",  2019, 12, 17);
    members[3] = new FamilyMember("Lillian", 2019,  8, 13);
    members[4] = new FamilyMember("Isaac",   2019,  6, 16);
    members[5] = new FamilyMember("Emmy",    2019,  3, 23);

    for (int i = 0; i < members.length; i++) {
      Day today = new Day();
      int daysTill = today.daysFrom(members[i].birthday) % 365;
      g2.setColor(Color.BLACK);
      g2.drawString(members[i].name + " (" + Integer.toString(daysTill) + ')', daysTill + 35, 23 + (110/6 * i));
      Rectangle box = new Rectangle(30, 16 + (110/6 * i), daysTill, 7);
      g2.setColor(Color.RED);
      g2.fill(box);
      g2.setColor(Color.BLACK);
    }
    g2.drawString("Days Until Everyones Birthday",200-(29*3), 10);

  }
}
