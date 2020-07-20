package epam.New_Year_Gift_;


public class Laddu extends Sweets {
	   private int laddu_weight;
	   private int laddu_cost;
	   Laddu(String name_of_sweet,int weight,int cost)
	      {
	           super(name_of_sweet);
	           laddu_weight=weight;
	           laddu_cost=cost;
	      }
	   public int generate_cost()
	     {
	         return laddu_weight*laddu_cost;	        
	     }
	}

