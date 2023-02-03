import java.awt.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // Primitive var and reference variable
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;

        // String variable
        String message = "   hello world" + "!!   ";
        message.endsWith("!!");
        // indexOf replace toUpperCase subString endWith trim
        // System.out.println(message.substring(4, 7));
        // System.out.println(message);

        // Arrays
        int[] numbers = { 2, 4, 1, 3, 6, 7 };
        int[][] matrix = new int[2][3];
        int[][][] cube = new int[2][2][2];
        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 } };

        matrix[0][0] = 1; // deepToString to show in output

        Arrays.sort(numbers);
        System.out.println(Arrays.deepToString(matrix2));

        // float final is like const
        final float PI = 3.14F;

        // Math Arithmatic
        double result = (double) 10 / (double) 3;

        int x = 1;
        int y = x++; // outcome: x = 2, y = 1
        int z = ++x; // outcome: x = 2, z = 2

        // implicit casting
        // byte > short > int > long > float > double
        double m = 1.1;
        String string = "1";
        int n = Integer.parseInt(string) + 2;

        Math.round(1.1F); // outcome: 1
        Math.ceil(1.1F);// outcome: 2.0
        Math.max(10, 20);
        System.out.println();

    }
}
