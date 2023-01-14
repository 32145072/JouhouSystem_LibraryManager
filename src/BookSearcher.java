import java.util.ArrayList;

public class BookSearcher {
    
    

    public void id_searcher(String ID){
        ArrayList<String> book_list = Libraly.bookList();
        for(int i=0; i<book_list.size(); i++){
            if(book_list.get(i).split(",")[0].equals(ID)){
                System.out.println(book_list.get(i).replace(",", " "));
            }
        }
    }
    
    public void title_searcher(String title){
        ArrayList<String> book_list = Libraly.bookList();
        for(int i=0; i<book_list.size(); i++){
            if(book_list.get(i).split(",")[1].equals(title)){
                System.out.println(book_list.get(i).replace(",", " "));
            }
        }
    }
    public void author_searcher(String author){
        ArrayList<String> book_list = Libraly.bookList();
        for(int i = 0; i<book_list.size();i++){
            if(book_list.get(i).split(",")[2].equals(author)){
                System.out.println(book_list.get(i).replace(","," "));
            }
        }

    }
    public void category_searcher(String category) {
        ArrayList<String> book_list = Libraly.bookList();
        for(int i = 0; i<book_list.size();i++){
            if(book_list.get(i).split(",")[3].equals(category)){
                System.out.println(book_list.get(i).replace(","," "));
            }
        }
    }
    public void lend_searcher(String lend) {
        ArrayList<String> book_list = Libraly.bookList();
        for(int i = 0; i<book_list.size();i++){
            if(book_list.get(i).split(",")[4].equals(lend)){
                System.out.println(book_list.get(i).replace(","," "));
            }
        }
    }   
}
