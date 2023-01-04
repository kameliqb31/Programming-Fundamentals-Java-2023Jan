package BasicSyntaxConditionalStatementsLoops.Exersice;

import java.util.Scanner;

public class PrintAndAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            System.out.print(i + " ");
            totalSum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", totalSum);
    }
}
