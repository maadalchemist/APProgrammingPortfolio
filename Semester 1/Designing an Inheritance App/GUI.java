public class GUI {
    public float x;
    public float y;
    private boolean follow_screen;

    public GUI() {  this.x = 0;   this.y = 0;   this.follow_screen = false;  }
    public GUI(float x, float y) {  this.x = x;   this.y = y;   this.follow_screen = false;  }
    public GUI(float x, float y, boolean follow_screen) {  this.x = x;   this.y = y;   this.follow_screen = follow_screen;  }

    // Getter Methods
    public boolean is_follow_screen() {  return this.follow_screen;  }
    // Setter Methods
    public void follow_screen(boolean follow_screen) {  this.follow_screen = follow_screen;  }
    //Member Methods
    public void draw() {}
}
