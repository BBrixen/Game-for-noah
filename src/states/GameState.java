package states;

import java.awt.*;

public class GameState extends State {

    public GameState() {

    }

    @Override
    public void tick() {

    }

    //dont worry about the @Override right here, its totally fine and necessary
    @Override
    public void render(Graphics graphics) {

        //************** Draw to screen here **************//

        //also, load images by calling Asstes.[imageName],
        //assets should already be initialized in the init() method of Game

        //graphics.drawImage(Assest.[imageName], x, y, null); will draw an image





        //****************** End drawing ******************//

    }
}
