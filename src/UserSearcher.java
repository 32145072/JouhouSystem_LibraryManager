import java.util.ArrayList;

public class UserSearcher {

    String eq = "=============================================================================================================";

    public void id_searcher(String ID){
        ArrayList<String> user_list = User.userList();
        System.out.println(eq);
        System.out.println("入力されたユーザIDに一致する情報を以下に表示します");
        for(int i=0; i<user_list.size(); i++){
            if(user_list.get(i).split(",")[0].equals(ID)){
                System.out.println(user_list.get(i).replace(",", " "));
            }
        }
        System.out.println(eq);
    }
    
    public void lend_searcher(String lend) {
        ArrayList<String> user_list = User.userList();
        System.out.println(eq);
        for(int i = 0; i<user_list.size();i++){
            if(user_list.get(i).split(",")[1].equals(lend)){
                System.out.println(user_list.get(i).replace(","," "));
            }
        }
        System.out.println(eq);
    }

    public void bookID_searcher(String book_ID) {
        ArrayList<String> user_list = User.userList();
        System.out.println(eq);
        System.out.println("本のIDでその本を借りているユーザを検索します");
        for(int i = 0; i<user_list.size();i++){
            if(user_list.get(i).contains(book_ID)){
                System.out.println(user_list.get(i).replace(","," "));
            }
        }
        System.out.println(eq);
    }      
}
