package epam.New_Year_Gift_;

import java.util.*;
public class NewYearGift {
	      public static void main(String args[])
	      {
	    	     AddGifts a=new AddGifts();
	    	     int p,q;
	             int sweet_weight,no_of_chocolates;
	             int ch,op;
	             Scanner s=new Scanner(System.in);
	             menuloop:
	             while(true)
	               {
	                 System.out.println("===========Menu========\n");
	                 System.out.println("1.Sweets\n");
	                 System.out.println("2.chocolates\n");
	                 System.out.println("3.exit\n");
	                 System.out.println("Select your item\n");
	                 ch=s.nextInt();
	                 switch(ch)
	                   {
	                     case 1:System.out.println("1.Laddu\n");
	                            System.out.println("2.Malpuri\n");
	                            System.out.println("3.Junnu\n");
	                            System.out.println("*********CHOOSE SWEET*******\n");
	                            op=s.nextInt();
	                            switch(op)
	                               {
	                                  
	                                  case 1:System.out.println("Enter Laddu Quantity.....:-)\n");
	                                         sweet_weight=s.nextInt();
	                                         Laddu k=new Laddu("Laddu",sweet_weight,20);
	                                         p=k.generate_cost();
	                                         a.addSweets(p);
	                                         break;
	                                  case 2:System.out.println("Enter Malpuri Quantity.....:-)\n");
	                                         sweet_weight=s.nextInt();
	                                         Malpuri m=new Malpuri("Malpuri",sweet_weight,15);
	                                         p=m.generate_cost();
	                                         a.addSweets(p);
	                                         break;
	                                  case 3:System.out.println("Enter Junnu Quantity.....:-)\n");
	                                         sweet_weight=s.nextInt();
	                                         Junnu j=new Junnu("Junnu",sweet_weight,10);
	                                         p=j.generate_cost();
	                                         a.addSweets(p);
	                                         break;
	                                         
	                               }
	                            break;
	                     case 2:System.out.println("1.Swiss\n");
	                            System.out.println("2.Milkyway\n");
	                            System.out.println("3.Kitkat\n");
	                            System.out.println("*******CHOOSE CHOCOLATE*******:-)\n");
	                            op=s.nextInt();
	                            switch(op)
	                               {
	                                  case 1:System.out.println("Enter Swiss Quantity......:-)\n");
	                                         no_of_chocolates=s.nextInt();
	                                         Swiss s1=new Swiss("Swiss",no_of_chocolates,50);
	                                         q=s1.generate_cost();
	                                         a.addChocolates(q);
	                                         break;
	                                  case 2:System.out.println("Enter MilkyWay Quantity.......:-)\n");
	                                         no_of_chocolates=s.nextInt();
	                                         MilkyWay f=new MilkyWay("Milkyway",no_of_chocolates,15);
	                                         q=f.generate_cost();
	                                         a.addChocolates(q);
	                                         break;
	                                  case 3:System.out.println("Enter KitKat Quantity.........:-)\n");
	                                         no_of_chocolates=s.nextInt();
	                                         KitKat d=new KitKat("KitKat",no_of_chocolates,20);
	                                         q=d.generate_cost();
	                                         a.addChocolates(q);
	                                         break;
	                               }
	                           break;
	                     case 3:break menuloop;
	                    }
	               }
	              a.sort_chocolates();
	              a.display_sweets();
	              s.close();
	            }
}