import java.util.*;

public class Numer0n {
    // global
    static Integer input_num = 0;
    static ArrayList<Integer> call = new ArrayList<>(Arrays.asList(0,0,0));

    public static void main(String[] args) {
        // Create the instance "ans"
        Ans ans = new Ans();
        Scanner scanner = new Scanner(System.in);

        // field
        // User answer

        int insert_num_to_call = 0;

        // -- Check to ans_num length --
        // System.out.println(ans.ans_num.length);

        // ** There is for debug **
        System.out.println("> Answer number is " + ans.ans_num);

        System.out.print("入力してください > ");
        System.out.println("Your call is " + call);

        while(true){
            System.out.print(">> ");
            String input_num_str = scanner.nextLine();
            if(isNum(input_num_str)){
                //print the input number
                System.out.println(input_num + "が入力されました");

                // **  all return false ** --> fixed
                // --> contains(object): Can conpare different types.(int:String)
                // System.out.println(">> " + Arrays.asList(call).contains(input_num));
                if (isOnly(input_num) || input_num <= 0 || 10 <= input_num){
                    // Entered a duplicate number
                    System.out.println("** 1~9の数字を重複なく入力してください **");
                }else{
                    call.set(insert_num_to_call, input_num);
                    insert_num_to_call++;
                }
            }
            System.out.println("Your call is" + call);
            System.out.println();

            if(3 <= insert_num_to_call) break;

        }

    }

    static boolean isNum(String number) {
        try {
            input_num = Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("** 一桁の数字を入力してください **");
            return false;
        }
    }

    static boolean isOnly(int num){
         if (call.contains(num)) {
             return true;
         } else {
             return false;
         }
    }

    static boolean isCollation(){
        
    }
}
