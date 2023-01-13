import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class BookManager{
    public void register(String book_id,String book_title,String author,boolean lend,String category) throws IOException{
        // インスタンス作成
        // Book book = new Book(book_id,book_title,author,lend,category);
        // csvに書き込む
        //csvのファイル名
        String file_name = "..\\res\\Libraly.csv";  
        try {
            FileWriter fw = new FileWriter(file_name,true);
            fw.append(book_id + "," + book_title + "," + author + "," + lend + "," + category);
            fw.append("\n");
            fw.flush();
            fw.close();
            // 登録完了
            System.out.println("");
            System.out.println("=======================================================================================================");
            System.out.println("以下の本の登録が完了しました");
            System.out.println("id:"+book_id+" "+"タイトル:"+book_title+" "+"著者:"+author+" "+"カテゴリー:"+" "+category);
            System.out.println("=======================================================================================================");
            System.out.println("");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void delete(String delete_ID){
        // IDに一致する本の情報をLibraly.csvから削除
        String file_name = "..\\res\\Libraly.csv";
        ArrayList<String> book_list = Libraly.book_List();
        try {
            FileWriter fw = new FileWriter(file_name);
            for(int i=0; i<book_list.size(); i++){
                if(book_list.get(i).split(",")[0].equals(delete_ID)){
                    // 何も処理をしない
                } else {
                    fw.append(book_list.get(i));
                    fw.append("\n");
                }
            }
            fw.flush();
            fw.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}