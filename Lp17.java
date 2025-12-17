import java.util. Scanner;
public class Lp17 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
        int sqr=n*n;
        int sum=0;
        while(sqr>0) {
            sum+=(sqr % 10);
            sqr/=10;
        }
        if(sum==n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}
