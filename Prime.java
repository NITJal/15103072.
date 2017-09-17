package suresh;
import java.util.Scanner;
class Prime {
	  static boolean Isprime(int x)
	{
		for(int j=2;j<=Math.sqrt(x);j++)
			if(x%j==0) return false;
		   return true;
	}
    public static void main(String args[]) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter upto which number prime numbers are needed");
	n=s.nextInt();
	for(int i=2;i<n;i++)
	{
		    if(Isprime(i))
			System.out.println(i);
			s.close();
	}


}
}
