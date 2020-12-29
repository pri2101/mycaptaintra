public class fibo {
    public static void main(String args[])
    { int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of terms");
        n= sc.nextInt();
        int a=0,b=1,c = 0;
        for(int i=0;i<n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

        
    }
}
