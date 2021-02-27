package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Smartphone extends Product{
    private String manufacturer;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, String manufacturer) {
        super(id, name);
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || this.getManufacturer().equalsIgnoreCase(search);
    }
}
