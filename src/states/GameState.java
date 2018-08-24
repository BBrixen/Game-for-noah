package states;

import Entities.Creatures.Player;
import Main.Game;

import java.awt.*;

public class GameState extends State {

    private Player player;

    public GameState(Game game) {
        super(game);//this is needed, it calls the state constructor
        player = new Player(game, 100, 100);
    }

    @Override
    public void tick() {
        player.tick();
    }

    //dont worry about the @Override right here, its totally fine and necessary
    @Override
    public void render(Graphics graphics) {

        //************** Draw to screen here **************//

        //also, load images by calling Asstes.[imageName],
        //assets should already be initialized in the init() method of Game

        //graphics.drawImage(Assest.[imageName], x, y, null); will draw an image

        player.render(graphics);


        //****************** End drawing ******************//

    }
}
