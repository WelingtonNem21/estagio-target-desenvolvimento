package resposta05;

import java.util.Scanner;

public class Resposta05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = leia.nextLine();
        leia.close();

        String reversed = invertString(input);
        System.out.println("String invertida: " + reversed);
    }

    public static String invertString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
