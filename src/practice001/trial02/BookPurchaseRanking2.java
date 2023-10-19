package practice001.trial02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * @author y-suwa
 * 色々駆使するやり方
 *
 */
public class BookPurchaseRanking2 {

    public static void main(String[] args) {
        // 人数
        int membersNum = 0;
        // 名前と合計金額
        List<NameAndPayment> nameAndPayments = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // 1行目の読み込み
        membersNum = scanner.nextInt();

        // 2行目の読み込み
        for (int i = 0; i < membersNum; i++) {
            nameAndPayments.add(new NameAndPayment(scanner.next()));
        }

        // 3行目の読み込み
        int paymentNum = scanner.nextInt();

        // 4行目以降の読み込み
        for (int i = 0; i < paymentNum; i++) {
            // 名前
            String name = scanner.next();
            // 金額
            int payment = scanner.nextInt();
            Optional<NameAndPayment> opt = nameAndPayments.stream().filter(s -> s.getName().equals(name)).findFirst();
            if (opt.isPresent()) {
                opt.get().addPayment(payment);
            }
        }

        // 読み込み終了
        scanner.close();

        // 降順ソート
        nameAndPayments.sort(Comparator.comparing(NameAndPayment::getPayment).reversed());
        // 表示
        nameAndPayments.forEach(s-> System.out.println(s.getName()));

    }

}
