import java.util.Scanner;

public class prime {
    public static void main (String args[]) {
        int num;
        boolean isPrime=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        num=sc.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(""+"is a Prime number");
        }
        else
        {
            System.out.println("is not a Prime number");
        }

    }
}
