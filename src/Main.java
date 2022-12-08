import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Lesson1
    int NumOne;
    int NumTwo;
    int NumThree;

//    -5 + 8 * 6
//    (55+9) % 9

    NumOne = -1;
    NumTwo = 16;
    NumThree = 6;


    System.out.println("Sum = " + (NumOne + NumTwo));
    System.out.println("Divide = " + (NumOne / NumTwo));

    int n = 2;
    System.out.println("Sqr = " + (n*n));

    //3
//    •Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
//    Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
//    Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
//    Распечатайте её через println. Сколько программа отбросила в дробной части?
    int Num1 = 0;
    int Num2 = 1;
    int Num3 = 2;
    int Num4 = 3;
    int Num5 = 4;
    int Num6 = 5;
    int Num7 = 6;
    int Num8 = 7;
    int Num9 = 8;
    int Num10 = 9;

    int SumNumInt = (Num1 + Num2 + Num3 + Num4 + Num5 + Num6 + Num7 + Num8 + Num9 + Num10)/10;
    double SumNumDouble = (Num1 + Num2 + Num3 + Num4 + Num5 + Num6 + Num7 + Num8 + Num9 + Num10)/10.0;

    System.out.println("ResultInt = " + SumNumInt);
    System.out.println("ResultDouble = " + SumNumDouble);

    //4
    /*
    •Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
    Если клиент покупает товары вместе, то на них действует скидка 10% руб на всю покупку.

    Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
    Отдельно выведите на экран сумму скидки от этой покупки.
    */

    double priceA = 1000;
    double priceB = 500;

    double discount = (priceA + priceB) * 0.1;

    System.out.println();
    System.out.println("Task4---------------");
    System.out.println("PriceWithDiscount = " + (priceA + priceB - discount));
    System.out.println("Discount = " + discount);

    //5

    Scanner input = new Scanner(System.in);

    String testStr = "Привет %s! Как дела?\n";
    String nameIvan = "Ivan";
    String namePeter = "Peter";

    System.out.printf(testStr, nameIvan);
    System.out.printf(testStr, namePeter);

    System.out.println("Inter Name, please: ");
    String nameInput = input.next();//nextInt();
    System.out.printf(testStr, nameInput);
  }
}