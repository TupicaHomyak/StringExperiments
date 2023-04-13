import java.util.Scanner;

public class Nuuu {
    public static void main(String[] args) {
        // конкатенация и сравнение строк
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            String world1 = scanner1.next();
            String world2 = scanner2.next();

            boolean isEqual = world1.equals(world2);
            if (isEqual == true)
                System.out.println(world1 + " = " + world2);
            else if (isEqual == false)
                System.out.println(world1 + " != " + world2);
        }
    }
}
