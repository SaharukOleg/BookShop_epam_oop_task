package entity;

import enums.TypeOfColoringEnum;

public class Coloring extends Good {
    private TypeOfColoringEnum typeOfColoringEnum;

    public Coloring(TypeOfColoringEnum typeOfColoringEnum, String name, double price, int countOfPage) {
        super(GoodType.COLORING, name, price, countOfPage);
        this.typeOfColoringEnum = typeOfColoringEnum;
    }

    public TypeOfColoringEnum getTypeOfColoringEnum() {
        return typeOfColoringEnum;
    }

    public void setTypeOfColoringEnum(TypeOfColoringEnum typeOfColoringEnum) {
        this.typeOfColoringEnum = typeOfColoringEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coloring)) return false;

        Coloring coloring = (Coloring) o;

        return getTypeOfColoringEnum() == coloring.getTypeOfColoringEnum();
    }

    @Override
    public int hashCode() {
        return getTypeOfColoringEnum() != null ? getTypeOfColoringEnum().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Coloring{" +
                "typeOfColoringEnum=" + typeOfColoringEnum +
                "} " + super.toString();
    }
}
