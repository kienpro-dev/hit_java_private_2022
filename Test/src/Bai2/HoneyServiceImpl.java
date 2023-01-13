package Bai2;

import java.util.*;

public class HoneyServiceImpl implements HoneyService {
    private List<Honey> list;

    @Override
    public void addHoney(Honey h) {
        for (Honey honey : list) {
            if (honey.getId().compareTo(h.getId()) == 0) {
                System.out.println("Honey already exists");
                return;
            }
        }
        list.add(h);
    }

    @Override
    public void deleteHoney(String id) {
        for (Honey honey : list) {
            if (honey.getId().compareTo(id) == 0) {
                list.remove(honey);
                return;
            }
        }
        System.out.println("Honey not found");
    }

    @Override
    public void editHoney(String id) {
        Scanner sc = new Scanner(System.in);
        Honey h = new Honey();
        for (Honey honey : list) {
            if (honey.getId().compareTo(id) == 0) {
                h = honey;
                break;
            }
        }

        System.out.println("1. Edit name");
        System.out.println("2. Edit age");
        System.out.println("3. Edit phone");
        System.out.println("4. Edit status");
        System.out.print("Choose: ");
        int choose = sc.nextInt();
        sc.next();
        switch (choose) {
            case 1:
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                h.setName(name);
            case 2:
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                sc.next();
                h.setAge(age);
            case 3:
                System.out.print("Enter phone: ");
                String phone = sc.nextLine();
                h.setPhone(phone);
            case 4:
                System.out.print("Enter status: ");
                boolean status = sc.nextBoolean();
                h.setStatus(status);
        }
    }

    @Override
    public void showAllHoney() {
        for (Honey honey : list) {
            System.out.println(honey);
        }
    }

    @Override
    public void addFavorite(Favorite f, String id) {
        for (Honey honey : list) {
            if (honey.getId().compareTo(id) == 0) {
                honey.getListF().add(f);
                return;
            }
        }

    }

    @Override
    public List<Honey> sortedHoney() {
        List<Honey> result = new ArrayList<>(list);
        Collections.sort(result, new sortedByName().reversed());
        return result;
    }
}

class sortedByName implements Comparator<Honey> {
    @Override
    public int compare(Honey o1, Honey o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
