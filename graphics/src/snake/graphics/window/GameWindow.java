package snake.graphics.window;

import snake.graphics.drawable.Drawable;
import snake.graphics.window.Internal.JFrameGameWindow;

public class GameWindow {

    private JFrameGameWindow window;

    public GameWindow(String title, int width, int height) {
        this.window = new JFrameGameWindow(title, width, height);
    }

    public void addDrawable(Drawable drawable) {
        window.getRenderer().add(drawable);
    }

    public void removeDrawable(Drawable drawable) {
        window.getRenderer().remove(drawable);
    }
}
