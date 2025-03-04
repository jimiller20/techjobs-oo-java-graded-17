package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField{

    public Location(String value) {
        super(value);
    }
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location employer = (Location) o;
        return getId() == employer.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
