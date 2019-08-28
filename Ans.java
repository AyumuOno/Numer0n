import java.util.*;

public class Ans {

    // field
    ArrayList<Integer> ans_num = new ArrayList<Integer>();
    ArrayList<Integer> ans_list = new ArrayList<Integer>();
    final int ANS_LENGTH = 3;

    // instance
    Ans(){
        // -- add list from 1 to 9 and shuffle --
        for (int i = 0; i < 9; i++){
            ans_list.add(i+1);
        }
        Collections.shuffle(ans_list);

        // -- decide ans number --
        for (int j = 0; j < ANS_LENGTH; j++) {
            ans_num.add(ans_list.get(j));
        }
    }



}
