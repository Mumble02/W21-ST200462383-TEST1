/*
    Application Purpose: Pet class
    Author: Stephanie Caliwag
    Date: 2/11/21
    Time: 12:12pm
 */

import java.util.Arrays;
import java.util.List;

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

    //name validation
    public void setName(String Name) {
        if(Name.length() >= 2)
            this.Name = Name;
        else
            throw new IllegalArgumentException("Name must be at least 2 characters or more");
    }

    public String getType() {
        return Type;
    }

    //type array list
    public static List<String> getTypes(){
        return Arrays.asList("dog", "cat", "bird", "reptile", "fish");
    }

    //type validation
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

    //age validation
    public void setAge(int Age) {
        if (Age >= 0 && Age <=60)
            this.Age = Age;
        else
            throw new IllegalArgumentException("The age you've entered is out of range 0-60");
    }

    public String getColour() {
        return Colour;
    }

    //colour array list
    public static List<String> getColours(){
        return Arrays.asList("yellow", "brown", "black", "red", "white", "grey");
    }

    //colour validation
    public void setColour(String Colour) {
        Colour = Colour.toLowerCase();
        List<String> validColours = getColours();
        if(validColours.contains(Colour)) //sensitive case
            this.Colour = Colour;
        else
            throw new IllegalArgumentException(Colour + "The colour you've enter is not valid. These are your options" +validColours);
    }

    //this method returns a string that represents the pet sounds
    public String Speak(){
        if (Type == "woof woof")
            return "dog";
        else if(Type == "meow, meow")
            return "cat";
        else if (Type == "chirp, chip")
            return "bird";
        else if(Type == "hiss")
            return "reptile";
        else if(Type == "swimming sound")
            return "fish";
        return Speak();
    }

    //this method returns a string that represents the pet movements
    public String movesBy(){
        if (Type == "walks or runs")
            return "dog";
        else if(Type == "walks or runs")
            return "cat";
        else if (Type == "flies")
            return "bird";
        else if(Type == "slither or walk")
            return "reptile";
        else if(Type == "swim")
            return "fish";
        return movesBy();
    }

    //this method returns a boolean to represent if the pet has fur
    //Couldn't understand how to do the boolean return method
    /*public boolean hasFur(){
        if(Type = true)
            return hasFur();
        else if(Type = true)
            return hasFur();
        else if(Type = false)
            return hasFur();
         else if(Type = false)
            return hasFur();
         else if(Type = false)
            return hasFur();

    }*/

    //a method that uses a toString method
    public String toString(){

        return Name + "is age" + Age + Colour + Type;
    }
}
