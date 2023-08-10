//odd or even
import java.util.*;
public class OddorEven
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt()&1;
		System.out.println(n==1?"odd":"even");
	}
}
