import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Libraly{
    public static List<String> Library_list = new ArrayList<String>();
    public static void readcsv1(){ 
        String filename = "lmsystem\\res\\Libraly.csv";
        File file = new File(filename);
        int count = 0;
        if (!file.exists()) {
            System.out.print("ファイルが存在しません");
            return;
        }
        try (FileReader fileReader = new FileReader(filename); 
			 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] arrayStr = line.split(",");
                
				for (String str : arrayStr) {
					// System.out.println(str);
                    Library_list.add(count,str);
				}
                count ++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
        System.out.println(Library_list);
    }
    public static void readcsv(){
        BufferedReader br = null;
        String file_name = "lmsystem\\res\\Libraly.csv"; // 入力ファイル
        // データの最大個数
        final int MAX_DATA_NUMS = 100;
        // データを格納する2次元配列
        String[][] data = new String[MAX_DATA_NUMS][];
        try {
        File file = new File(file_name);
        br = new BufferedReader(new FileReader(file));
        // readLineで一行ずつ読み込む
        int index = 0;
        String line;
        while ((line = br.readLine()) != null) {
        // lineをカンマで分割し、配列dataに保持
        data[index] = line.split(",");
        index++;
        }
        // catch-finally部分は同様なので省略
        }catch (Exception e) {
            System.out.println(e.getMessage());
            } finally {
            try {
            br.close();
            } catch (Exception e) {
            System.out.println(e.getMessage());
            }
            }
        // 配列に格納したデータを表示（データ間にスペース）
        for (int i = 0; i < MAX_DATA_NUMS; i++) {
        // データがなくなったら終了
        if (data[i] == null) break;
        for (int j = 0; j < data[i].length; j++) {
        // System.out.print(data[i][j] + " ");
        }
        // System.out.println();
        }
        for (int i = 0;,i < data.size)
    }
    
	
    // public void show_books(){
    //     // 蔵書の全てのオブジェクトを返す
    //     int list_size = book_list.size();
    //     System.out.println("蔵書一覧");
    //     System.out.println("=================================================================");
    //     for (int i = 0; i < list_size; i ++){
    //         Book book = book_list.get(i);
    //         System.out.println(i+1+": "+"id: "+book.id+", title "+book.title+", 著者 "+book.author+", 貸し状況 "+book.lend+", カテゴリー "+book.category);
    //     }
    //     System.out.println("=================================================================");
    // }

}

