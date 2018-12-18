package entity;

import enums.TypeOfCalendarEnum;

public class Calendar extends Good {
    private TypeOfCalendarEnum typeOfCalendarEnum;

    public Calendar(TypeOfCalendarEnum typeOfCalendarEnum, String name, double price, int countOfPage) {
        super(GoodType.CALENDAR, name, price, countOfPage);
        this.typeOfCalendarEnum = typeOfCalendarEnum;
    }

    public TypeOfCalendarEnum getTypeOfCalendarEnum() {
        return typeOfCalendarEnum;
    }

    public void setTypeOfCalendarEnum(TypeOfCalendarEnum typeOfCalendarEnum) {
        this.typeOfCalendarEnum = typeOfCalendarEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calendar)) return false;

        Calendar calendar = (Calendar) o;

        return getTypeOfCalendarEnum() == calendar.getTypeOfCalendarEnum();
    }

    @Override
    public int hashCode() {
        return getTypeOfCalendarEnum() != null ? getTypeOfCalendarEnum().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "typeOfCalendarEnum=" + typeOfCalendarEnum +
                "} " + super.toString();
    }
}
