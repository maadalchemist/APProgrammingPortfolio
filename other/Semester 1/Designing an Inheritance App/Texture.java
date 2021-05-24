public class Texture extends GUI {
    private int texture;
    private boolean tileable = false;
    private boolean stretch = false;

    public Texture() {  this.x = 0; this.y = 0;  this.texture = 0;  this.tileable = false;  this.stretch = false;  }
    public Texture(float x, float y) {  this.x = x; this.y = y;  this.texture = 0;  this.tileable = false;  this.stretch = false;  }
    public Texture(float x, float y, boolean tileable, boolean stretch) {  this.x = x; this.y = y;  this.texture = 0;  this.tileable = tileable;  this.stretch = stretch;  }

    public boolean is_tileable() {  return tileable;  }
    public boolean is_stretch() {  return stretch;  }

    public void set_tileable(boolean tileable) {  this.tileable = tileable;  }
    public void set_stretch(boolean stretch) {  this.stretch = stretch;  }
}
