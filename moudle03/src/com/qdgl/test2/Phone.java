package com.qdgl.test2;

import java.util.Objects;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.test2
 * @Version: 1.0
 */
public class Phone {
    private String brand; // 品牌型号
    private double price; // 价格
    private int year; // 出产年份

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    // 重写 equals 方法
    /*@Override
    public boolean equals(Object obj) {
        // instanceof 运算符 判断 obj是否为 Phone 的实例
        if (obj instanceof Phone) {
            // 要将Obj转为Phone
            Phone other = (Phone)obj; // ??
            return this.getBrand() == other.getBrand();
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 &&
                year == phone.year &&
                Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}
