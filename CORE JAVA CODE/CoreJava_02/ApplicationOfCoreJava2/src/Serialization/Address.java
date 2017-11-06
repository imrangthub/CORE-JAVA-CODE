
package Serialization;

import java.io.Serializable;

public class Address implements Serializable{
    
    // transient String street;
    String street;
    String country;
    
    

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    

    public String getStreet() {
        return street;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Current data [" + "street=" + street + ", country=" + country + ']';
    }
    
    
    
    
    
    
    
    
    
}
