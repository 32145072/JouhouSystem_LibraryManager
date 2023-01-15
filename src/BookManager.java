import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class BookManager{
    public void register(String book_id,String book_title,String author,String category,boolean lend) throws IOException{
        // csvに書き込む
        //csvのファイル名
        String file_name = "..\\res\\Library.csv";  
        try {
            FileWriter fw = new FileWriter(file_name,true);
            fw.append(book_id + "," + book_title + "," + author + "," + category + "," + lend );
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
        // IDに一致する本の情報をLibrary.csvから削除
        String file_name = "..\\res\\Library.csv";
        ArrayList<String> book_list = Library.bookList();
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
        System.out.println("=======================================================================================================");
        System.out.println("以下のIDの本を蔵書から削除しました");
        System.out.println("id:"+delete_ID);
        System.out.println("=======================================================================================================");
    }
}