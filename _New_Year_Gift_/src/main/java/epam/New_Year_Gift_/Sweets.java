package epam.New_Year_Gift_;
public abstract class Sweets 
{
   protected String name_of_sweet;
   Sweets(String name)
   {
      name_of_sweet=name;
   }
   public String getName()
   { 
      return name_of_sweet;
   }
  public abstract int generate_cost();
}
