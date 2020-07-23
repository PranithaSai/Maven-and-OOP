package pranitha;

public class Rasgulla implements Sweets{
	static String name;
	static int cost;
	public void update(int cos)
	{
		cost=cos;
	}
	public Rasgulla()
	{
		System.out.print("The price of this sweet is 50");
		setPrice(50);
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
