import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PasswordNeeded {
    // for password
    private static final String PASSWORD = "rayafreeborn";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter password to enter homepage: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(PASSWORD)){
            openHome();
        }
        else }
        System.out.println("Incorrect. See phrase at bottom of page.");
    }
    scanner.close();
}
private static void openHome(){
    try{
        File htmlFile = new File("Users/rayafreeborn/Desktop/HQ/index.html")
    }
    
}
}