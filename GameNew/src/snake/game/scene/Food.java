package snake.game.scene;

import snake.graphics.drawable.Rect;

import java.awt.*;

import static snake.graphics.basic.Color.RED;

public class Food extends Rect {

    public Food() {
        moveToRandomLocation();
        dimension(5, 5);
        setColor(RED);
    }

    public void moveToRandomLocation() {
        location(new Point(100, 100));
    }
}
