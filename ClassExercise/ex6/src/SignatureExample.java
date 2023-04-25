import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

public class SignatureExample {

    public static void main(String[] args) throws Exception {
        // Generate an RSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Alice signs a message using private key and sends it to Bob along with the message
        String message = "Hello Bob! (using private key)";
        byte[] messageBytes = message.getBytes();
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(keyPair.getPrivate());
        signature.update(messageBytes);
        byte[] signedBytes = signature.sign();
        System.out.println("Alice sends signed message to Bob: " + new String(messageBytes));
        System.out.println("Alice sends signature to Bob: " + new String(signedBytes));

        // Bob verifies the signature using Alice's public key
        signature.initVerify(keyPair.getPublic());
        signature.update(messageBytes);
        boolean verified = signature.verify(signedBytes);
        if (verified) {
            System.out.println("Bob received and verified message from Alice: " + message);
        } else {
            System.out.println("Bob received message, but the signature is not valid");
        }
    }

}
