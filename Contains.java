// ContainsとArrays.asListについて

import java.util.*;

public class Contains {
    // global
    static ArrayList<Integer> call = new ArrayList<>(Arrays.asList(1,2,3));

    public static void main(String[] args) {
        // System.out.println(Arrays.asList(call).contains(1)) = false
        // System.out.println(call.contains(1)) = true
        
        System.out.println(call.contains(4));
    }
}
