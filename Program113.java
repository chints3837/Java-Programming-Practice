import java.util.Base64;

public class Program113 {
    public static void main(String[] args) {
        String secret = "my-super-secret-key";
        String base64Secret = Base64.getEncoder().encodeToString(secret.getBytes());
        System.out.println("Base64-encoded secret: " + base64Secret);
    }
}