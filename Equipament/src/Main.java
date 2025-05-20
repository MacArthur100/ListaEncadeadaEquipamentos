package model;

public class Equipment {
    private String code;
    private String brand;

    public Equipment(String code, String brand) {
        this.code = code;
        this.brand = brand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}