/*
*  Part of the Friends School of Baltimore QAT Sequence
*
*  This package is intended to illustrate class structure, inheritance,
*  and abstraction, and is a sort of "solution code" to the Object Zoo
*  project, although significantly more advaced.
*
*
*  This file is free software: you can redistribute it and/or modify
*  it under the terms of the GNU General Public License as published by
*  the Free Software Foundation, either version 3 of the License, or
*  (at your option) any later version.
*
*  This file is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*  GNU General Public License for more details.
*
*
* (c) 2022 Friends School of Baltimore, QAT Labs
*
*
*
*/

package org.friendsbalt.cs.zoo;

import org.friendsbalt.cs.zoo.Color;

/**
* Abstract class specifying the functionality of a Zoo animal. This
* class is designed to represent an animal in the "Object Zoo" Lab.
* Subclasses of this abstract class inherit all methods and must
* override only the {@code void speak()} method.
*
* @author Joel A. Hammer
*/
public abstract class Animal {
    private int weight;
    private Color color;
    private boolean isMale;
    
    /**
    * Construct an animal of a given weight, color, and gender.
    * @param weight the weight of the animal rounded to the nearest
    * kilogram.
    * @param color the color of the animal's fur/skin/exterior
    * @param isMale the gender of the animal as a boolean. {@code true}
    * if the animal is male and {@code false} if the animal is femal.
    * @see Color
    */
    public Animal(int weight, Color color, boolean isMale) {
        this.weight = weight;
        this.color = color;
        this.isMale = isMale;
    }
    
    /**
    * Returns the weight of the animal.
    * @return the weight of the animal rounded to the nearest kilogram.
    */
    public int getWeight() {
        return this.weight;
    }
    
    /**
    * Returns the color of the animal.
    * @return the color of the animal.
    * @see Color
    */
    public Color getColor() {
        return this.color;
    }
    
    /**
    * Returns the gender of the animal.
    * @return A boolean representation of the gender {@code true} if
    * male and {@code false} if female.
    */
    public boolean isMale() {
        return this.isMale;
    }
    
    /**
    * Returns the female-first gender of the animal.
    * @return {@code true} if the animal is female and {@code false} if
    * male.
    * @see isMale()
    */
    public boolean isFemale() {
        return !this.isMale;
    }
    
    /**
    * Causes the animal to speak. Each animal subclasses makes a
    * consistent speech noise (e.g. a Cow object would say "moo"). The
    * execution of speech is achieved by printing that animal's speech
    * sound to StdOut (the command line, usually).
    */
    public abstract void speak();
}