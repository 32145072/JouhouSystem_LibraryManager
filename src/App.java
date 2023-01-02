import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Book a = new Book(1,"Title","Author",false,"human");
        // String str1 = a.book_title;
        // String str2 = a.author;
        // boolean str3 = a.lend;
        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);

        // インスタンス作成
        Scanner scanner = new Scanner(System.in);
        BookManager bm = new BookManager();
        // message
        String message = """
                1~Xまでの番号を入力してください。
                0を入力するとプログラムを終了します。
                1 : 本の登録
                2 : 本の削除
                ......
                0 : プログラムの終了
                """;

        // ループ開始
        boolean isroop = true;
        while (isroop) {
            System.out.println(message);
            System.out.print("Input > ");
            int input = scanner.nextInt();
            System.out.println(input);

            // プログラムの終了
            if (input == 0){
                isroop = false;
            }
            // 本の登録
            else if (input == 1) {
                // 登録する本の情報入力

                System.out.println("Book_ID > ");
                int register_id = scanner.nextInt();

                System.out.println("book_title > ");
                String register_title = scanner.nextLine();

                System.out.println("book_author > ");
                String register_author = scanner.nextLine();

                System.out.println("book_category > ");
                String register_category = scanner.nextLine();

                // BookManagerクラスのregisterメソッドを走らせる
                bm.register(register_id, register_title, register_author, false, register_category);

            }
        }
        scanner.close();

        
        
     
        
    }
    
}
