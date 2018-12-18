import entity.Book;
import entity.Calendar;
import entity.Coloring;
import entity.Good;
import enums.GenresOfBooksEnum;
import java.util.List;

public class User {

    public void searchBookByGenre(List<Good> goodList) {
        System.out.println("добрий день, введіть жанр книжки ");
        String ganreOfBook = Main.scanner.nextLine().toUpperCase();
        for (int i = 0; i < goodList.size(); i++) {
            if (goodList.get(i).getGoodType() == Good.GoodType.BOOK) {
                Book book = (Book) (goodList.get(i));
                if (book.getGenresOfBooksEnum() == GenresOfBooksEnum.getEnum(ganreOfBook)) {
                    System.out.println(book);
                }
            }
        }
    }

    public void searchGoodByCategoty(List<Good> goodList) {
        System.out.println("добрий день, введіть категорію товару");
        String categoryOfGood = Main.scanner.nextLine().toUpperCase();
        for (int i = 0; i < goodList.size(); i++) {
            switch (goodList.get(i).getGoodType()) {
                case BOOK:
                    printIfBookCategoty(goodList, categoryOfGood, i);
                    break;
                case COLORING:
                    printIfColoringCategoty(goodList, categoryOfGood, i);
                    break;
                case CALENDAR:
                    printIfCalendarCategoty(goodList, categoryOfGood, i);
                    break;
            }
        }
    }

    private void printIfBookCategoty(List<Good> goodList, String categoryOfGood, int i) {
        Book book = (Book) (goodList.get(i));
        if (book.getGoodType() == Good.GoodType.getEnum(categoryOfGood)) {
            System.out.println(book);
        }
    }

    private void printIfColoringCategoty(List<Good> goodList, String categoryOfGood, int i) {
        Coloring coloring = (Coloring) (goodList.get(i));
        if (coloring.getGoodType() == Good.GoodType.getEnum(categoryOfGood)) {
            System.out.println(coloring);
        }
    }

    private void printIfCalendarCategoty(List<Good> goodList, String categoryOfGood, int i) {
        Calendar calendar = (Calendar) (goodList.get(i));
        if (calendar.getGoodType() == Good.GoodType.getEnum(categoryOfGood)) {
            System.out.println(calendar);
        }
    }
}