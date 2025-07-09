import java.util.Scanner;

public class Calculator 
{
// Cумма
    public int sum (int a, int b)
    {
        return a + b;
    }
    public double sum (double a, double b)
    {
        return a + b;
    }
    public long sum (long a, long b)
    {
        return a + b;
    }
    
// Вычетание
    public int sub (int a, int b)
    {
        return a - b;
    }
    public double sub (double a, double b)
    {
        return a - b;
    }
    public long sub (long a, long b)
    {
        return a - b;
    }

// Умножение
    public int mul (int a, int b)
    {
        return a * b;
    }
    public double mul (double a, double b)
    {
        return a * b;
    }
    public long mul (long a, long b)
    {
        return a * b;
    }

// Деление
    public double del(int a, int b)
    {
        if (b != 0)
        {
            return a / b;
        }
        else
        {
            System.out.println("деление на 0");
            return b == 0 ? 0 : Double.NaN;
        }
    }

    public double del (double a, double b)
    {
        if (b != 0)
        {
            return a / b;
        }
        else
        {
            System.out.println("деление на 0");
            return b == 0 ? 0 : Double.NaN;
        }
    }

    public double del (long a, long b)
    {
        if (b != 0)
        {
            return a / b;
        }
        else
        {
            System.out.println("деление на 0");
            return b == 0 ? 0 : Double.NaN;
        }
    }

    public void Calc()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите тип используемых данных: \n Введите 1 если данные типа Integer, \n Введите 2 если данные типа Double, \n Введите 3 если данные типа Long");
        int TypeD = in.nextInt();
        System.out.println("Выберите тип операции: \n Введите 1 если сложение, \n Введите 2 если вычетание, \n Введите 3 если умножение, \n Введите 4 если деление");
        int TypeO = in.nextInt();
        if (TypeD == 1)
        {
            System.out.println("Введите число A:");
            int A = in.nextInt();
            System.out.println("Введите число B:");
            int B = in.nextInt();
            if(TypeO == 1)
            {
                int rez = sum(A, B);
                System.out.print(rez);
            }
            else
            {
                if(TypeO == 2)
                {
                    int rez = sub(A, B);
                    System.out.println(rez);
                }
                else
                {
                    if(TypeO == 3)
                    {
                        int rez = mul(A, B);
                        System.out.print(rez);
                    }
                    else
                    {
                        double rez = del(A, B);
                        System.out.println(rez);
                    }
                }
            }    
        }
        else
        {
            if (TypeD == 2)
            {
                System.out.println("Введите число A:");
                double A = in.nextDouble();
                System.out.println("Введите число B:");
                double B = in.nextDouble();
                if(TypeO == 1)
                {
                    double rez = sum(A, B);
                    System.out.print(rez);
                }
                else
                {
                    if(TypeO == 2)
                    {
                        double rez = sub(A, B);
                        System.out.println(rez);
                    }
                    else
                    {
                        if(TypeO == 3)
                        {
                            double rez = mul(A, B);
                            System.out.print(rez);
                        }
                        else
                        {
                            double rez = del(A, B);
                            System.out.println(rez);
                        }
                    }
                }
            }
            else
            {
                System.out.println("Введите число A:");
                long A = in.nextLong();
                System.out.println("Введите число B:");
                long B = in.nextLong();
                if(TypeO == 1)
                {
                    long rez = sum(A, B);
                    System.out.print(rez);
                }
                else
                {
                    if(TypeO == 2)
                    {
                        long rez = sub(A, B);
                        System.out.println(rez);
                    }
                    else
                    {
                        if(TypeO == 3)
                        {
                            long rez = mul(A, B);
                            System.out.print(rez);
                        }
                        else
                        {
                            double rez = del(A, B);
                            System.out.println(rez);
                        }
                    }
                }
            }    
        }
        in.close();
    }
}

