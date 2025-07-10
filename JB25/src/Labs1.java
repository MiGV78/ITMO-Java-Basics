import java.util.Scanner;

public class Labs1 
{
    static void PrintText ()
    {
        System.out.println("Я \nхорошо \nзнаю \nJava");
    }

    static void arifmetica1 ()
    {
        System.out.println((46+10)*(double)10/3);
        System.out.println(((29)*(4)*(-15)));
    }

    static void arifmetica2 ()
    {
        int number = 10500;
        int result = (number/10)/10;
        System.out.println("result = " + result);
    }

    static void arifmetica3()
    {
        double x = 3.6, y = 4.1, z = 5.9;
        double result = x*y*z;
        System.out.println("result = " + result);
    }

    static void InputOutput()
    {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++)
        {
            numbers[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++)
        {
            System.out.println(numbers[i]);
        }        
    }

    static void Logic ()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int b = in.nextInt();
        if (b/2 == (double)b/2)
        {
            if (b > 100)
            {
                System.out.println("Выход за пределы диапазона");
            }
            else
            {
                System.out.println("Четное");                
            }
        }
        else
        {
            System.out.println("Нечетное");            
        }
    }
}