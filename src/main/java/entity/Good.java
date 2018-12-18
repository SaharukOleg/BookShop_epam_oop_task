package entity;

import java.util.Arrays;
import java.util.List;

public abstract class Good implements Comparable<Good> {
    private String name;
    private double price;
    private int countOfPage;
    private GoodType goodType;

    public GoodType getGoodType() {
        return goodType;
    }

    public void setGoodType(GoodType goodType) {
        this.goodType = goodType;
    }

    public int compareTo(Good o) {
        if (o instanceof Good) {
            if (this.getCountOfPage() < o.getCountOfPage()) {
                return -1;
            } else if (this.getCountOfPage() > o.getCountOfPage()) {
                return 1;
            }
        }
        return 0;
    }  // сортую товари по сторінках

    public Good(GoodType goodType, String name, double price, int countOfPage) {  // додав в конструктор ТИП товару GoodType
        this.goodType = goodType;
        this.name = name;
        this.price = price;
        this.countOfPage = countOfPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }

    @Override
    public String toString() {
        return "\t" + "Good : " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", countOfPage=" + countOfPage;
    }


    public enum GoodType {
        BOOK("КНИЖКА"),
        CALENDAR("КАЛЕНДАР"),
        COLORING("РОЗМАЛЬОВКА");

        private String value;

        GoodType(final String goodType) {
            this.value = goodType;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

        public static GoodType getEnum(String value) {
            List<GoodType> list = Arrays.asList(GoodType.values()); // бере весь список енамів  і фільтрує по мому значенню
            return list.stream().filter(goodType -> goodType.getValue().equals(value)).findAny().orElseThrow(IllegalArgumentException::new);
        }
    }
}
