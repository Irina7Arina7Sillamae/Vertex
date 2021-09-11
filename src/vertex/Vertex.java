package vertex;
import java.util.Scanner;   //импорт сканера
public class Vertex {

    public static void main(String[] args) { 
        /*
        //Ввести несколько любых слов или фраз.
        Scanner two = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу:");

        String phrase1 = two.nextLine();
        String phrase2 = two.nextLine();
        String phrase3 = two.nextLine();
        String phrase4 = two.nextLine();
        System.out.println(phrase1 + " " + phrase2 + " " + phrase3 + " " +  phrase4);
        */
        
        //пользователь вводит любое слово или фразу
        //программа считывает его и выводит до первого пробела / метод next()
        /*
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу:");
        String phrase1 = sc1.next();
        System.out.println(phrase1);
        */
        
        
        //пользователь вводит в консоль любое дробное число
        //программа считывает его и выводит в консоль / метод Double()
        /*
        System.out.println("Введите любое дробное число:");
        Scanner scan2 = new Scanner(System.in);
        Double num = scan2.nextDouble();
        
        System.out.println(num);
        */
        
        //КОНСТАНТА
        //Вычислить периметр круга при разных значениях радиуса(10см и 25см)
        
        final double Pi = 3.1415926536; 
        //переменную с именем Pi сделали константой, добавив ключевое слово final
        
        double lenght1 = 2*Pi*10;
        double lenght2 = 2*Pi*25;
        
        System.out.println("Периметр круга при радиусе 10 см равен: " + lenght1 + 
                ", а при  радиусе 25 см равен: " + lenght2);
        
}
