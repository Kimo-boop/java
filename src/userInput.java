import java.util.Scanner;
public class userInput {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your Name?");
        String name = scanner.nextLine();

        System.out.println("Hello "+name);
    }


}
