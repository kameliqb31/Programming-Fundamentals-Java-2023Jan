package BasicSyntaxConditionalStatementsLoops.Exersice;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length() - 1; position >= 0; position--) {
          char currentSymbol = userName.charAt(position);
          password += currentSymbol;
        }

    }
}
