import java.util.Scanner;
public class Lp1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

    {
        int nm=sc.nextInt();
        int fact=1;
        for(int i=1;i<=nm;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of num"+nm+"="+fact);

    }
}


    }
