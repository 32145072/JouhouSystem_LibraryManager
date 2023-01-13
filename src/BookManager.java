public class BookManager{

    public void register(Integer book_id,String book_title,String author,boolean lend,String category){
        // インスタンス作成
        Book book = new Book(book_id,book_title,author,lend,category);
        // Libralyクラスに登録
        // lib.book_list.add(book);
    }
    public void delete(){
        //Bookクラスから削除
    }
}