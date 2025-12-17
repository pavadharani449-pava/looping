import java.util.Scanner;
public class Lp20 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
        int sq=n*n;
        int temp=n;
        boolean f=true;
        while(temp>0)
        {
            if(temp%10!=sq%10)
            {
                f=false;
                break;
            }
            temp/=10;
            sq/=10;
        }
        if(f){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not Automorphic number");
        }
    }
}
