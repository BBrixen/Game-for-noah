package rendering;

import rendering.Images.ImageLoader;
import rendering.Images.SpriteSheet;
import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage player, dirt, tree, grass, stone;
    private static int width = 32, height = 32;

    public static void init() {

        //to actually display something to the screen, you need to
        //set the BufferedImage objects equal to something

//        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/sprite_sheet.png"));
//        player = sheet.crop(0, 0, width, height);
//        ground = sheet.crop(width, 0, width, height);
//        tree = sheet.crop(2 * width, 0, width, height);
    }

}
