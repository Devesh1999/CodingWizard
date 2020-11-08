import java.util.Scanner;
import java.util.Random;
public class q2 {
    public static void main(String[] args) {
        question2();
    }
    public static void question2()
    {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        char[] a={'R','P','S'};
        int c=0;
        int d=0;
        int i=0;

        do {
			System.out.println("Enter User's Choice: ");
			char b= s.next().charAt(0);
			if(b!='R' && b!='P'&& b!='S') {
				System.out.println("Enter correct choice stupid");
			}
			else {
				System.out.println("Computer's Chioice(Randomly generated)");
				char COMUPTER = a[r.nextInt(3)];
				System.out.println(COMUPTER);
				if(COMUPTER==b )
				{
                    System.out.println("****GAME TIE****");
                    continue;
				}
				switch(b)
				{
				case 'R':
					if(COMUPTER == 'P')
					{
                        System.out.println("****COMPUTER WON THE ROUND****");
                        c+=1;
                        break;
					}
					
                    else 
                    {
                        System.out.println("****USER WON THE ROUND****");
                        d+=1;
                        break;
					}
				case 'P':
					if(COMUPTER == 'S')
					{
                        System.out.println("****COMPUTER WON THE ROUND*****");
                        c+=1;
                        break;
					}
                    else 
                    {
                        System.out.println("****USER WON THE ROUND****");
                        d+=1;
                        break;
					}
				case 'S':
					if(COMUPTER == 'R')
					{
                        System.out.println("****COMPUTER WON THE ROUND****");
                        c+=1;
                        break;
					}
                    else
                     {
                        System.out.println("****USER WON THE ROUND****");
                        d+=1;
                    }
                    break;
                }
                i++;
            }
            
        } while(i<=2);
		if(d == c)
		{
			System.out.println("3 Rounds over, User Scored "+d+",Game Tie");
		}
		else if(d > c)
		System.out.println("3 Rounds over, User Scored "+d+",User won the game");
		else 
			System.out.println("3 Rounds over, User Scored "+d+",Computer won the game");
      
    }

    
}
