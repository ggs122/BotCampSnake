package snake.graphics.window;

import snake.graphics.drawable.Drawable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Renderer {

    private final List<Drawable> drawables;

    public Renderer() {
        drawables = new ArrayList<>();
    }

    public void render(Graphics g) {
        for (Drawable d : drawables) {
            //TODO -> Definir cor
            g.setColor(Color.GREEN);
            d.draw(g);
        }
    }

    public void add(Drawable drawable) {
        drawables.add(drawable);
    }

    public void remove (Drawable drawable) {
        drawables.add(drawable);
    }
}
