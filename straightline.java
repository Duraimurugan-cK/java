import java.util.Scanner;

public class straightline {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        if(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)==0)
        {
            System.out.println("Straight line");
        }
        else{
            System.out.println("not a straight line");
        }

    }
    
}
