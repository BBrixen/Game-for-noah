package Entities.Creatures;

import Entities.Entity;

public abstract class Creature extends Entity {

    public static final int DEFAULT_HEALTH = 100;//all of these will be modified for the game
    public static final float DEFAULT_SPEED = 10.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 64,
                            DEFAULT_CREATURE_HEIGHT = 64;

    protected int health;
    protected float speed;
    protected float xMove, yMove;
    //these are the basic variables for a creature
    //this will change for the actual game, health is just a temp variable
    //we will add movement speed and more later on

    public Creature(float x, float y, int width, int height) {
        super(x, y, width, height);//this runs the Entity(float x, float y, int width, int height) constructor
        health = DEFAULT_HEALTH; //these will be changed
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }

    public void move() {
        x += xMove;
        y += yMove;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public float getSpeed() {
        return speed;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public float getxMove() {
        return xMove;
    }
    public void setxMove(float xMove) {
        this.xMove = xMove;
    }
    public float getyMove() {
        return yMove;
    }
    public void setyMove(float yMove) {
        this.yMove = yMove;
    }
}
