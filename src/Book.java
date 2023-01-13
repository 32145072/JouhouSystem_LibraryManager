public class Book {
    Integer id;
    String title;
    String author;
    boolean lend = false;
    String category;

    public Book(Integer id,String title,String author,boolean lend,String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.lend = lend;
        this.category = category;
    }
    public void islend(){
        //変数lendの状態を返す
    } 
}