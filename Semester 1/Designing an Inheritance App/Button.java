public class Button extends GUI {
    public float width;
    public float height;
    private boolean clicked;

    public Button() {  this.x = 0;  this.y = 0;  this.width = 0;  this.height = 0;  this.clicked = false;  }
    public Button(float x, float y) {  this.x = x;  this.y = y;  this.width = 0;  this.height = 0;  this.clicked = false;  }
    public Button(float x, float y, float width, float height) {  this.x = x;  this.y = y;  this.width = width;  this.height = height;  this.clicked = false;  }

    public boolean mouse_over() {  return true;  }
    public void click() {}

}
