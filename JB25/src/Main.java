public class Main
{
    static void main(String[] args)
    {
        // Лабораторная работа №1
        
        Labs1.PrintText();
        Labs1.arifmetica1();
        Labs1.arifmetica2();
        Labs1.arifmetica3();
        Labs1.InputOutput();
        Labs1.Logic();

        // Лабораторная работа №2
        // задание №1

        Calculator obj1 = new Calculator();
        obj1.Calc();
        
        // задание №2

        String Name = "Piligrim";
        double Volume = 0.5;
        double Price = 200.00;
        Water object = new Water(Name, Volume, Price);
        System.out.println(object.getNameWater());
        System.out.println(object.getVolumeWater());       
        System.out.println(object.getPraiceWater());

        // Лабораторная работа №3
        // задание №1

        String x = "Изучение Java - это просто!";
        Study obj = new Study(x);
        System.out.println(obj.printCourse());
        
        // задание №2

        String Color1 = "Синий";
        int Mass1 = 35;
        Simple object1 = new Simple(Color1,Mass1);
        object1.Display();

        String Color2 = "Розовый";
        int Mass2 = 55;
        Simple object2 = new Simple(Color2,Mass2);
        object2.Display();

        // задание №3

        int Num1 = 5;
        int Year1 = 1988;
        String Name1 = "Pulcovo Village";
        Home House1 = new Home();
        House1.In(Num1,Year1,Name1);

        int Num2 = 18;
        int Year2 = 2007;
        String Name2 = "Iscra Sity";
        Home House2 = new Home();
        House2.In(Num2,Year2,Name2);

        House1.Out();
        System.out.println("Количество лет с момента постройке: " + House1.Year());
        House2.Out();
        System.out.println("Количество лет с момента постройке: " + House2.Year());

        // задание №4

        Tree tree1 = new Tree();
        System.out.println(tree1.Year);
        System.out.print(tree1.Life + "\n");
        System.out.println(tree1.Name + "\n");

        Tree tree2 = new Tree(22, "Осина");
        System.out.println(tree2.Year);
        System.out.print(tree2.Life + "\n");
        System.out.println(tree2.Name + "\n");

        Tree tree3 = new Tree(13, true,"Береза");
        System.out.println(tree3.Year);
        System.out.print(tree3.Life + "\n");
        System.out.println(tree3.Name + "\n");

    }

}