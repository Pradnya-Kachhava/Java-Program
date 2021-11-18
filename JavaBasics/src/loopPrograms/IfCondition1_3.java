package loopPrograms;

public class IfCondition1_3
{
	
	
	public static void main(String[] args)
	{    
		
		int year=2000;    
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))
		{  
			System.out.println(+(year)+" year is leap year so value is == "  +checkLeapYear(year));  
		}  
		else{  
			System.out.println(+(year)+" year not is leap year so value is == " +checkLeapYear(year));  
		} 
		
		/*IfCondition1_3 L1= new IfCondition1_3();
		L1.leapYear(L1.year);*/
	}    
	
	static boolean checkLeapYear(int year)
	{
		   
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))
		{  
			System.out.println("LEAP YEAR");  
			return true;
		}  
		else{  
			System.out.println("COMMON YEAR");  
		} 
		return false;
		
	}
}
