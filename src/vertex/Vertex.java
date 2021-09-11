package vertex;
import java.util.Scanner;   //импорт сканера
public class Vertex {

    public static void main(String[] args) {
        //Конкатенация строк
        /*
        String studies1 = "учиться очень легко и интересно";
        String studies2 = "учиться очень трудно, но нужно";
      
        System.out.println("Каждому понятно, что " + studies1);
        System.out.println("Каждому понятно, что " + studies2);
         System.out.println("Каждому понятно, что " + studies2);
          System.out.println("Каждому понятно, что " + studies2);
        */
        
        /*Задача1
        Пользователь должен ввести в консоль любое целое число от 1 до 10.
        А программа выведет ему ответ: какое число он ввел.
        
        System.out.println("Введите любое целое число от 1 до 10: ");   
        //просим пользователя ввести число
        Scanner scan = new Scanner(System.in);   //объявляем сканер
        int number = scan.nextInt();   
        //метод сканера считывать целые числа(int) с консоли и присвоить его переменной number
        System.out.println("Вы ввели число: " + number);
        */
        
        /*Задача2
        Пользователь вводит два целых числаю
        Нужно вывести в консоль сумму этих двух чисел.
        
        
        System.out.println("Введите в консоль два любых целых числа: ");
        Scanner one = new Scanner(System.in);
        int num1 = one.nextInt();
        int num2 = one.nextInt();
        System.out.println(num1 + num2);t
        
        */
        
        /*
        Ввести несколько любых слов или фраз.
        */
        
        Scanner two = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу:");

        String phrase1 = two.nextLine();
        String phrase2 = two.nextLine();
        String phrase3 = two.nextLine();
        String phrase4 = two.nextLine();
        System.out.println(phrase1 + " " + phrase2 + " " + phrase3 + " " +  phrase4);
        
        
    }
    
}
