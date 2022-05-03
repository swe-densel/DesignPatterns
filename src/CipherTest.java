import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CipherTest {
    final private static Logger logger = Logger.getLogger(CipherTest.class.getName());

    public static void main(String[] args) {
        Signature sign = null;
        KeyPairGenerator keyPairGen = null;

        try {
            //algorithm
            sign = Signature.getInstance("SHA256withRSA");
            keyPairGen = KeyPairGenerator.getInstance("RSA");

            //key size
            keyPairGen.initialize(2048);
            //generate key
            KeyPair keyPair = keyPairGen.generateKeyPair();

            //action - ENCRYPTION, use getPublic()
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());

            //data
            byte[] input = "Encrypted Message".getBytes();
            cipher.update(input);

            //result
            byte[] cipherText = cipher.doFinal(); //making sure / commit / once encrypted, keep it
            logger.log(Level.INFO, "ENCRYPTED RAW DATA : {0}", cipherText);
            logger.log(Level.INFO, "ENCRYPTED DATA : {0}",
                    new String(cipherText, "UTF8"));

            //action - DECRYPTION, use getPrivate()
            cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());

            byte[] decipheredText = cipher.doFinal(cipherText);

            logger.log(Level.INFO, "DECRYPTED DATA : {0}",
                    new String(decipheredText, "UTF8"));

        } catch (NoSuchAlgorithmException | NoSuchPaddingException |
                InvalidKeyException | IllegalBlockSizeException |
                BadPaddingException | UnsupportedEncodingException e){
            //dapat SEVERE sa exceptions
            logger.log(Level.SEVERE, "KNOWN ERROR : ", e);

        } catch (Exception e){
            logger.log(Level.SEVERE, "UNKNOWN ERROR : ", e);
        }
    }
}
