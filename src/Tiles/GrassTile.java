package Tiles;

import rendering.Assets;

public class GrassTile extends Tile {

    public GrassTile(int id) {
        super(Assets.grass, id); //the Assest.grass has not been created yet
        //so this will not display anything
    }
}
