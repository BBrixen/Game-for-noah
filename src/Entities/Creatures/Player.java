package Entities.Creatures;

import Main.Game;
import rendering.Assets;

import java.awt.*;

public class Player extends Creature {

    private Game game;

    public Player(Game game, float x, float y) {
        super(x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
        this.game = game;
    }

    @Override
    public void tick() {
        getInput();
        move();
    }

    private void getInput() {
        xMove = 0;
        yMove = 0;

        if(game.getKeyManager().up) {
            yMove = -speed;
        }
        if(game.getKeyManager().down) {
            yMove = speed;
        }
        if(game.getKeyManager().left) {
            xMove = -speed;
        }
        if(game.getKeyManager().right) {
            xMove = speed;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Assets.player, (int) x, (int) y, width, height, null);
        //you need to do (int) x and (int) y because x and y are floats,
        //but the method drawImage(BufferedImage image, int x, int y, int width, int height, observer) takes
        //ints as the x and y position, so we use (int) x and (int) y to convert to int
    }
}
