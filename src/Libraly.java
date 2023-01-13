import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
public class Libraly{

    public static ArrayList<String> book_List() {
        BufferedReader br = null;
        // String[][] book_list =  new String[2][];
        ArrayList<String> book_list = new ArrayList<>();
        String file_name = "..\\res\\Libraly.csv"; // 入力ファイル
        try {
        File file = new File(file_name);
        br = new BufferedReader(new FileReader(file));
        // readLineで一行ずつ読み込む
        String line; // 読み込み行
        while ((line = br.readLine()) != null) {
        book_list.add(line);
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
        return book_list;
    
    }

    public void all(){
        System.out.println("");
        System.out.println("全ての蔵書を表示します．");
        System.out.println("=================================================");
        System.out.println("ID タイトル 著者 貸出 カテゴリ");
        BufferedReader br = null;
        String file_name = "..\\res\\Libraly.csv"; // 入力ファイル
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

    public void amount(){
        ArrayList<String> bl = book_List();
        System.out.print(bl.size());
    }
}
    

//本の冊数を表示する