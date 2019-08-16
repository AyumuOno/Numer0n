import java.util.*;

public class Ans {

  // field
  int[] ans_num = new int[3];
  ArrayList<Integer> ans_list = new ArrayList<Integer>();


  // instance
  Ans(){
    // -- add list from 1 to 9 and shuffle --
    for (int i = 0; i < 9; i++){
      ans_list.add(i+1);
    }
    Collections.shuffle(ans_list);

    // -- decide ans number --
    for (int j = 0; j < ans_num.length; j++) {
      ans_num[j] = ans_list.get(j);
    }
  }

  // method

  //
  // public int collation(){
  //
  // }

}
