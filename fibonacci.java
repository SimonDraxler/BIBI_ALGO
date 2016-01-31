
public class fibonacci {
	
	public static int fibonacciAnStelle(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacciAnStelle(n - 1) + fibonacciAnStelle(n - 2);
	}

	public static void main(String[] args) {
		
		
		int i = fibonacciAnStelle(5);
		System.out.println(i);
	}

}
