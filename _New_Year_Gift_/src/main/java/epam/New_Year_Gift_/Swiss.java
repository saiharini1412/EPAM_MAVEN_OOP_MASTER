package epam.New_Year_Gift_;

public class Swiss extends Chocolates {
	   private int swiss_cost;
	   private int no_of_swiss;
	   Swiss(String name_of_candy,int number,int cost)
	     {
	        super(name_of_candy);
	        no_of_swiss=number;
	        swiss_cost=cost;
	     }
	   public int generate_cost()
	   	{
		   return no_of_swiss*swiss_cost;
	     
	   	}
}

