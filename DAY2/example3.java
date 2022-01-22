package DAY2;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                System.out.println("equal");
            } else {
                if (a>b) {
                    System.out.println("a graeter than b");
                } else {
                    System.out.println("b graeter than a");
                }
            }
        }
    }
}
