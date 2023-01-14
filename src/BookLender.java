import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;


public class BookLender{
    
    public void lend(String book_ID, String user_ID){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        SimpleDateFormat date_f = new SimpleDateFormat("yyyy/MM/dd");
        ArrayList<String> book_list = Libraly.bookList();
        ArrayList<String> user_list = User.userList();
        String file_name_user = "..\\res\\User.csv";
        String file_name_libraly = "..\\res\\Libraly.csv";
        String today = date_f.format(date);
        calendar.add(Calendar.DATE, 7);
        String limit = date_f.format(calendar.getTime());

        // Libraly.csv => falseからtrueに書き換え
        // User.csv => 貸出をfalseからtrueに変更。貸出情報を加える
        // ID 借り日　返却期限
        
        try {
            FileWriter fw_libraly = new FileWriter(file_name_libraly);
            FileWriter fw_user = new FileWriter(file_name_user);
            for(int i=0; i<book_list.size(); i++){
                if(book_list.get(i).split(",")[0].equals(book_ID)){
                    fw_libraly.append(book_list.get(i).replace("false", "true,"+user_ID));
                    fw_libraly.append("\n");
                    for(int j=0; j<user_list.size(); j++){
                        if(user_list.get(j).split(",")[0].equals(user_ID)){
                            fw_user.append(user_list.get(j).replace("false", "true"));
                            fw_user.append(","+book_list.get(i).split(",")[0]+","+today+","+limit);
                            fw_user.append("\n");
                        } else {
                            fw_user.append(user_list.get(j));
                            fw_user.append("\n");
                        }
                    }
                } else {
                    fw_libraly.append(book_list.get(i));
                    fw_libraly.append("\n");
                }
            }
            fw_libraly.flush();
            fw_libraly.close();
            fw_user.flush();
            fw_user.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void bookReturn(String book_ID, String user_ID){
        
        ArrayList<String> book_list = Libraly.bookList();
        ArrayList<String> user_list = User.userList();
        String file_name_user = "..\\res\\User.csv";
        String file_name_libraly = "..\\res\\Libraly.csv";

        // Libraly.csv => trueからfalseに書き換え
        // User.csv => 貸出をtrueからfalseに変更。貸出情報を削除
        // 貸出情報 : ID 借り日　返却期限
        
        try {
            FileWriter fw_libraly = new FileWriter(file_name_libraly);
            FileWriter fw_user = new FileWriter(file_name_user);
            for(int i=0; i<book_list.size(); i++){
                if(book_list.get(i).split(",")[0].equals(book_ID)){
                    fw_libraly.append(book_list.get(i).replace("true,"+user_ID, "false"));
                    fw_libraly.append("\n");
                    for(int j=0; j<user_list.size(); j++){
                        if(user_list.get(j).split(",")[0].equals(user_ID)){
                            String[] list = user_list.get(j).replace("true", "false").split(",");
                            fw_user.append(list[0]+","+list[1]);
                            fw_user.append("\n");
                        } else {
                            fw_user.append(user_list.get(j));
                            fw_user.append("\n");
                        }
                    }
                } else {
                    fw_libraly.append(book_list.get(i));
                    fw_libraly.append("\n");
                }
            }
            fw_libraly.flush();
            fw_libraly.close();
            fw_user.flush();
            fw_user.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}