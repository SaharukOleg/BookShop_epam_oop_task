package entity;

import enums.GenresOfBooksEnum;

public class Book extends Good {

    private GenresOfBooksEnum genresOfBooksEnum;

    public Book(GenresOfBooksEnum genresOfBooksEnum, String name, double price, int countOfPage) {
        super(GoodType.BOOK, name, price, countOfPage); // викликаю батьківський клас
        this.genresOfBooksEnum = genresOfBooksEnum;
    }

    public GenresOfBooksEnum getGenresOfBooksEnum() {
        return genresOfBooksEnum;
    }

    public void setGenresOfBooksEnum(GenresOfBooksEnum genresOfBooksEnum) {
        this.genresOfBooksEnum = genresOfBooksEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book books = (Book) o;

        return getGenresOfBooksEnum() == books.getGenresOfBooksEnum();
    }

    @Override
    public int hashCode() {
        return getGenresOfBooksEnum() != null ? getGenresOfBooksEnum().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genresOfBooksEnum=" + genresOfBooksEnum +
                "} " + super.toString();
    }
}
