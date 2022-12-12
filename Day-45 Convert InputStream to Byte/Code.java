import java.io.InputStream;
import java.util.Arrays;
import java.io.ByteArrayInputStream;


public class Main {

  public static void main(String args[]) {

    try {

      // create an input stream
      byte[] input = {1, 2, 3, 4};
      InputStream stream = new ByteArrayInputStream(input);
      System.out.println("Input Stream: " + stream);

      // convert the input stream to byte array
      byte[] array = stream.readAllBytes();
      System.out.println("Byte Array: " + Arrays.toString(array));

      stream.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}
