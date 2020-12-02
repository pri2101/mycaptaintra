import java.util.Scanner;

class minutes{
    public static void main(String[] args){
        int y,d,a;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the minutes");
        a=sc.nextInt();
        y=a/525600;
        d=a/1440;
        System.out.println("the converted answer is "+y+"years"+d+"days");
    }
}
