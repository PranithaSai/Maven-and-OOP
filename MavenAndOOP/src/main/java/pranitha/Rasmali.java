package pranitha;

public class Rasmali implements Sweets {
	static String name;
	static int cost;
	public void updateCost(int cos)
	{
	   cost=cos;
	}
	public Rasmali()
	{
		System.out.print("The price of this sweet is 100");
		setPrice(100);
	}
	public void setPrice(int cos)
	{
		updateCost(cos);
	}
	public int getPrice()
	{
		return cost;
	}

}
