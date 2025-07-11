import java.util.Scanner;
public class Main
{
    static void main(String[] args)
    {
        // // Лабораторная работа №1
        
        // Labs1.PrintText();
        // Labs1.arifmetica1();
        // Labs1.arifmetica2();
        // Labs1.arifmetica3();
        // Labs1.InputOutput();
        // Labs1.Logic();

        // // Лабораторная работа №2
        // // задание №1

        // Calculator obj1 = new Calculator();
        // obj1.Calc();
        
        // // задание №2

        // String Name = "Piligrim";
        // double Volume = 0.5;
        // double Price = 200.00;
        // Water object = new Water(Name, Volume, Price);
        // System.out.println(object.getNameWater());
        // System.out.println(object.getVolumeWater());       
        // System.out.println(object.getPraiceWater());

        // // Лабораторная работа №3
        // // задание №1

        // String x = "Изучение Java - это просто!";
        // Study obj = new Study(x);
        // System.out.println(obj.printCourse());
        
        // // задание №2

        // String Color1 = "Синий";
        // int Mass1 = 35;
        // Simple object1 = new Simple(Color1,Mass1);
        // object1.Display();

        // String Color2 = "Розовый";
        // int Mass2 = 55;
        // Simple object2 = new Simple(Color2,Mass2);
        // object2.Display();

        // // задание №3

        // int Num1 = 5;
        // int Year1 = 1988;
        // String Name1 = "Pulcovo Village";
        // Home House1 = new Home();
        // House1.In(Num1,Year1,Name1);

        // int Num2 = 18;
        // int Year2 = 2007;
        // String Name2 = "Iscra Sity";
        // Home House2 = new Home();
        // House2.In(Num2,Year2,Name2);

        // House1.Out();
        // System.out.println("Количество лет с момента постройке: " + House1.Year());
        // House2.Out();
        // System.out.println("Количество лет с момента постройке: " + House2.Year());

        // // задание №4

        // Tree tree1 = new Tree();
        // System.out.println(tree1.Year);
        // System.out.print(tree1.Life + "\n");
        // System.out.println(tree1.Name + "\n");

        // Tree tree2 = new Tree(22, "Осина");
        // System.out.println(tree2.Year);
        // System.out.print(tree2.Life + "\n");
        // System.out.println(tree2.Name + "\n");

        // Tree tree3 = new Tree(13, true,"Береза");
        // System.out.println(tree3.Year);
        // System.out.print(tree3.Life + "\n");
        // System.out.println(tree3.Name + "\n");

             // Лабораторная работа № 4

        // Задание №1.1

       Num.OddNum();

        // Задание №1.2

       Num.Del();

        // Задание №1.3

       Num obj1 = new Num();
       System.out.println("Результат: " + obj1.SumTrue());

        // Задание №1.4

       System.out.println("Результат: " + obj1.True());

        // Задание №1.5

       System.out.println(Num.Array3());

        // Задание №1.6

       System.out.println(Num.Array1or3());

        // Задание №2.1

       Num.SortArr();

        // Задание №2.2

       Num obj2 = new Num();
       System.out.println(obj2.ArrUsers());

        // Задание №2.3

       Num.Change();

        // Задание №2.4

       Num.Uni();

        // Задание №2.5

       Scanner in = new Scanner(System.in);
       System.out.println("Введите количество элементов массива: ");
       int number = in.nextInt();
       Num.ArrSort(number);

        // Лабораторная работа №5

        // Задание №1

       String text = "Написать метод для поиска самого длинного слова в тексте.";
       System.out.println(JText.LW(text));

       // Задание №2

       String word = "";
       System.out.println(JText.Poli(word));

        // Задание №3

       String textB = "Написать метод бяка для поиска самого длинного слова в тексте.";
       System.out.println(JText.Bjaka(textB));

        // Задание №4

       String mtext = "Написать метод слова для поиска самого длинного слова в тексте.";
       String etext = "слова";
       System.out.println(JText.Entry(mtext,etext));

        // Задание №5

       System.out.println("The given string is: This is a test string");
       System.out.println(JText.Revers("The given string is: This is a test string"));

        // Лабораторная работа №6

       Slave s = new Slave();
       s.Out();
       s.In();

    }

}