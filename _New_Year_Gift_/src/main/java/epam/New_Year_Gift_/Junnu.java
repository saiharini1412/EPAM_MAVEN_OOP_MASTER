package epam.New_Year_Gift_;

public class Junnu extends Sweets {
	   private int junnu_weight;
	   private int junnu_cost;
	 Junnu(String name_of_sweet,int weight,int cost)
	      {
	           super(name_of_sweet);
	           junnu_weight=weight;
	           junnu_cost=cost;
	      }
	 public int generate_cost()
	     {
	         int c =(junnu_weight*junnu_cost);
	         return c;
	     }
}