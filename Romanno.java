import java.util.Scanner;
class Romanno
{
	public static int precedence(char c)
	{
		switch(c)
		{
			case 'I':
				return 1;
				
			case 'V':
				return 5;
				
			case 'X':
				return 10;
				
			case 'L':
				return 50;
			
			case 'C':
				return 100;
				
			case 'D':
				return 500;
				
			case 'M':
				return 1000;
			
			default:
				return -1;
		}
	}
	public static void working()
	{
		Scanner ob=new Scanner(System.in);
		String s=ob.next().toUpperCase();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
				sum=sum+precedence(s.charAt(i));
			else
			{
				if(sum<precedence(s.charAt(i)))
					sum=precedence(s.charAt(i))-sum;
				else
					sum=precedence(s.charAt(i))+sum;
			}
		}
		System.out.println(sum);
	}
	public static void main(String... s)
	{
		working();
	}
}

