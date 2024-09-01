package Task12;

import java.util.Objects;

public class Manufacture {
    //        Create a Manufacturer class that will contain fields: name, year of establishment, country. Include all
//        necessary methods and constructor parameters. Implement the hashCode() and equals() methods.

    private String name;
    private int yearEstablishment;
    private String Country;


    public Manufacture(String name, int yearEstablishment, String Country) {
        this.name = name;
        this.yearEstablishment = yearEstablishment;
        this.Country = Country;

    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearEstablishment() {
        return yearEstablishment;
    }

    public void setYearEstablishment(int yearEstablishment) {
        this.yearEstablishment = yearEstablishment;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacture that = (Manufacture) o;
        return yearEstablishment == that.yearEstablishment && Objects.equals(name, that.name) && Objects.equals(Country, that.Country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearEstablishment, Country);
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "Country='" + Country + '\'' +
                ", name='" + name + '\'' +
                ", yearEstablishment=" + yearEstablishment +
                '}';
    }
}
