import java.util.*;
public class CrossWords
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String s = sc.next ();
    int i, j;
    for (i = 0; i < s.length (); i++, System.out.print ("\n"))
      {
	for (j = 0; j < s.length (); j++)
	  {
	    if (i == j && i + j == s.length () - 1)
	      System.out.print (s.charAt (i) + " ");
	    else if (i == j || i + j == s.length () - 1)
	      {
		if (i == j)
		  System.out.print (s.charAt (j) + " ");
		if (i + j == s.length () - 1)
		  System.out.print (s.charAt (i) + " ");
		else
		  System.out.print ("  ");
	      }
	    else
	        System.out.print ("  ");

	  }
      }
  }
}
