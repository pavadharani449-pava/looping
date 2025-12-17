import java.util.Scanner;
public class Lp8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int temp=n;
        int c=0;
        while(temp!=0)
        {
            c++;
            temp=temp/10;
        }
        temp=n;
        int sum=0;
        while(temp!=0)
        {
            int dig=temp%10;
            sum+=Math.pow(dig,c);
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
    
