package pyramidProgram;

public class Pyramid5 
{
	
	public static void main(String[] args) {
	    char last = 'E', alphabet = 'A';
	    char ch=(char) (last - 'A' + 1);
	    int i,j;
	    for (i = 1; i <= ch; i++) {
	      for (j = 1; j <= i; j++) {
	        System.out.print(alphabet + " ");
	      }
	      alphabet++;

	      System.out.println();
	    }
	  }

}
