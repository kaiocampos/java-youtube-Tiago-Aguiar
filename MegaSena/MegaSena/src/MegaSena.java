import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MegaSena {
    public static void main(String[] args) {
        Random generate = new Random();
        
        int count = 0;
        while (count < 6){
            int number = generate.nextInt(60);
            System.out.println(number);
            count++;
        }

    }
}