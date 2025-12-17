import java.util.Scanner;
public class Lp9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        int d=b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int lcm=(c*d)/a;
     System.out.println(lcm);
    }
}

