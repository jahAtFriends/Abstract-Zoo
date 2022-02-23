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
import org.friendsbalt.cs.zoo.Animal;

/**
* Representation of a Deer Animal. This class inherits all
* functionality from the Animal abstract class.
*/
public class Deer extends Animal {
    
    /**
    * Constructs a deer of given Color. By default, the Deer is male
    * and weighs 10 pounds.
    * @param x the Color of the Deer.
    */
    public Deer(Color x) {
        super(10, x, false);
    }
    
    /**
    * Constructs a deer of a given weight, color and gender.
    * @param weight The weight of the Deer in pounds.
    * @param color The fur color of the Deer.
    * @param isMale The gender of the Deer ({@code true} for Male and
    * {@code false} if female.
    */
    public Deer(int weight, Color color, boolean isMale) {
        super(weight, color, isMale);
    }
    
    
    /**
    * Causes the given deer to speak using it's species-specific sound
    */
    @Override
    public void speak() {
        System.out.println("Deer sounds!");
    }
}