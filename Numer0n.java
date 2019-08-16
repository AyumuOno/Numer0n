import java.util.*;

public class Numer0n {

  public static void main(String[] args) {
    // Create the instance "ans"
    Ans ans = new Ans();

    // -- Check to ans_num length --
    // System.out.println(ans.ans_num.length);

    // -- There is for debug
    // -- from  here
    System.out.println("> Answer number is ");

    for (int i = 0; i < ans.ans_num.length; i++) System.out.print(ans.ans_num[i] + " ");
    System.out.println();

    // to here

    Scanner scanner = new Scanner(System.in);
     // 入力を促すメッセージ
    System.out.print("入力してください > ");

    //入力された内容をインスタンスから取得
    String input_num = scanner.nextLine();

    //入力された内容を画面に表示
    System.out.println(input_num + "が入力されました");

    // Scannerクラスのインスタンスをクローズ
    scanner.close();
  }

}
