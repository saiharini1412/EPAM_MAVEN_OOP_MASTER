package epam.New_Year_Gift_;

public class KitKat extends Chocolates{
	   private int kitkat_cost;
	   private int no_of_kitkat;
	   KitKat(String name_of_candy,int number,int cost)
	     {
	        super(name_of_candy);
	        no_of_kitkat=number;
	        kitkat_cost=cost;
	     }
	 public int generate_cost()
	  {
	     int c=(no_of_kitkat)*(kitkat_cost);
	     return c;
	  }
}
