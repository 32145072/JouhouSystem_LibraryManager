import java.util.Scanner;

// GitHub https://github.com/32145072/JouhouSystem_LibraryManager

public class App {
    // インスタンス作成

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BookManager bm = new BookManager();
        BookSearcher bs = new BookSearcher();
        Libraly lib = new Libraly();
        
        // message
        String message = """
                0~Xまでの番号を入力してください。
                0を入力するとプログラムを終了します。
                1 : 本の登録
                2 : 本の削除
                3 : 登録されている本の一覧表示
                4 : 蔵書検索
                0 : プログラムの終了
                """;

        // ループ開始
        boolean isroop = true;
        while (isroop) {
            System.out.println(message);
            System.out.print("Input > ");
            int input = scanner.nextInt();

            // プログラムの終了
            if (input == 0){
                System.out.println("システムを終了します");
                isroop = false;
            }
            // 本の登録
            else if (input == 1) {
                // 登録する本の情報入力

                System.out.println("Book_ID > ");
                int register_id = scanner.nextInt();

                System.out.println("book_title > ");
                String register_title = scanner.next();

                System.out.println("book_author > ");
                String register_author = scanner.next();

                System.out.println("book_category > ");
                String register_category = scanner.next();

                // BookManagerクラスのregisterメソッドを走らせる
                bm.register(register_id, register_title, register_author, false, register_category);

                // 登録完了
                System.out.println("");
                System.out.println("=======================================");
                System.out.println("以下の本の登録が完了しました");
                System.out.println("id:"+register_id+" "+"タイトル:"+register_title+" "+"著者:"+register_author+" "+"カテゴリー:"+" "+register_category);
                System.out.println("=======================================");
                System.out.println("");
            }
            // 本の削除
            else if (input == 2){
                
            }
            else if (input == 3){
                // 登録されている本の一覧表示
                Libraly.readcsv();
                
            }
            else if (input == 4){
                // 蔵書検索
                bs.title_searcher();
            }
            else{
                System.out.println("入力が不正です");
            }
        }
        scanner.close();

        
        
     
        
    }
    
}
