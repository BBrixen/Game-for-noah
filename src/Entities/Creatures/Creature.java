package Entities.Creatures;

import Entities.Entity;

public abstract class Creature extends Entity {

    protected int health; //these are the basic variables for a creature
    //this will change for the actual game, health is just a temp variable
    //we will add movement speed and more later on

    public Creature(float x, float y) {
        super(x, y);//this runs the Entity() constructor
        health = 100; //this will be changed
    }


}
