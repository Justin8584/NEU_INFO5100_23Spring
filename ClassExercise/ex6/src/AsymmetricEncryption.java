import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class AsymmetricEncryption {

    public static void main(String[] args) throws Exception {
        // Generate an RSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Alice encrypts a message using Bob's public key and sends it to Bob
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        String message = "Hello Bob! (using Bob's public key)";
        byte[] encrypted = cipher.doFinal(message.getBytes());
        System.out.println("Alice sends encrypted message to Bob: " + new String(encrypted));

        // Bob decrypts the message using his private key
        cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
        byte[] decrypted = cipher.doFinal(encrypted);
        System.out.println("Bob received decrypted message from Alice: " + new String(decrypted));
    }

}
