package practice001.trial01;

import java.util.Scanner;

/**
 * @author y-suwa
 * 初級技術でのやり方
 *
 */
public class BookPurchaseRanking {

    public static void main(String[] args) {
        // 人数
        int membersNum = 0;
        // 名前
        String names[];
        // 合計金額
        int summaries[];

        Scanner scanner = new Scanner(System.in);

        // 1行目の読み込み
        membersNum = scanner.nextInt();

        // 人数で配列数を初期化
        names = new String[membersNum];
        summaries = new int[membersNum];

        // 2行目の読み込み
        for (int i = 0; i < membersNum; i++) {
            names[i] = scanner.next();
        }

        // 3行目の読み込み
        int paymentNum = scanner.nextInt();

        // 4行目以降の読み込み
        for (int i = 0; i < paymentNum; i++) {
            // 名前
            String name = scanner.next();
            // 金額
            int payment = scanner.nextInt();
            for (int j = 0; j < names.length; j++) {
                if (names[j].equals(name)) {
                    summaries[j] += payment;
                }
            }
        }

        // 読み込み終了
        scanner.close();

        // 降順ソート
        for (int i = 0; i < summaries.length - 1; i++) {
            for (int j = 0; j < summaries.length - i - 1; j++) {
                if (summaries[j] < summaries[j + 1]) {
                    int tmpSum = summaries[j];
                    String tmpName = names[j];
                    summaries[j] = summaries[j + 1];
                    names[j] = names[j + 1];
                    summaries[j + 1] = tmpSum;
                    names[j + 1] = tmpName;
                }

            }
        }

        // 表示
        for (String name : names) {
            System.out.println(name);
        }

    }

}
