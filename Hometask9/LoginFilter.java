package Hometask9;
import java.util.Scanner;
import java.util.ArrayList;
public class LoginFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String>logins=new ArrayList<>();
        String input;
        System.out.println("Enter logins (for ending enter empty string): ");
        while (!(input=scanner.nextLine()).isEmpty()){
            logins.add(input);
        }
        scanner.close();
        System.out.println("Logins starts with f: ");
        for (String login:logins){
            if (login.startsWith("f")){
                System.out.println(login);
            }
        }
    }
}
