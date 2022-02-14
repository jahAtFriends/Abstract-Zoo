package org.friendsbalt.cs.zoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    
    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }
    
    public void add(Animal x) {
        animals.add(x);
    }
    
    public int countAnimal() {
        return animals.size();
    }
    
    public ArrayList<Animal> getAllAnimals() {
        //Deep-copy the ArrayList first.
        ArrayList<Animal> x = new ArrayList<Animal>(animals.size());
        for(Animal a : animals) {
            x.add(a);
        }
        return x;
    }
    
    /*This doesn't work! We need to come up with a way to solve this!!
    
    public Animal mate(Animal a, Animal b) {
        Color aColor = a.getColor();
        Color bColor = b.getColor();
        Color newColor = Color.mix(a,b);
        
        boolean isMale = Math.random() < 0.5;
        
        int weight = 10;
        
        return new Animal(weight, newColor, isMale);
    }
    */
    
    /*Correct solution. Still kind of a weird mess.Needs
    * Needs both generic type and an interface...
    */
    public <T extends Mateable<T>> T mate(T a, T b) {
        return a.mateWith(b);
    }
}