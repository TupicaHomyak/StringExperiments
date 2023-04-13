import java.util.Scanner;

public class Muuu {
    // перевод из строки в число
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите значения: ");
            Scanner scanner = new Scanner(System.in);

            String firstNumber = scanner.nextLine();
            String operation = scanner.nextLine();
            String secondNumber = scanner.nextLine();

            int firstNumberInt = Integer.parseInt(firstNumber);
            int secondNumberInt = Integer.parseInt(secondNumber);

            int result = 0;
            switch (operation) {
                case "+":
                    result = firstNumberInt + secondNumberInt;
                    break;
                case "-":
                    result = firstNumberInt - secondNumberInt;
                    break;
                case "*":
                    result = firstNumberInt * secondNumberInt;
                    break;
                case "/":
                    result = firstNumberInt / secondNumberInt;
                    break;
            }
            System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
        }
    }
}

