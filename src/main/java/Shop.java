import entity.*;
import enums.GenresOfBooksEnum;
import enums.TypeOfCalendarEnum;
import enums.TypeOfColoringEnum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Good> goodList = new ArrayList<Good>(); // список товарів

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }

    public void add() {
        goodList.add(new Book(GenresOfBooksEnum.COMEDIES, "Керрі", 199.00, 300));
        goodList.add(new Book(GenresOfBooksEnum.FANTASY, "Гаррі Потер", 499.00, 900));
        goodList.add(new Book(GenresOfBooksEnum.HORROR, "Крик", 97.00, 400));
        goodList.add(new Book(GenresOfBooksEnum.HORROR, "Крик2", 200.00, 450));
        goodList.add(new Book(GenresOfBooksEnum.HORROR, "Крик3", 189.99, 247));
        goodList.add(new Coloring(TypeOfColoringEnum.SCHOOL, "Шкільна розмальовка", 27.00, 40));
        goodList.add(new Coloring(TypeOfColoringEnum.KINDERGARTEN, "Садочок 2-4 роки", 29.99, 39));
        goodList.add(new Coloring(TypeOfColoringEnum.KINDERGARTEN, "Садочок 2 роки", 19.99, 10));
        goodList.add(new Calendar(TypeOfCalendarEnum.JEWISH, "Єврейський", 19.80, 25));
    }

    public void sort() {
        Collections.sort(goodList);
    }

    public void print() {
        sort();
        goodList.forEach(System.out::println);
    }
}
