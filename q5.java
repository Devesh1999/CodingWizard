public class q5 {
    public static void main(String[] args) {
        question4();
    }
    public static void question4(){
        int max=1;;
		int m=1;
		int l=0;
		int n=0;
        int i=999;
        do
		{
            int j=999;
            do
			{
				int rev=0;
				max= i * j;
				int temp=max;
				while(max!=0)
				{
				int d= max % 10;
				rev= rev * 10 + d;
				max/=10;
				}
                if(temp == rev && rev>m)
                {
                	m=rev;
                	l=i;
                	n=j;
				
                }
                j--;
			}while(j>=100);
			i--;
		}while(i>=100);
         	 System.out.println("largest palindrome made from the product of two 3-digit numbers "+ l+"*"+n+"="+m);    
	
    }
}