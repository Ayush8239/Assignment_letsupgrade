import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        System.out.println(add(num1,num2));


    }
    public static int add(int a,int b)
    {
        return a+b;
    }
}
