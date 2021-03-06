package stage5.array;

import java.util.Scanner;

public class FixingStringIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        if(string.length()<=index || string.length()<0){
            System.out.println("Out of bounds!");
        }
        System.out.println(string.charAt(index));
    }
}
/* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();

        if (index <= (string.length() - 1) && index >= 0) {
            System.out.println(string.charAt(index));
        } else {
            System.out.println("Out of bounds!");
        }

 */