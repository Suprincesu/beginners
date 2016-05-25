package np.com.rts.internship.beginners;

import java.io.BufferedReader;
import java.util.*;


public class Main {

  private String parseThis = "20160519150000-STX,6-3.0-CONF4";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here
    String ar[]=parseThis.split("-");
    System.out.println(ar[2]);
  }

  public static void main(String[] args) {
    new Main();
  }
}
