public class q3 {
    public static void main(String[] args) {
        question3();
    }
    public static void question3()
    {		 
			int a = 0;
			int b = 0;
            long c;
			int i=2;
			do{
			    int l = 1;
			    c = i;
			    while (c != 1) {
			        if ((c % 2) == 0) {
			            c = c / 2;
			        } else {
			            c = c * 3 + 1;
			        }
			        l++;
			    }
			 
			    
			    if (l > a) {
			        a = l;
			        b = i;
                }
                i++;
            }
            while(i<=1000000);
            System.out.println(b);

    }
}
