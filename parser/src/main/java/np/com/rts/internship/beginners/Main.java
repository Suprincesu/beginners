package np.com.rts.internship.beginners;

import java.io.BufferedReader;
import java.util.*;


public class Main {

  private String parseThis = "20160519150000-STX,6-3.0-CONF4";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here
    StringBuilder sb=new StringBuilder(parseThis);
    value= Double.parseDouble(sb.substring(21,24));
    System.out.println(value);
  }

  public static void main(String[] args) {
    new Main();
  }
}
