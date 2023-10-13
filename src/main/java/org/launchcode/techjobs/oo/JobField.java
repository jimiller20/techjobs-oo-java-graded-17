package org.launchcode.techjobs.oo;

import java.security.PrivateKey;
import java.util.Objects;

abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        if (!value.isEmpty()) {this.value = value;}
        else {this.value = "Data not available";}
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
