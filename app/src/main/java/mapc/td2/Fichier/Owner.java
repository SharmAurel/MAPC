package mapc.td2.Fichier;

import java.util.Objects;

public class Owner {

    String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + this.name + "'" +
            "}";
    }
   


    

}
