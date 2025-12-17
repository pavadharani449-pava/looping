import java.util.Scanner;
public class Lp16 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        if(sum==a)
        {
            System.err.println("perfect number");
        }
        else{
            System.err.println(" not perfect number");
        }
    }
}
