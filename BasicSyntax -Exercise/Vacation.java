package BasicSyntaxConditionalStatementsLoops.Exersice;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String people = scanner.nextLine();
        String day = scanner.nextLine();

        double sum = 0;

        switch (day) {
            case "Friday":
                if (people.equals("Students")) {
                    sum = number * 8.45;
                } else if (people.equals("Business")) {
                    sum = number * 10.90;
                } else if (people.equals("Regular")) {
                    sum = number * 15;
                }
                break;
            case "Saturday":
                if (people.equals("Students")) {
                    sum = number * 9.80;
                } else if (people.equals("Business")) {
                    sum = number * 15.60;
                } else if (people.equals("Regular")) {
                    sum = number * 20;
                }
                break;
            case "Sunday":
                if (people.equals("Students")) {
                    sum = number * 10.46;
                } else if (people.equals("Business")) {
                    sum = number * 16;
                } else if (people.equals("Regular")) {
                    sum = number * 22.50;
                }
                break;
        }
        if (people.equals("Students") && number >= 30) {
            sum = sum * 0.85;
        } else if (people.equals("Business") && number >= 100) {
            sum = sum + (number - 10);
        } else if (people.equals("Regular") && number >= 10 && number <= 20) {
            sum = sum * 0.95;
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
