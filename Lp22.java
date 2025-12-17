import java.util.Scanner;
public class Lp22 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        while(n>1)
        {
            if(n%3==0)
            {
                n=n/3;
            }
            else{
                break;
            }
        }
        if(n==1)
        {
            System.out.println("Power of 3");
        }
        else{
            System.out.println("Not power of 3");
        }

    }
}

