package enums;

import java.util.Arrays;
import java.util.List;

public enum GenresOfBooksEnum {
    COMEDIES("КОМЕДІЇ"),
    FANTASY("ФАНТАСТИКА"),
    HORROR("ЖАХИ"),
    THRILLERS("ТРИЛЛЕРИ"),
    MYTHOLOGY("МІФОЛОГІЯ");

    private final String value;

    GenresOfBooksEnum(final String genresOfBooksEnum) {
        this.value = genresOfBooksEnum;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }


    public static GenresOfBooksEnum getEnum(String value) {
        List<GenresOfBooksEnum> list = Arrays.asList(GenresOfBooksEnum.values()); // бере весь список енамів  і фільтрує по мому значенню
        return list.stream().filter(genresOfBooksEnum -> genresOfBooksEnum.getValue().equals(value)).findAny().orElseThrow(IllegalArgumentException::new);
    }
}




