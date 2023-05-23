import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 8;
        System.out.println("Generated password: " + generatePassword(length));
    }

    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder password = new StringBuilder();
        Random rnd = new Random();
        while (password.length() < length) {
            int index = (int) (rnd.nextFloat() * characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}

