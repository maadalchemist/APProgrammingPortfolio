/**
   A helper object simply holds methods that I couldnt get working due to static differences in main
*/

public class Helper {

  public Helper(){}

  /**
     populates the given display with white space
     @param _display a 2 dimentional character array that acts as a console screen
  */
  void clear_display(char[][] _display) {
    for (int i = 0; i < 72; i++) {
      for (int j = 0; j < 37; j++) {
        _display[i][j] = ' ';
      }
    }
  }

  /**
     prints the display_height
     @param _display a 2 dimentional character array that acts as a console screen
  */
  void push_draw(char[][] _display) {
    for (int i = 0; i < 37; i++) {
      for (int j = 0; j < 72; j++) {
        System.out.print(_display[j][i]);
      }
      System.out.println();
    }
  }

  /**
     changes a sincle character in the given display array
     @param x x location of changing character
     @param y y location of changing character
     @param _display a 2 dimentional character array that acts as a console screen
     @param c character to be added
  */
  void draw_char(int x, int y, char[][] _display, char c) {
    _display[x][y] = c;
  }

  /**
     draws a rectangle in a display array
     @param x top left x coordinate of rectangle
     @param y top left y coordinate of rectangle
     @param w width of rectangle
     @param h height of rectangle
     @param _display a 2 dimentional character array that acts as a console screen
     @param c character to build rectangle out of
  */
  void draw_rect(int x, int y, int w, int h, char[][] _display, char c) {
    for (int i = 0; i < w; i++) {
      draw_char(x + i,     y, _display, c);
    }
    for (int i = 0; i < h; i++) {
      draw_char(x + w, y + i, _display, c);
    }
    for (int i = w; i > 0; i--) {
      draw_char(x + i, y + h, _display, c);
    }
    for (int i = h; i > 0; i--) {
      draw_char(x,     y + i, _display, c);
    }
  }

  /**
     draws text into a display array
     @param x left x coordinate of text
     @param y left y coordinate of text
     @param _display a 2 dimentional character array that acts as a console screen
     @param txt text to draw
  */
  void draw_text(int x, int y, char[][] _display, String txt) {
    for (int i = 0; i < txt.length(); i++)
    {
      draw_char(x + i, y, _display, txt.charAt(i));
    }
  }

  /**
     utility script to draw board
     @param x top left x coordinate of board
     @param y top left y coordinate of board
     @param _display a 2 dimentional character array that acts as a console screen
     @param _board chess board to pull data from
  */
  void draw_board(int x, int y, char[][] _display, char[][] _board) {
    for (int i = 0; i < 65; i++) {
      for (int j = 0; j < 33; j++) {
        if (i%8 == 0 && j%4 == 0) {
          draw_char(x + i + 1, y + j + 1, _display, '+');
        } else if (j%4 == 0) {
          draw_char(x + i + 1, y + j + 1, _display, '-');
        } else if (i%8 == 0) {
          draw_char(x + i + 1, y + j + 1, _display, '|');
        } else {
          draw_char(x + i + 1, y + j + 1, _display, ' ');
        }
      }
    }
    char label_row =    '1';
    char label_column = 'A';
    for (int i = 0; i < 8; i++) {
      draw_char(x, 							4 * i + 3 + y, _display, label_row);
      draw_char(x + 66, 				4 * i + 3 + y, _display, label_row);
      draw_char(8 * i + 5 + x, 	y,						 _display, label_column);
      draw_char(8 * i + 5 + x, 	y + 34,				 _display, label_column);
      label_row ++;
      label_column ++;
    }
    draw_pieces(x, y, _display, _board);
  }

  /**
     draws frame
     @param _display a 2 dimentional character array that acts as a console screen
  */
  void draw_frame(char[][] _display) {
    draw_rect(1,       0,      72 - 2, 0,      _display, '-');
    draw_rect(1,       37 - 1, 72 - 2, 0,      _display, '-');
    draw_rect(0,       1,      0,      37 - 2, _display, '|');
    draw_rect(72 - 1,  1,      0,      37 - 2, _display, '|');
    draw_char(0,       0,      _display, '*');
    draw_char(72 - 1,  0,      _display, '*');
    draw_char(72 - 1,  37 - 1, _display, '*');
    draw_char(0, 			 37 - 1, _display, '*');
  }

  /**
     utility script to draw chess pieces
     @param x top left x coordinate of board
     @param y top left y coordinate of board
     @param _display a 2 dimentional character array that acts as a console screen
     @param _board chess board to pull data from
  */
  void draw_pieces(int x, int y, char[][] _display, char[][] _board) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        switch (_board[i][j]) {
          case ' ':
            break;
          case 'p':
            draw_text(i*8 + 2 + x, j*4 + 2 + y,     _display, "   _   " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 1, _display, "  (_)  " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 2, _display, "  /_\\  ");
            break;
          case 'r':
            draw_text(i*8 + 2 + x, j*4 + 2 + y,     _display, " [###] " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 1, _display, "  |_|  " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 2, _display, " /___\\ ");
            break;
          case 'k':
            draw_text(i*8 + 2 + x, j*4 + 2 + y,     _display, "  /\\_  " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 1, _display, " / o = "  );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 2, _display, " \\  \\  ");
            break;
          case 'b':
            draw_text(i*8 + 2 + x, j*4 + 2 + y,     _display, "   O   " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 1, _display, "  ( )  " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 2, _display, "  / \\  ");
            break;
          case 'q':
            draw_text(i*8 + 2 + x, j*4 + 2 + y,     _display, " \\\\|// ");
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 1, _display, "  )_(  "  );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 2, _display, " /___\\ " );
            break;
          case 'K':
            draw_text(i*8 + 2 + x, j*4 + 2 + y,     _display, " [###] " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 1, _display, " (___) " );
            draw_text(i*8 + 2 + x, j*4 + 2 + y + 2, _display, " /___\\ ");
            break;
          default:
            break;
        }
      }
    }
  }
}
