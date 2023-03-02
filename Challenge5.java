import java.util.Scanner;

public class Challenge5 {

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
