package states;

import java.awt.*;

public abstract class State {

    private static State currentState = null;

    public static void setCurrentState(State state) {
        currentState = state;
    }

    public static State getCurrentState() {
        return currentState;
    }

    //do not edit these, they have nothing to do with the other code above
    public abstract void tick();

    public abstract void render(Graphics graphics);



}
