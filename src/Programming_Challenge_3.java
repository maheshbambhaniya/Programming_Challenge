import java.util.Scanner;

public class Programming_Challenge_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine(); // do not change this
        int numRows = Integer.parseInt(inputLine);
        for (int i = 1; i <= numRows; i++) {
            String spaces = " ".repeat(numRows - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }

    }
}
