import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageDigestTest {
    final private static Logger logger = Logger.getLogger(MessageDigestTest.class.getName());

    public static void main(String[] args) {
        MessageDigest messageDigest = null;
        String hash = "35454B055CC325EA1AF2126E27707052";
        String password = "PASSWORD";

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes());
            byte[] digest = messageDigest.digest();

            logger.log(Level.INFO, " BYTE DATA : {0}", digest.toString());

            StringBuffer hexString = new StringBuffer();

            for (int index = 0; index<digest.length; index++){
                hexString.append(Integer.toHexString(0xFF & digest[index]));
            }

            logger.log(Level.INFO, " HASHED DATA : {0}", hexString.toString());

        } catch (NoSuchAlgorithmException e) {
            logger.log(Level.SEVERE, "ERROR : ", e);
        }
    }
}
