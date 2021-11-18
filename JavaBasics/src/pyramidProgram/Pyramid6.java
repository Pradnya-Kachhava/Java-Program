package pyramidProgram;

public class Pyramid6 
{

	public static void main(String[] args) {
	    char last = 'E', alphabet = 'A';
	    char ch=(char) (last - 'A' + 1);
	    int i,j;
	    for (i = 1; i <= ch; i++) {
	      for (j = ch; j >= i; j--) {
	        System.out.print(alphabet + " ");
	      }
	      alphabet++;

	      System.out.println();
	    }
	  }

}
