package snake.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snake.game.scene.Background;

import snake.graphics.window.GameWindow;

import static snake.graphics.basic.Color.BLACK;

public class Game {

    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;
    private static final String WINDOW_TITLE = "Snake!";

    GameWindow gameWindow;

    public void start() {
        LOGGER.debug("Starting");
       gameWindow = new GameWindow(WINDOW_TITLE, WINDOW_WIDTH, WINDOW_HEIGHT);
       addElementsToSccreen();

    }

    private void addElementsToSccreen() {
        gameWindow.addDrawable(new Background(WINDOW_WIDTH, WINDOW_HEIGHT, BLACK));
    }

}
