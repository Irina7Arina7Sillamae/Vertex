package vertex;
import java.util.Scanner;   //импорт сканера
public class Vertex {

    public static void main(String[] args) {      
        //Ввести несколько любых слов или фраз.
        Scanner two = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу:");

        String phrase1 = two.nextLine();
        String phrase2 = two.nextLine();
        String phrase3 = two.nextLine();
        String phrase4 = two.nextLine();
        System.out.println(phrase1 + " " + phrase2 + " " + phrase3 + " " +  phrase4);
        
        
    }
    
}
