package org.example;
/**
 * @author Andmz
 */

public class Persona {

    // Attribute

    public String name;
    public String LastName1;
    public String dateBirth;
    public float height;

    // Constructor

    /**
     *
     * @param name A person has a name
     * @param lastName1 A person has a last name
     * @param dateBirth Everyone has a date of birth
     * @param height how tall is the person? we measure with the international measurement system
     */
    public Persona(String name, String lastName1, String dateBirth, float height) {
        this.name = name;
        this.LastName1 = lastName1;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    //Get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}