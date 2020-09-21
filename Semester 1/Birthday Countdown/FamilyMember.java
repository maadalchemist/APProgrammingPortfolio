public class FamilyMember {
  String name;
  Day birthday;

  public FamilyMember (String _name, int bDayY, int bDayM, int bDayD) {
    this.name = _name;
    this.birthday = new Day(bDayY, bDayM, bDayD);
  }

}
