public class Book {
    Integer book_id;
    String book_title;
    String author;
    boolean lend = false;
    String category;

    public Book(Integer book_id,String book_title,String author,boolean lend,String category) {
        this.book_id = book_id;
        this.book_title = book_title;
        this.author = author;
        this.lend = lend;
        this.category = category;
    }
    public void islend(){
        //変数lendの状態を返す
    } 
}