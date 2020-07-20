package epam.New_Year_Gift_;

public class MilkyWay extends Chocolates{
	   private int milkyway_cost;
	   private int no_of_milkyway;
	   MilkyWay(String name_of_candy,int number,int cost)
	     {
	        super(name_of_candy);
	        no_of_milkyway=number;
	        milkyway_cost=cost;
	     }
	   public int generate_cost()
	     {
		   	 return no_of_milkyway*milkyway_cost;
	     }
}
