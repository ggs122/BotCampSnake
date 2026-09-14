package snake.game.scene;

import snake.graphics.basic.Color;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Text;


import static snake.game.Game.WINDOW_HEIGHT;
import static snake.game.Game.WINDOW_WIDTH;
import static snake.graphics.basic.Color.RED;

public class GameOverText extends Text {

    public GameOverText(int score) {
        super(
                "Fim de jogo.\nPontos: " + score,
                new Point(WINDOW_WIDTH / 2 - 70, WINDOW_HEIGHT / 2),
                RED
        );
    }
}
