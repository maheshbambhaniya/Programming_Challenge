import java.util.Scanner;

public class Programming_Challenge_1 {
    public static void main(String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine(); // do not change this
        int[] freq = new int[128];
        for(char i : inputLine.toCharArray()) freq[i]++;
        for(int i=0;i<inputLine.length();i++){
            if(freq[inputLine.charAt(i)] == 1) {
                System.out.print(inputLine.charAt(i));
                break;
            }
        }

    }
}