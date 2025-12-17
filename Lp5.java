import java.util.Scanner;
public class Lp5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prod=1;
        for(int i=1;i<=n;i++)
        {
            prod*=i;
        }
        System.out.println(prod);
    }
}

