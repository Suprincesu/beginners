package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };

  public Main() {
    // Write your code here

      List<String> list=new ArrayList<String>();
      for(String s:strings){
          list.add(s);
      }
      //sorting the array
      Collections.sort(list);

      int length=list.size();

      System.out.println("Printing unsorted array..");
      for(int i=0;i<length;i++){
          System.out.println(strings[i]);
      }

      int i=0;
      for(String a:list){
          strings[i]=a;
          i++;
      }
      //printing the sorted strings array
      System.out.println("Printing the sorted strings array");
      for(i=0;i<strings.length;i++){
          System.out.println(strings[i]);
      }

      System.out.println("The last element of the arrray is "+ list.get(length-1));

  }

  public static void main(String[] args) {
    new Main();
  }
}
