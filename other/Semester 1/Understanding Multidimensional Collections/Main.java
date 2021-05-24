public class Main {
  public static void main(String[] args) {
    //define the chess board
    char[][] chessBoard =
    {
      { 'r', 'k', 'b', 'q', 'K', 'b', 'k', 'r' },
      { 'k', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
      { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
      { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
      { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
      { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
      { 'k', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
      { 'r', 'k', 'b', 'q', 'K', 'b', 'k', 'r' }
    };

    //define the console display
    int display_width = 72;
    int display_height = 37;
    char[][] display = new char[display_width][display_height];

    //create helper object
    Helper h = new Helper();

    //populate the display
    h.clear_display(display);
    h.draw_board(1, 1, display, chessBoard);
    h.push_draw(display);
  }


}
