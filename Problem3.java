import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("What is the quote?");
        String ans = x.nextLine();
        System.out.println("Who said it?");
        String ans2 = x.nextLine();
        System.out.println(ans2 + " says, \"" +ans + "\"");
    }
}
