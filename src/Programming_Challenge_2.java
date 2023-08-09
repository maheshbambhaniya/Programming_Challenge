import java.util.Scanner;

public class Programming_Challenge_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine(); // do not change this
        boolean flag = true;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        inputLine = inputLine.toLowerCase(); // Convert the input string to lowercase
        for (char letter : alphabet.toCharArray()) {
            if (inputLine.indexOf(letter) == -1) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.print("true");
        else System.out.print("false");

    }
}
