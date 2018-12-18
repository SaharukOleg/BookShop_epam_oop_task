import entity.Good;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add();
        shop.print();
        User user = new User();
        //     user.searchBookByGenre(shop.getGoodList()); // searchBookByGenre
        user.searchGoodByCategoty(shop.getGoodList());
    }
}
