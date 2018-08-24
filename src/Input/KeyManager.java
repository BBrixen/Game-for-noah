package Input;

import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    //this key control system will change based on the needed input for the game
    private boolean[] keys;
    public boolean up, down, left, right;

    public KeyManager() {
        keys = new boolean[256];
    }

    public void tick() {
        //this method takes the key(s) that is currently being clicked

        //all keys start with VK_
        //so it is KeyEvent.VK_[key name, ex: W, A, S, D, UP, SHIFT]
        up =    keys[KeyEvent.VK_W];
        left =  keys[KeyEvent.VK_A];
        down =  keys[KeyEvent.VK_S];
        right = keys[KeyEvent.VK_D];
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //currently we do not need this method
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        System.out.println("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

}
