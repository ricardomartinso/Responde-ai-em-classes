public class Address {
    private String street;
    private int number;
    private String district;
    private String city;

    public String getStreet() {
        return this.street;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
