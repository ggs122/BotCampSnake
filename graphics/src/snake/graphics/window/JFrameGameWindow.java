package snake.graphics.window;

import snake.graphics.basic.Color;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Rect;
import snake.graphics.drawable.Text;

import javax.swing.*;
import java.awt.*;

public class JFrameGameWindow extends JFrame {

    private final Renderer renderer;

    public JFrameGameWindow(String title, int width, int height) {


        setTitle(title);
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        renderer = new Renderer();
        renderer.add(new Rect(20, 20, 200, 100));
        renderer.add(new Text("Hello", new Point(200, 200), Color.BLACK));

        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        renderer.render(g);
    }
}
