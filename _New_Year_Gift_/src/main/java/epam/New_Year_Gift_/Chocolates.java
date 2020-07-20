package epam.New_Year_Gift_;

public abstract class Chocolates
{
   protected String name_of_candy;
   Chocolates(String name_of_candy)
    {
      this.name_of_candy=name_of_candy;
    }
   public String getName()
    {
      return name_of_candy;
    }
  public abstract int generate_cost();
}
   
