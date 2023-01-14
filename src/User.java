import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
public class User{

    //ユーザの一覧リストを返す
    public static ArrayList<String> userList() {
        BufferedReader br = null;
        // String[][] book_list =  new String[2][];
        ArrayList<String> user_list = new ArrayList<>();
        String file_name = "..\\res\\User.csv"; // 入力ファイル
        try {
        File file = new File(file_name);
        br = new BufferedReader(new FileReader(file));
        // readLineで一行ずつ読み込む
        String line; // 読み込み行
        while ((line = br.readLine()) != null) {
        user_list.add(line);
        }
        } catch (Exception e) {
        System.out.println(e.getMessage());
        } finally {
        try {
        br.close();
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        }
        return user_list;
    
    }

    //登録されているユーザの情報を一覧表示
    public void all(){
        System.out.println("");
        System.out.println("全てのユーザを表示します．");
        System.out.println("=================================================");
        System.out.println("ID 貸出 貸出本情報(ID 借り日 返却期限日)");
        BufferedReader br = null;
        String file_name = "..\\res\\User.csv"; // 入力ファイル
        try {
        File file = new File(file_name);
        br = new BufferedReader(new FileReader(file));
        // readLineで一行ずつ読み込む
        String line; // 読み込み行
        String[] data; // 分割後のデータを保持する配列
        while ((line = br.readLine()) != null) {
        // lineをカンマで分割し、配列dataに設定
        data = line.split(",");
        // 1行分の読み込みデータを表示（データ間にスペース）
        for (int i = 0; i < data.length; i++) {
        System.out.print(data[i] + " ");
        }
        System.out.println();
        }
        } catch (Exception e) {
        System.out.println(e.getMessage());
        } finally {
        try {
        br.close();
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        }
        System.out.println("=================================================");
        }

    //ユーザの人数を表示する
    public void amount(){
        System.out.println("合計:"+userList().size()+"人");
    }
}
    
