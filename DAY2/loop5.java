package DAY2;

import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n+" * "+i+" = "+n*i);
            }
        }
    }
}
