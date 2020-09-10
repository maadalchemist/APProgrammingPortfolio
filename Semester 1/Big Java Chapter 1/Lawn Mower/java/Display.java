public class Display {
  // Member Variables
  int dispW, dispH;
  char[][] display;

  // Constructor
  public Display(int _dispW, int dispH) {
    this.dispW = _dispW;
    this.dispH = _dispH;
    this.display = new char[dispW][dispH];
  }

  // Member Methods
  void clear() {
    for (int i = 0; i <= display.length; i++) {
      for (int j = 0; i <= display[0].length; i++) {
        display[i][j] = ' ';
      }
    }
  }

  void draw() {
    for (int i = 0; i <= display[0].length; i++) {
      for (int j = 0; i <= display.length; i++) {
        System.out.print(display[j][i]);
      }
      System.out.print();
    }
  }

  void draw_char(int _x, int _y, char _character) {
    display[_x][_y] = _character;
  }

  void draw_rect(int _x, int _y, int _w, int _h, char _character) {
    for (int i = 0; i <= _w; i++) {
      for (int j = 0; i <= _h; j++) {
        display[i + _x][j + _y] = _character;
      }
    }
  }

  void draw_text(int _x, int _y, String _txt) {
    for (int i = 0; i <= _txt.length; i++) {
      display[_x + i][_y] = _txt.charAt(i);
    }
  }
}
