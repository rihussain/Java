public class CommandLinearg
{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[1]);
		System.out.println(args[1]);
		for(int i=0;i<a;i++)
		{
		    System.out.println(args[0]+" ");
		}
	}
}
/*exec
java CommandLinearg hi 4
4
hi
hi
hi
hi*/