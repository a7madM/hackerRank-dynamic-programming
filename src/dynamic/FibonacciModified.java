package dynamic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by a7medM on 5/15/2016.
 */
public class FibonacciModified {

    public FibonacciModified() {
        Scanner scanner = new Scanner(System.in);
        BigInteger first = scanner.nextBigInteger();
        BigInteger second = scanner.nextBigInteger();
        int desired = scanner.nextInt();
        BigInteger output = new BigInteger(second + "");
        for (int i = 3; i <= desired; i++) {
            output = output.pow(2).add(first);
            first = second;
            second = output;
        }

        System.out.println(output);

    }
}
