package Bai2;

import java.util.*;

public class runmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Honey> list = new ArrayList<>();
        HoneyService hs = new HoneyServiceImpl(list);

        int choose;

        do {
            System.out.println("1. Add Honey");
            System.out.println("2. Delete Honey");
            System.out.println("3. Edit Honey");
            System.out.println("4. Show all Honey");
            System.out.println("5. Add favourite");
            System.out.println("6. Sorted honey by name");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            choose = sc.nextInt();
            sc.next();
            switch (choose) {
                case 1:
                    Honey test = new Honey();
                    hs.addHoney(test);
                case 2:
                    hs.deleteHoney(null);
                case 3:
                    hs.editHoney(null);
                case 4:
                    hs.showAllHoney();
                case 5:
                    hs.addFavorite(null, null);
                case 6:
                    List<Honey> sorted = hs.sortedHoney();
                    for (Honey h : sorted) {
                        System.out.println(h);
                    }
                case 7:
                    break;
            }
        } while (choose != 7);
    }

}
