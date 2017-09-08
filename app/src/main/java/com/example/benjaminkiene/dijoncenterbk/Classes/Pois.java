package com.example.benjaminkiene.dijoncenterbk.Classes;

/**
 * Created by Benjamin KIENE on 08/09/2017.
 */

public class Pois {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    int id;
    String type;
    String name;
    Location location;
}
