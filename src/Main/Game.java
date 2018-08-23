package Main;

import rendering.Assets;
import rendering.Display;
import states.GameState;
import states.MenuState;
import states.SettingsState;
import states.State;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable {//base code for game

    private Display display;
    private Thread thread;
    private int width, height;
    private boolean running = false;
    public String title;
    private BufferStrategy bufferStrategy;
    private Graphics graphics;

    //states, these will be initialized in the init() method
    private State gameState;
    private State menuState;
    private State settingsState;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public void init() {
        display = new Display(title, width, height);
        Assets.init(); //this will be used to call images for rendering
        //access them by doing Assets.[imageName]

        //initialize the states
        gameState = new GameState();
        menuState = new MenuState();
        settingsState = new SettingsState();
        //set current state
        State.setCurrentState(gameState);//we are currently in the game state

    }

    private void tick() {
        //where you change the value of variables
        if (State.getCurrentState() != null) {
            //we are in a state
            State.getCurrentState().tick();
        }
    }

    private void render() {
        bufferStrategy = display.getCanvas().getBufferStrategy();
        if(bufferStrategy == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        graphics = bufferStrategy.getDrawGraphics();
        graphics.clearRect(0, 0, width, height);

        //this is where we put the drawing
        //but we do the drawing in the specified state object's render method
        if (State.getCurrentState() != null) {
            //we are in a state
            State.getCurrentState().render(graphics);
        }

        bufferStrategy.show();
        graphics.dispose();
    }

    public void run(){
        init();

        int fps = 60;
        double time_per_tick = 1000000000 / fps;
        double delta = 0;
        long now;
        long last_time = System.nanoTime();

        //for fps counter,
        //not the fps, but a counter to make sure the fps is at the correct value
        long timer = 0;
        int ticks = 0;

        while (running) {

            //sets variable values for checking
            //if we need to run the update() and render() methods
            now = System.nanoTime();
            delta += (now - last_time) / time_per_tick;
            timer += now - last_time;   //for fps counter
            last_time = now;

            if(delta >= 1) { //checks if we need to run update() and render()
                //runs method
                tick();
                render();

                ticks++; //for fps counter
                delta--;
            }

            if (timer == 1000000000) { //all of this is for the fps counter
                System.out.println("Ticks and frames: " + ticks);
                //should print out around 60 (b/t 58 and 62) once a second
                ticks = 0;
                timer = 0;
            }
        }
        stop(); //stops the thread that is running
    }

    public synchronized void start() {
        if (running) {
            return;
        }

        running = true;
        thread = new Thread(this);
        thread.start(); // thread.start calls the run() method
    }

    public synchronized void stop(){

        if (!running) {
            return;
        }
        running = false;

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
