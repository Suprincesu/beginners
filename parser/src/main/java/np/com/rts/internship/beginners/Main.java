package np.com.rts.internship.beginners;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.*;


public class Main {

  private String parseThis = "3127162:261111\n" +
          "TUY-7.4/1\n" +
          "DPOG5";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here

    int len=parseThis.length();
      char character[] = new char[len];
      for(int i=0;i<len;i++) {
        character[i]=parseThis.charAt(i);
      }

    int ascii[]=new int[character.length];
    for(int i=0;i<character.length;i++){
      ascii[i]=(int)character[i];
    }

    for(int i=0;i<ascii.length;i++){
      ascii[i]-=1;
    }

    for(int i=0;i<ascii.length;i++){
      character[i]=(char)ascii[i];
    }
    String str=String.valueOf(character);
    System.out.println(str);

    System.out.println(str.substring(21,24));


  }

  public static void main(String[] args) {
    new Main();
  }
}
