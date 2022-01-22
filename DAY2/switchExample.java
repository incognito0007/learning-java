package DAY2;

import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
            switch (button) {
                case 1:
                    System.out.println("namaste");
                    break;
                case 2:
                    System.out.println("Hello");
                    break;
                case 3:
                    System.out.println("bonjour");
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}
