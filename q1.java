import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
   
    question1();
    }
    public static void question1() 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Input:-");
        String s1 =s.next();
		char a='0';
		String s2 =" ";
		int i=s1.length()-1;
        do 
		{
            if(s1.charAt(i)!='G'&&s1.charAt(i)!='C'&&s1.charAt(i)!='T'&&s1.charAt(i)!='A')
                System.out.println("Invalid Input");
            else
				if(s1.charAt(i) == 'G')
					a = 'C';
				if(s1.charAt(i) == 'C')
					a = 'G';
				if(s1.charAt(i) == 'T')
					a = 'A';
				if(s1.charAt(i) == 'A')
					a = 'U';
                s2= s2+a;
        i++;
        }while(i==0);
		System.out.print("Output:-"+s2);
    }
    
    
}
