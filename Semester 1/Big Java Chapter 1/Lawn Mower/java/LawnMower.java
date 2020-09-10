public class LawnMower {
  // Member variables
  int x, y, facing;
  /* FACING KEY
   * 0 = 'right'
   * 1 = 'up'
   * 2 = 'down'
   * 3 = 'left'  */

  // Constructor
  public LawnMower(int _x, int _y, int _facing) {
    this.x = _x;
    this.y = _y;
    this.facing = _facing;
  }

  // Member Methods
  public void move(){
    //if next block is unmowed
      // move forward
      // change grass to mowed;
    // else
      // rotate to the left
  }

  public void display(){
    Display.draw_char(x, y, 'O');
  }
}
