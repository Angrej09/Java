package methods;

import java.util.Scanner;

public class AddStatic {

	 static void input()
    {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first integer:");
        x = s.nextInt();
        System.out.print("Enter second integer:");
        y = s.nextInt();
        z = add(x, y);
        System.out.println("Result:"+z);
    }
     static int add(int a, int b)
    {
        int c;
        c = a + b;
        return c;
    }
    public static void main(String[] args) 
    {
        input();
    }
}