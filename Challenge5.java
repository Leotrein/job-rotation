import java.util.Scanner;

public class Challenge5 {

    /*
     * Escreva um programa que inverta os caracteres de um string.
     * 
     * a) Essa string pode ser informada através de qualquer entrada de sua
     * preferência ou pode ser previamente definida no código;
     * b) Evite usar funções prontas, como, por exemplo, reverse;
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a String: ");
        String text = scan.nextLine();

        StringBuffer sb = new StringBuffer();

        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        System.out.println("Reverse: " + sb.toString());
        scan.close();

    }

}
