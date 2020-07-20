package epam.New_Year_Gift_;

public class AddGifts {
	int sweets[]=new int[100];
	int candies[]=new int[100];
	int len1=0,len2=0;
	public void addChocolates(int c)
	{
		candies[len1++]=c;
	}
	public void addSweets(int s)
	{
		sweets[len2++]=s;
	}
	public void sort_chocolates()
	{
		for(int i=0;i<len1-1;i++)
		{
			for(int j=0;j<len1-i-1;j++)
			{
				if(candies[j]>candies[j+1])
				{
					int temporary=candies[j];
					candies[j]=candies[j+1];
					candies[j+1]=temporary;
				}
			}
		}
	}
	public void display_sweets()
	{
		System.out.println("Your Sweets present in the Gift between Rs.0 to Rs.1000 is...... \n ");
		for(int i=0;i<len2;i++)
			if(sweets[i]<1000)
			    System.out.print(sweets[i]);
		System.out.println();
	}

}
