package Tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    //static things here:
    //these are variables that will be used to keep track of all tiles
    public static Tile[] tiles = new Tile[256]; //not the final number

    public static Tile grassTile = new GrassTile(0);//you cannot repeat the id for 2 different tiles
    public static Tile dirtTile = new DirtTile(1);
    public static Tile rockTile = new RockTile(2);

    //class:

    public static final int TILE_WIDTH = 64, TILE_HEIGHT = 64;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture,int id) {
        this.texture = texture;
        this.id = id;
        
        tiles[id] = this;
    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }
}
