package pranitha;
import java.util.*;
public class Main {
	static int no_of_sweets=0;
	static String name="";
	public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("How Many Number of Sweets Do You Want??");
    	no_of_sweets=sc.nextInt();
    	int i;
    	int total=0;
    	for(i=0;i<no_of_sweets;i++)
    	{
    		System.out.print("What is the sweet You want? ");
    		System.out.print("sweet1 : Rasmalai \nsweet2 : rasgulla\nsweet3 : gulabjam\n");
    		name=sc.next();
    		
    		if(name.equals("sweet1"))
    		{
    			System.out.print("Let me know the Weight you require in Kg : ");
        		int kg=sc.nextInt();
    			Rasmali s=new Rasmali();
        		total+=s.getPrice()*kg;
    		}
    		else if(name.equals("sweet2"))
    		{
    			System.out.print("Let me know the Weight you require in Kg : ");
        		int kilo=sc.nextInt();
    			Rasgulla s=new Rasgulla();
        		total+=s.getPrice()*kilo;
    		}
    		else if(name.equals("sweet3"))
    		{
    			System.out.print("Let me know the Weight you require in Kg : ");
        		int kilo=sc.nextInt();
    			Gulabjam s=new Gulabjam();
        		total+=s.getPrice()*kilo;
    		}
    		else
    		{
    			System.out.println("Select the correct sweet");
    			i--;
    		}
    	}
    	System.out.println("Total Payable amount is : "+total);
    	sc.close();
    }

}
