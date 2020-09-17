public class FamilyMember {
  String name;
  Day birthday;
  RectangleComponent bar;

  public FamilyMember (String _name, int bDayY, int bDayM, int bDayD) {
    this.name = _name;
    this.birthday = new day(bDayY, bDayM, bDayD);
    this.bar = new RectangleComponent(0,0,0,0);
  }

}
