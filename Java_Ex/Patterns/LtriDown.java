import java.util.*;
public class LtriDown
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),i,j;
	for(i=n;i>=0;i--,System.out.print("\n"))
	{
	    for(j=1;j<=i;j++)
	    System.out.print("* ");
	}
	}
}
/*
------------------
8
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
-----------------
*/