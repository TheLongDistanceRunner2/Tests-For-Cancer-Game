package testy;

import game.operator.Game;
import game.operator.GameManager;
import game.operator.TheGame;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class GamePanelTest extends JPanel implements Runnable, KeyListener, MouseListener {
    private GameManager manager;
    private BufferedImage screen;
    private Graphics2D pane;
    private boolean gameRunning;
    private boolean gameOver;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {

    }

    @Given("I have a game manager")
    public void i_have_a_game_manager() {
        this.manager = new GameManager();
    }

    @Given("I have a screen")
    public void i_have_a_screen() {
        this.screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
    }

    @Given("I have a pane")
    public void i_have_a_pane() {
        this.pane = (Graphics2D )screen.getGraphics();
    }

    @Then("I set gameRunning with {int}")
    public void i_set_game_running_with(Integer int1) {
        if (int1 == 1) {
            gameRunning = true;
        }
        else if (int1 == 0) {
            gameRunning = false;
        }
    }

    @Then("I set gameOver with {int}")
    public void i_set_game_over_with(Integer int1) {
        if (int1 == 1) {
            this.gameOver = true;
        }
        else if (int1 == 0) {
            this.gameOver = false;
        }
    }

    //==================================================================================
    @Then("I call function update")
    public void i_call_function_update() {
        this.manager.update();
    }

    @And("If manager exists I set gameRunning with {int}")
    public void if_manager_exists_i_set_game_running_with(Integer int1) {
        if(manager.isExit()) {
            if (int1 == 1) {
                gameRunning = true;
            }
            else if (int1 == 0) {
                gameRunning = false;
            }
        }
    }

    @Then("If manager exists I set gameOver with {int}")
    public void if_manager_exists_i_set_game_over_with(Integer int1) {
        if(manager.isExit()) {
            if (int1 == 1) {
                gameOver = true;
            }
            else if (int1 == 0) {
                gameOver = false;
            }
        }
    }

    //=================================================================================================
    @Then("I call function draw")
    public void i_call_function_draw() {
        GameManager manager2 = new GameManager();
        manager2.draw(pane);
    }

    //================================================================================================
    Graphics graph;

    @Given("I have a graph")
    public void i_have_a_graph() {
        graph = new Graphics() {
            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color c) {

            }

            @Override
            public void setPaintMode() {

            }

            @Override
            public void setXORMode(Color c1) {

            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(Font font) {

            }

            @Override
            public FontMetrics getFontMetrics(Font f) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {

            }

            @Override
            public void setClip(int x, int y, int width, int height) {

            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(Shape clip) {

            }

            @Override
            public void copyArea(int x, int y, int width, int height, int dx, int dy) {

            }

            @Override
            public void drawLine(int x1, int y1, int x2, int y2) {

            }

            @Override
            public void fillRect(int x, int y, int width, int height) {

            }

            @Override
            public void clearRect(int x, int y, int width, int height) {

            }

            @Override
            public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void drawOval(int x, int y, int width, int height) {

            }

            @Override
            public void fillOval(int x, int y, int width, int height) {

            }

            @Override
            public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawString(String str, int x, int y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, int x, int y) {

            }

            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public void dispose() {

            }
        };
    }

    @Then("I draw image of dimensions {int} {int}")
    public void i_draw_image_of_dimensions(Integer int1, Integer int2) {
        graph.drawImage(screen, int1, int2, null);
    }

    @Then("I call function dispose")
    public void i_call_function_dispose() {
        graph.dispose();
    }

    //=================================================================================================
    @Given("I call function addNotify")
    public void i_call_function_add_notify() {
        super.addNotify();
    }

    private Thread runnerThread = new Thread();
    private boolean flag = false;

    @When("Runner thread is null")
    public void runner_thread_is_null() {
        if(runnerThread == null) {
            this.flag = true;
        }
    }

    @Then("I add key listener")
    public void i_add_key_listener() {
        if (flag) {
            addKeyListener(this);
        }
    }

    @Then("I add mouse listener")
    public void i_add_mouse_listener() {
        if (flag) {
            addMouseListener(this);
        }
    }

    @Then("I create new thread")
    public void i_create_new_thread() {
        runnerThread = new Thread(this);
    }

    @Then("I start it")
    public void i_start_it() {
        runnerThread.start();
    }

    //======================================================================================
    private Thread _runnerThread;
    private GameManager _manager;
    private BufferedImage _screen;
    private Graphics2D _pane;
    private Graphics _graph;

    private boolean _gameRunning;
    private boolean _gameOver;



    private void initial(){
        _manager = new GameManager();
        _screen = new BufferedImage(Game.WIDTH, Game.HEIGHT,BufferedImage.TYPE_INT_ARGB);
        _pane = (Graphics2D )_screen.getGraphics();

        _gameRunning = true;
        _gameOver = false;
    }

    private void update(){
        _manager.update();
        if(_manager.isExit()){
            _gameRunning = false;
            _gameOver = true;
        }
    }

    private void draw(){
        _manager.draw(_pane);
    }

    private void render(){
        //System.out.println(this.screen);
        //System.out.println(graph);
        _graph.drawImage(screen, 0, 0, null);
        _graph.dispose();
    }

    @Given("_I have a graph_")
    public void _i_have_a_graph() {
        _graph = new Graphics() {
            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color c) {

            }

            @Override
            public void setPaintMode() {

            }

            @Override
            public void setXORMode(Color c1) {

            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(Font font) {

            }

            @Override
            public FontMetrics getFontMetrics(Font f) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {

            }

            @Override
            public void setClip(int x, int y, int width, int height) {

            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(Shape clip) {

            }

            @Override
            public void copyArea(int x, int y, int width, int height, int dx, int dy) {

            }

            @Override
            public void drawLine(int x1, int y1, int x2, int y2) {

            }

            @Override
            public void fillRect(int x, int y, int width, int height) {

            }

            @Override
            public void clearRect(int x, int y, int width, int height) {

            }

            @Override
            public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void drawOval(int x, int y, int width, int height) {

            }

            @Override
            public void fillOval(int x, int y, int width, int height) {

            }

            @Override
            public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawString(String str, int x, int y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, int x, int y) {

            }

            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public void dispose() {

            }
        };
    }

    @Given("I call function initial")
    public void i_call_function_initial() {
        initial();
    }

    @Then("I call functions in loop")
    public void i_call_functions_in_loop() {
        long before, dif, wait;

        while(_gameRunning) {
            before = System.nanoTime();

            //rendering
            update();
            draw();
            render();

            dif = System.nanoTime() - before;
            dif /= 10e6;
            wait = 1000/Game.FPS - dif;
            if(wait<0)
                wait = 5;
            try{
                Thread.sleep(wait);
            } catch(InterruptedException e){
                e.printStackTrace();
            }

            // stop manually the loop !!!
            _gameRunning = false;
        }
    }

    @Then("_I call function dispose")
    public void _i_call_function_dispose() {
        //TheGame.gameFrame.dispose();
    }

    private GameManager manager3;

    @Given("_I have a game manager")
    public void _i_have_a_game_manager() {
        this.manager3 = new GameManager();
    }

    Button a = new Button("click");
    KeyEvent e;

    @Given("I have a key pressed {int}")
    public void i_have_a_key_pressed(Integer int1) {
        e = new KeyEvent(a, 1, 20, 1, int1, 'A');
    }

    @Then("I call function keyPressed")
    public void i_call_function_key_pressed() {
        System.out.println(e);
        manager3.keyPressed(e.getKeyCode());
    }


}
