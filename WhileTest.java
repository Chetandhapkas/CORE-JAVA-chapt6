//Program 6.1

class WhileTest
{
	public static void main(String args[])
	{
		StringBuffer String = new StringBuffer();
		char c;
		System.out.print("Enter a String : ");
		try
		{
			while((c=(char)System.in.read())!='\n')	
			{
				String.append(c);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error in inout ");
		}
		System.out.print("You have entered ");
		System.out.println(String);
	}
}