/*
    Application Purpose: Pet class
    Author: Stephanie Caliwag
    Date: 2/11/21
    Time: 12:12pm
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Pet {

    //instance variables
    private String Name;
    private String Type;
    private int Age;
    private String Colour;
    private Object ArrayList;

    //constructor

    public Pet(String Name, String Type, int Age, String Colour) {
        setName(Name);
        setType(Type);
        setAge(Age);
        setColour(Colour);
    }

    //setters and getters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length() >= 2)
            this.Name = name;
        else
            throw new IllegalArgumentException("Name must be at least 2 characters or more");
    }

    public String getType() {
        return Type;
    }

    public static List<String> getTypes(){
        return Arrays.asList("dog", "cat", "bird", "reptile", "fish");
    }


    public void setType(String Type) {
        Type = Type.toLowerCase();
        List<String> validTypes = getTypes();
        if(validTypes.contains(Type)) //case sensitive
            Type = Type;
        else
            throw new IllegalArgumentException(Type + "This type is not valid. Your options are" + validTypes);
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        if (Age >= 0 && Age <=60)
            this.Age = Age;
        else
            throw new IllegalArgumentException("The age you've entered is out of range 0-60");
    }

    public String getColour() {
        return Colour;
    }

    public static List<String> getColours(){
        return Arrays.asList("yellow", "brown", "black", "red", "white", "grey");
    }

    public void setColour(String Colour) {
        Colour = Colour.toLowerCase();
        List<String> validColours = getColours();
        if(validColours.contains(Colour)) //sensitive case
            this.Colour = Colour;
        else
            throw new IllegalArgumentException(Colour + "The colour you've enter is not valid. These are your options" +validColours);
    }
}
