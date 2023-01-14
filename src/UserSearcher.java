import java.util.ArrayList;

public class UserSearcher {

    public void id_searcher(String ID){
        ArrayList<String> user_list = User.userList();
        for(int i=0; i<user_list.size(); i++){
            if(user_list.get(i).split(",")[0].equals(ID)){
                System.out.println(user_list.get(i).replace(",", " "));
            }
        }
    }
    
    public void lend_searcher(String lend) {
        ArrayList<String> user_list = User.userList();
        for(int i = 0; i<user_list.size();i++){
            if(user_list.get(i).split(",")[1].equals(lend)){
                System.out.println(user_list.get(i).replace(","," "));
            }
        }
    }

    public void bookID_searcher(String book_ID) {
        ArrayList<String> user_list = User.userList();
        for(int i = 0; i<user_list.size();i++){
            if(user_list.get(i).contains(book_ID)){
                System.out.println(user_list.get(i).replace(","," "));
            }
        }
    }      
}
