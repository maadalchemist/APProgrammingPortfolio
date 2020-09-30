/**
* The Counter class stores a variable as a counter which
* can be manipulated as needed
*
* @author  Joseph Wardle
* @version 1.0
* @since   2020-09-30
*/
public class Counter{
  private int count;

  public Counter(){
    this.count = 0;
  }
  public Counter(int _count){
    this.count = _count;
  }

  /**
  * This method is used to find the value of the counter
  * @return int This returns counter value
  */
  public int getValue(){
    return count;
  }

  /**
  * This method is used to add to the counter
  * @param _amount (OPTIONAL) this is the value added to the count. Default is 1
  */
  public void click(){
    count += 1;
  }
  public void click(int _amount){
    count += _amount;
  }

  /**
  * This method is used to subtract from the counter
  * @param _amount (OPTIONAL) this is the value subtracted the count. Default is 1
  */
  public void undo(){
    count -= 1;
  }
  public void undo(int _amount){
    count -= _amount;
  }

  /**
  * This method replaces the current count
  * @param _amount (OPTIONAL) this is the value count is set to. Default is 0
  */
  public void reset(){
    count = 0;
  }
  public void reset(int _amount){
    count = _amount;
  }
}
