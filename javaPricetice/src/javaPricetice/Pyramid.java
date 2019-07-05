package javaPricetice;

public class Pyramid {

	public static void main(String[] args) {
		
		String arry [] = {"Sonali","akash","rahul"};
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.println("* ");
			}
			System.out.println();//new line  
		}
		
		for(String i : arry)
		{
			System.out.println(i);
		}
	}

}

