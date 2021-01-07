public class Label extends GUI {
    enum Alignment {
        LEFT,
        CENTER,
        RIGHT
    }

    private String label;
    private int font_size;
    private Alignment alignment;

    public Label() {  this.x = 0; this.y = 0; this.label = "";  this.font_size = 0; this.alignment = Alignment.LEFT;  }
    public Label(float x, float y) {  this.x = x; this.y = y; this.label = "";  this.font_size = 0; this.alignment = Alignment.LEFT;  }
    public Label(float x, float y, String label) {  this.x = x; this.y = y; this.label = label;  this.font_size = 0; this.alignment = Alignment.LEFT;  }
    public Label(float x, float y, String label, int font_size) {  this.x = x; this.y = y; this.label = label;  this.font_size = font_size; }
    public Label(String label) {  this.label = label;  this.font_size = 0; this.alignment = Alignment.LEFT;  }
    public Label(String label, int font_size) {  this.label = label;  this.font_size = font_size; this.alignment = Alignment.LEFT;  }
    public Label(String label, int font_size, String alignment) {
        this.label = label;
        this.font_size = font_size;
        if (alignment == "left") {  this.alignment = Alignment.LEFT;  }
        else if (alignment == "center") {  this.alignment = Alignment.CENTER; }
        else if (alignment == "right") {  this.alignment = Alignment.RIGHT; }
        else {  this.alignment = Alignment.LEFT;  }
    }

    public String label() {  return this.label;  }
    public int font_size() {  return this.font_size;  }
    public String alignment() {
      if (this.alignment == Alignment.LEFT) {  return "left";  }
      else if (this.alignment == Alignment.CENTER) {  return "center";  }
      else if (this.alignment == Alignment.RIGHT) {  return "right";  }
      else {  return "ERROR";  }
    }

    public void set_label(String label) {  this.label = label;  }
    public void set_font_size(int font_size) {  this.font_size = font_size;  }
    public void set_alignment(String alignment) {
        if (alignment == "left") {  this.alignment = Alignment.LEFT;  }
        else if (alignment == "center") {  this.alignment = Alignment.CENTER;  }
        else if (alignment == "right") {  this.alignment = Alignment.RIGHT;  }
    }
}
