
package game;

import game.Frames.GameFrame;

import java.awt.*;
import java.io.IOException;

/**Brick Destroy - A simple Arcade video game
 * This is the main class
 * @author Mustafa Mehmood
 * @version 1
 */
public class GraphicsMain {

    /**
     * Initializes the game
     * @param args
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            try {
                new GameFrame().initialize();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
