import java.util.Scanner;
import java.util.UUID;
// GitHub https://github.com/32145072/JouhouSystem_LibraryManager

public class App {
    // インスタンス作成

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in,"shift_jis");
        BookManager bm = new BookManager();
        BookSearcher bs = new BookSearcher();
        Libraly lib = new Libraly();
        User user = new User();
        BookLender bl = new BookLender();
        UserSearcher us = new UserSearcher();
        
        // message
        String message = """
                0~Xまでの番号を入力してください。
                0を入力するとプログラムを終了します。
                1 : 本の登録
                2 : 本の削除
                3 : 登録されている本の一覧表示
                4 : 検索
                5 : ユーザ情報
                6 : 貸出
                7 : 返却
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

                String register_id = UUID.randomUUID().toString();

                System.out.println("input title > ");
                String register_title = scanner.next();

                System.out.println("input author > ");
                String register_author = scanner.next();

                System.out.println("input category > ");
                String register_category = scanner.next();

                // BookManagerクラスのregisterメソッドを走らせる
                bm.register(register_id, register_title, register_author, register_category,false);
            }
            // 本の削除
            else if (input == 2){
                System.out.println("削除する本のIDを入力してください");
                String delete_ID = scanner.next();
                bm.delete(delete_ID);
            }
            else if (input == 3){
                // 登録されている本の一覧表示
                lib.all();
                lib.amount();
            }
            else if (input == 4){
                // 検索
                String select_searcher_message = """
                        0~5までの番号を入力してください。
                        1 : IDで検索
                        2 : タイトルで検索
                        3 : 著者で検索
                        4 : 貸出した本を検索
                        5 : カテゴリーで検索
                        6 : ユーザのIDでユーザを検索
                        7 : 本を借りているユーザを検索
                        8 : 本のIDでその本を借りているユーザを検索
                        0 : 機能選択に戻る
                        """;
                boolean search_isroop = true;
                while (search_isroop){
                    System.out.println(select_searcher_message);
                    System.out.print("Input > ");
                    int select_search = scanner.nextInt();

                    
                    if (select_search == 1){
                        // ID検索
                        System.out.println("検索する本のIDを入力してください:");
                        String id_search = scanner.next(); 
                        bs.id_searcher(id_search);
                    } 
                    else if(select_search == 2) {
                        // タイトル検索
                        System.out.println("検索する本のタイトルを入力してください:");
                        String title_search = scanner.next(); 
                        bs.id_searcher(title_search);
                    }
                    else if(select_search == 3){
                        // 著者検索
                        System.out.println("検索する著者を入力してください:");
                        String author_search = scanner.next(); 
                        bs.id_searcher(author_search);
                    }
                    else if(select_search == 4){
                        // 貸出した本を検索
                        System.out.println("貸し出した本を表示します:");
                        bs.lend_searcher("true");
                    }
                    else if(select_search == 5){
                        // カテゴリー検索
                        System.out.println("検索するカテゴリーを入力してください:");
                        String category_search = scanner.next(); 
                        bs.id_searcher(category_search);
                    }
                    else if(select_search == 6) {
                        System.out.println("ユーザIDを入力:");
                        String uid_search = scanner.next(); 
                        us.id_searcher(uid_search);
                    }
                    else if(select_search == 7) {
                        // 本を借りているユーザを検索
                        System.out.println("True/Falseを入力してください:");
                        String lend_search = scanner.next(); 
                        us.lend_searcher(lend_search);
                    }
                    else if(select_search == 8) {
                        System.out.println("本のIDを入力:");
                        String ubookID_search = scanner.next(); 
                        us.bookID_searcher(ubookID_search);
                    }
                    else if(select_search == 0) {
                        search_isroop = false;
                    }
                }
                
            }
            else if (input == 5){
                // ユーザ情報
                user.all();
                user.amount();
            }
            else if (input == 6){
                // 貸出
                bl.lend("73a664fd-6e35-49b8-b18f-d93b42bad5e0","429671cd-a04f-424d-8ebe-0d1901a8fbf5");
            }
            else if (input == 7){
                // 返却
                bl.bookReturn("73a664fd-6e35-49b8-b18f-d93b42bad5e0", "429671cd-a04f-424d-8ebe-0d1901a8fbf5");
            }
            else{
                System.out.println("入力が不正です");
            }
        }
        scanner.close();
             
    }
    
}
