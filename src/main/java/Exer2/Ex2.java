package Exer2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Enter the number of test cases:");
        int numberOfTestCases = scanner.nextInt();

        for (int i = 1; i <= numberOfTestCases; i++) {
            int longitud = scanner.nextInt();
            String numero = scanner.next();
            solve(longitud, numero);
        }

        scanner.close();

    }

    public static void solve (int longitud, String numero) {

        String[] siete = {
                "1111110",
                "0110000",
                "1101101",
                "1111001",
                "0110011",
                "1011011",
                "0011111",
                "1111111",
                "1110011"
        };

        String currentShow = "0000000";
        String currentNumber = "";
        int contSwitch = 0;

        for (int i = 0; i < longitud; i++) {

            currentNumber = siete[Character.getNumericValue(numero.charAt(i))];
            for (int j = 0; j < 7; j++ ) {

                if (currentNumber.charAt(j) != currentShow.charAt(j)) {
                    contSwitch++;

                }
            }

            currentShow = currentNumber;

        }

        System.out.println(contSwitch);

    }
}
