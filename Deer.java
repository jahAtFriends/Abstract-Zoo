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
    
    public Deer(Color x) {
        super(10, x, false);
    }
    
    public Deer(int weight, Color color, boolean isMale) {
        super(weight, color, isMale);
    }
    
    @Override
    public void speak() {
        System.out.println("Deer sounds!");
    }
}