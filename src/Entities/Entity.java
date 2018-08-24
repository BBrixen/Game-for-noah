package Entities;

import java.awt.*;

public abstract class Entity {

    protected float x, y;

    public Entity(float x, float y) {
        //this is the starting position of the entity
        this.x = x;
        this.y = y;
    }

    public abstract void tick();

    public abstract void render(Graphics graphics);

}
