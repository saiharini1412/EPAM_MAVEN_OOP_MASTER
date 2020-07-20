package epam.New_Year_Gift_;
public class Malpuri extends Sweets{
	   private int malpuri_weight;
	   private int malpuri_cost;
	   Malpuri(String name_of_sweet,int malpuri_weight,int malpuri_cost)
	      {
	           super(name_of_sweet);
	           this.malpuri_weight=malpuri_weight;
	           this.malpuri_cost=malpuri_cost;
	      }
	   public int generate_cost()
	     {
	         return malpuri_weight*malpuri_cost;
	     }
}
	