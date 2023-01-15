import java.util.ArrayList;

public class BookSearcher {
    
    String eq = "=============================================================================================================";
    public void id_searcher(String ID){
        ArrayList<String> book_list = Library.bookList();
        System.out.println(eq);
        System.out.println("入力されたIDに一致する本の情報を以下に表示します");
        for(int i=0; i<book_list.size(); i++){
            if(book_list.get(i).split(",")[0].equals(ID)){
                System.out.println(book_list.get(i).replace(",", " "));
            }
        }
        System.out.println(eq);
    }
    
    public void title_searcher(String title){
        ArrayList<String> book_list = Library.bookList();
        System.out.println(eq);
        System.out.println("入力されたタイトルに一致する本の情報を以下に表示します");
        for(int i=0; i<book_list.size(); i++){
            if(book_list.get(i).split(",")[1].equals(title)){
                System.out.println(book_list.get(i).replace(",", " "));
            }
        }
        System.out.println(eq);
    }
    public void author_searcher(String author){
        ArrayList<String> book_list = Library.bookList();
        System.out.println(eq);
        System.out.println("入力された著者に一致する本の情報を以下に表示します");
        for(int i = 0; i<book_list.size();i++){
            if(book_list.get(i).split(",")[2].equals(author)){
                System.out.println(book_list.get(i).replace(","," "));
            }
        }
        System.out.println(eq);
    }
    public void category_searcher(String category) {
        ArrayList<String> book_list = Library.bookList();
        System.out.println(eq);
        System.out.println("入力されたカテゴリーに一致する本の情報を以下に表示します");
        for(int i = 0; i<book_list.size();i++){
            if(book_list.get(i).split(",")[3].equals(category)){
                System.out.println(book_list.get(i).replace(","," "));
            }
        }
        System.out.println(eq);
    }
    public void lend_searcher(String lend) {
        ArrayList<String> book_list = Library.bookList();
        System.out.println(eq);
        System.out.println("貸し出し済みの本を全て表示します");
        for(int i = 0; i<book_list.size();i++){
            if(book_list.get(i).split(",")[4].equals(lend)){
                System.out.println(book_list.get(i).replace(","," "));
            }
        }
        System.out.println(eq);
    }   
}
