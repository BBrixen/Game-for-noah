package states;

import Main.Game;
import java.awt.*;

public abstract class State {

    //get and set methids for current state
    private static State currentState = null;

    public static void setCurrentState(State state) {
        currentState = state;
    }

    public static State getCurrentState() {
        return currentState;
    }

    //do not edit these, they have nothing to do with the other code above
    //CLASS

    protected Game game;

    public State(Game game) {
        this.game = game;
    }

    public abstract void tick();

    public abstract void render(Graphics graphics);



}
