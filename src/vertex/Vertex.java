package vertex;
import java.util.Scanner;   //импорт сканера
public class Vertex {

    public static void main(String[] args) { 
        //Условный оператор if в Java.Оператор switch
   
        /*
        //Ввести число на выбор: 1, 2 или 3.
        //Программа должна сказать какое число ввел пользователь.
        
        System.out.println("Введите число: 1, 2 или 3");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        
        if (i == 1){
            System.out.println("Вы ввели число 1");
        }
        else if(i == 2) {
            System.out.println("Вы ввели число 2");
        }
        else if(i == 3) {
            System.out.println("Вы ввели число 3");
        }
        else {
            System.out.println("Вы ввели другое число");
        }
        */
        
        
        //Оператор switch
        //(ветвление с помощью переключателей)
        
        //та же задача
        System.out.println("Введите число: 1, 2,3 или 4");
        Scanner inputFigure1 = new Scanner(System.in);
        int num = inputFigure1.nextInt();
        
        switch(num) {
            case 1: System.out.println("Вы ввели число 1"); break;
            case 2: System.out.println("Вы ввели число 2"); break;
            case 3: System.out.println("Вы ввели число 3"); break; 
            case 4: System.out.println("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели другое число");
        }
   
}
        
}
