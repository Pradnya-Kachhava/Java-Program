package loopPrograms;

public class IfCondition1_2
{
	
	static int number=51;
	public static void main(String[] args)
	{   int num = 0;
		/*defining a variable  
		int number=50;  
		//Check if the number is divisible by 2 or not  
		if(number%2==0)
		{  
			System.out.println("even number");  
		}else
			
		{  
			System.out.println("odd number");  
		}  */
		
	
		IfCondition1_2.EvenOrOdd(num);
	}  
	
	static double EvenOrOdd(int num)
	{
		if(number%2==0)
		{  
			System.out.println("even number ");  
		}else
			
		{  
			System.out.println("odd number");  
		}
		return num;
	}

}
