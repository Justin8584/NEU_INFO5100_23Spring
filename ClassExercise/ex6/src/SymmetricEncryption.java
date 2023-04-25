import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.security.SecureRandom;

public class SymmetricEncryption {

    public static void main(String[] args) throws Exception {
        // Generate a secret key
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();

        // Alice encrypts a message and sends it to Bob
        byte[] iv = generateRandomBytes(12); // Generate a random IV
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec spec = new GCMParameterSpec(128, iv);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, spec);
        String message = "Hello Bob! (and encrypted this message.)";
        byte[] encrypted = cipher.doFinal(message.getBytes());
        System.out.println("Alice sends encrypted message to Bob: " + new String(encrypted));

        // Bob decrypts the message
        cipher.init(Cipher.DECRYPT_MODE, secretKey, spec);
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("Bob received decrypted message from Alice: " + new String(decrypted));
    }

    private static byte[] generateRandomBytes(int length) {
        byte[] bytes = new byte[length];
        new SecureRandom().nextBytes(bytes);
        return bytes;
    }

}
