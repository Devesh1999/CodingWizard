public class q6 {
    public static void main(String[] args) {
        int prime=1;
		int n=1;
		while(prime<6)
		{
			n+=2;
			if(isprime(n))
				prime++;
		}
		System.out.println(n);
	}
	public static boolean isprime(int n)
	{
		int c=0;
		for(int i=1;i<=1000;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
 }
