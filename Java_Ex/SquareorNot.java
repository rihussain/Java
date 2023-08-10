import java.util.*;
public class SquareorNot
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=0;
		while((i*i)<n)
			i++;
	    System.out.println((i*i)==n?"Square":"not");
	}
}