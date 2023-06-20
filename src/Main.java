import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] sayiDizisi = {2, 4, 5, 6, 8, 4, 6, 2, 9, 8, 10, 12, 12, 5, 3};
        int[] tekrarEdenCiftler = bulTekrarEdenCiftler(sayiDizisi);

        if (tekrarEdenCiftler.length == 0) {
            System.out.println("Herhangi bir tekrar eden çift sayı bulunamadı.");
        } else {
            System.out.println("Tekrar eden çift sayılar:");
            for (int sayi : tekrarEdenCiftler) {
                System.out.println(sayi);
            }
        }
    }

    public static int[] bulTekrarEdenCiftler(int[] sayilar) {
        ArrayList<Integer> tekrarEdenCiftler = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                for (int j = i + 1; j < sayilar.length; j++) {
                    if (sayilar[i] == sayilar[j] && !tekrarEdenCiftler.contains(sayilar[i])) {
                        tekrarEdenCiftler.add(sayilar[i]);
                        break;
                    }
                }
            }
        }

        int[] tekrarEdenCiftlerDizi = new int[tekrarEdenCiftler.size()];
        for (int i = 0; i < tekrarEdenCiftler.size(); i++) {
            tekrarEdenCiftlerDizi[i] = tekrarEdenCiftler.get(i);
        }

        return tekrarEdenCiftlerDizi;
    }
}
