package pranitha;

public class Gulabjam implements Sweets{
	static String name;
	static int cost;
	public void update(int cos)
	{
		cost=cos;
	}
	public Gulabjam()
	{
		System.out.print("You have the best sweet with price : 200");
		setPrice(200);
	}
	public void setPrice(int cos)
	{
		update(cos);
	}
	public int getPrice()
	{
		return cost;
	}

}
