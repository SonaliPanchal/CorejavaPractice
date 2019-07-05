package javaPricetice.cutom.exception;

public class CustExceptionDemo extends RuntimeException 
{
	public static void main(String[] args) {

		int age =0;
		if(age>60)
		{
			throw new TooOldException("You are too old");
		}
		else if(age<18)
		{
			throw new TooYoungException("You are too young");

		}
		else
		{
			System.out.println("You'll get match details soon by Email!!! ");
		}
	}
}
