import java.util.Scanner;
public class sum1_to_n {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(add(num));


    }
    public static int add(int n)
    {
        int sum =0;
        for(int i=1;i<=n;i++)
        {
            sum +=i; 
        }
        return sum;
    }
}
