package lotto.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int inputPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(SCANNER.nextLine().replaceAll(" ", ""));
    }

    public static String inputWinningLotto() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        return SCANNER.nextLine().replaceAll(" ", "");
    }

    public static int inputBonusNumber(){
        System.out.println("보너스 볼을 입력해주세요.");
        return Integer.parseInt(SCANNER.nextLine().replaceAll(" ", ""));
    }
}
