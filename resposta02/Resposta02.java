package resposta02;

import java.util.Scanner;

public class Resposta02 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = leia.nextInt();
        leia.close();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        if (num < 0)
            return false;

        int a = 0, b = 1;
        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == num;
    }

}
