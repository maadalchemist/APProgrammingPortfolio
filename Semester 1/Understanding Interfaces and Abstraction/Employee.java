/**
   An Item represents a product for sale.
*/
public class Employee implements Measurable
{
   private double anualWage;
   private double wageWithBenefits;

   /**
      Constructs an Employee.
      @param anualWage the retail price of this item.
      @param wageWithBenefits the wholesale price of this item.
   */
   public Employee(double anualWage, double wageWithBenefits)
   {
      this.anualWage = anualWage;
      this.wageWithBenefits = wageWithBenefits;
   }

   public double getMeasure() {
      return wageWithBenefits - anualWage;
   }
}
