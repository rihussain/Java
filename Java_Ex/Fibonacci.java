import java.util.*;
//fibonacci series
public class Fibonacci
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),a=-1,b=1,f;
		while(n>0)
		{
		    f=a+b;
		    System.out.print(f+" ");
		    a=b;
		    b=f;
		    
		    n--;
		}
	}
}
