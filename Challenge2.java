import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int number = scan.nextInt();

        List<Integer> fibonacci = Stream.iterate(new Integer[] { 0, 1 }, x -> new Integer[] { x[1], x[0] + x[1] })
                .map(x -> x[0]).limit(number + 5).collect(Collectors.toList());

        boolean verify = fibonacci.contains(number);
        if (verify) {
            System.out.println("YES, belong to fibonacci");
        } else
            System.out.println("NO, does not belong to fibonacci");

        scan.close();

    }

}
