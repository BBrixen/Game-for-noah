package Entities.Creatures;

import Main.Game;
import rendering.Assets;

import java.awt.*;

public class Player extends Creature {

    private Game game;

    public Player(Game game, float x, float y) {
        super(x, y);
        this.game = game;
    }

    @Override
    public void tick() {

        //this is a test push to git
        //this is noah's test push to git
        int x = 0;
        int y = x+2;

        //i havent made pressing keys make the player move yet. ill get to it
        //to go up, you subtract from the y, to go down, you add to y. its reversed
        //but x is normal, add to x to go right, subtract from x to go left


    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Assets.player, (int) x, (int) y, null);
        //you need to do (int) x and (int) y because x and y are floats,
        //but the method drawImage(BufferedImage image, int x, int y, observer) takes
        //ints as the x and y position, so we use (int) x and (int) y to convert to int
    }
}
