package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 30)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    public Menu() {
    }

    public int getId() {
        return id;
    }
    public void addItem(Cheese item) {
        cheeses.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }
}

