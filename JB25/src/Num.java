import java.util.Random;
import java.util.Scanner;

public class Num
{
    public static void OddNum()
    {
        for (int i = 1; i < 100; i++)
        {
            if (i/2 != (double)i/2)
            {
                System.out.println(i);
            }
        }
    }

    public static void Del()
    {
        String Del3 = "Делится на 3:";
        String Del5 = "Делится на 5:";
        String Del3or5 = "Делится на 3 и на 5:";
        for (int i = 1; i < 101; i++)
        {
            if (i/3 == (double)i/3)
            {
                Del3 = Del3 + " " + i;
                if (i/5 == (double)i/5)
                {
                    Del5 = Del5 + " " + i;
                    Del3or5 = Del3or5 + " " + i;
                }
                else
                {
                    if (i/5 == (double)i/5)
                    {
                        Del5 = Del5 + " " + i;
                    }
                }
            }
        }
        System.out.println(Del3);
        System.out.println(Del5);
        System.out.println(Del3or5);
    }
    public Boolean SumTrue()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int A = in.nextInt();
        System.out.println("Введите второе число: ");
        int B = in.nextInt();
        System.out.println("Введите третье число: ");
        int C = in.nextInt();
        if (A+B == C)
        {
            return true;
        }
        else return false;
    }

    public Boolean True()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int A = in.nextInt();
        System.out.println("Введите второе число: ");
        int B = in.nextInt();
        System.out.println("Введите третье число: ");
        int C = in.nextInt();
        if (B > A && C > B)
        {
            return true;
        }
        else return false;
    }
    public static Boolean Array3()
    {
         int[] Arr = { 3, -3, 7, 4, 5, 4, 3};
         String Input = "array = ";
         for(int i=0; i<7; i++)
         {
             Input = Input + Arr[i] + ", ";
         }
         System.out.println(Input);
         if (Arr[0] == 3 || Arr[6] == 3)
         {
                return true;
         }
         else return false;
    }

    public static Boolean Array1or3()
    {
        int[] Arr = { 3, -3, 7, 4, 5, 4, 3};
        for(int i=0; i<7; i++)
        {
            if (Arr[i] == 1 || Arr[i] == 3)
            {
                return true;
            }

        }
        return false;
    }

    public static void SortArr()
    {
        int[] Arr = { 3, -3, 7, 4, 5, 4, 3};
        for(int i=0; i<6; i++)
        {
            if (Arr[i] > Arr[i+1])
            {
                System.out.println("Please, try again");
                return;
            }

        }
        System.out.println("Ok");
    }

    public String ArrUsers()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Array length: ");
        int lenght = in.nextInt();
        int[] Arr = new int[lenght];
        String Res = "Result: [";

        for (int i=0; i<lenght; i++){
            System.out.println("Numbers of array:");
            Arr[i] = in.nextInt();
            if (i+1 != lenght)
            {Res = Res + Arr[i] + ", ";}
            else {Res = Res + Arr[i] + "]";}
        }
        return Res;
    }

    public static void Change()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Array: ");
        int lenght = in.nextInt();
        int[] Arr1 = new int[lenght];
        int[] Arr2 = new int[lenght];
        String Res1 = "Array 1: [";
        String Res2 = "Array 2: [";

        for (int i=0; i<lenght; i++){
            System.out.println("Numbers of array:");
            Arr1[i] = in.nextInt();
            Arr2[i] = Arr1[i];
            if (i+1 != lenght){Res1 = Res1 + Arr1[i] + ", ";}
            else {Res1 = Res1 + Arr1[i] + "]";}
        }
        Arr2[0] = Arr1[lenght-1];
        Arr2[lenght-1] = Arr1[0];
        for (int i=0; i<lenght; i++){
            if (i+1 != lenght){Res2 = Res2 + Arr2[i] + ", ";}
            else {Res2 = Res2 + Arr2[i] + "]";}
        }
        System.out.println(Res1 + "\n" + Res2);
    }

    public static void Uni()
    {
        int[] Arr = { 1, 2, 3, 1, 2, 4};
        int[][] Arr2 = new int[2][7];
        int Res = 0;
        for (int i =0; i<6; i++)
        {
            Arr2[0][i] = Arr[i];
            for (int j = 0; j<6;j++)
            {
                if(Arr[i]==Arr[j])
                {
                    Arr2[1][i] = Arr2[1][i] + 1;
                }
            }
            for (int k = 0; k<6;k++)
            {
                if(Arr2[1][k]==1)
                {
                   Res = Arr2[0][k];
                   break;
                }
            }
        }
        System.out.println(Res);
    }

    public static void ArrSort(int Num)
    {
        int[] Arr = new int[Num];
        Random r = new Random();
        String Old = "Исходный массив: [";
        for (int i=0; i<Num; i++)
        {
            Arr[i]=(Integer)r.nextInt(10);
            Old = Old + Arr[i]+", ";
        }
        Old = Old + "]";
        System.out.println(Old);

        Sort(Arr);

        String New = "Отсортированный массив: [";
        for (int i=0; i<Num; i++)
        {
            New = New + Arr[i]+", ";
        }
        New = New + "]";
        System.out.println(New);
    }
    public static void Sort(int[] Arr) {
        if (Arr == null || Arr.length <= 1) {
            return;
        }
        int[] ArrT = new int[Arr.length];
        Sort(Arr, 0, Arr.length - 1, ArrT);
    }

    private static void Sort(int[] Arr, int left, int right, int[] ArrT) {
        if (left < right) {
            int center = (left + right) / 2;
            Sort(Arr, left, center, ArrT);
            Sort(Arr, center + 1, right, ArrT);
            merge(Arr, left, center, right, ArrT);
        }
    }

    private static void merge(int[] Arr, int left, int center, int right, int[] ArrT) {
        int i = left;
        int j = center + 1;
        int z = left;

        while (i <= center && j <= right) {
            if (Arr[i] <= Arr[j]) {
                ArrT[z++] = Arr[i++];
            } else {
                ArrT[z++] = Arr[j++];
            }
        }

        while (i <= center) {
            ArrT[z++] = Arr[i++];
        }

        while (j <= right) {
            ArrT[z++] = Arr[j++];
        }

        for (int l = left; l <= right; l++) {
            Arr[l] = ArrT[l];
        }
    }
}
