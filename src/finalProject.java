import java.util.Scanner;

public class finalProject {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Double celsius;
        Double fahrenheit;

        int maxTimes = 3;
        for (int times = 3; times > 0; times--){
            System.out.println("Enter Temperature Farenheit: ");
            fahrenheit = keyboard.nextDouble();
            celsius = (fahrenheit-32)*(0.5556);
            System.out.println("Temperature in celsius: " +celsius);
        }


    }
}
