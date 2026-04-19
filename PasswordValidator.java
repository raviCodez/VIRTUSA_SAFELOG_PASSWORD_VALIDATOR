import java.util.*;

public class PasswordValidator {

    static boolean hasUpperCaseBoolean;
    static boolean hasDigitBoolean;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    while(true){
    System.out.println("Enter the password :");
    String password = sc.nextLine();

    if(isValidPassword(password)){
        System.out.println("Password is valid");
        break;
    } else {
        if(password.length() < 8){
            System.out.println("Too short");
        }
        if(!hasUpperCaseBoolean){
            System.out.println("Password must contain at least one uppercase letter");
        }
        if(!hasDigitBoolean){
            System.out.println("Password must contain at least one digit");
        }
    }
}
    }

    public static boolean isValidPassword(String password){
        hasUpperCaseBoolean= hasUpperCase(password);
        hasDigitBoolean=hasDigit(password);

        
        if(password.length()<8){
            return false;
        }

        


        return hasUpperCaseBoolean && hasDigitBoolean;

    }

    public static boolean hasUpperCase(String password){
        for(int i=0;i<password.length();i++){
            if(isUpperCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean isUpperCase(char ch){
        return ch>='A' && ch<='Z';
    }

    public static boolean hasDigit(String password){
        for(int i=0;i<password.length();i++){
            if(isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean isDigit(char ch){
        return ch>='0' && ch<='9';
    }
}