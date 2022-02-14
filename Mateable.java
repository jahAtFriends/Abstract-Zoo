package org.friendsbalt.cs.zoo;

/**
* Allows two animals to be mated so that a new animal is generated
* as a combination of the properties of its two parent animals.
*/
public interface Mateable<T extends Animal> {
    
    Animal mateWith(T x);
}