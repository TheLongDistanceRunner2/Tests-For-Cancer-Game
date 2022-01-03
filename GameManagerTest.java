package testy;

import game.frame.*;
import game.frame.Menu;
import game.frame.Window;
import game.level.Blood;
import game.level.Breast;
import game.level.Lung;
import game.operator.Game;
import game.operator.GameManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class GameManagerTest {
    private int currentIndex;
    private Window currentWindow = new Window() {
        @Override
        public void update() {

        }

        @Override
        public void draw(Graphics2D graph) {

        }

        @Override
        public void resume() {

        }

        @Override
        public void keyPressed(int key) {

        }

        @Override
        public void mouseClickd(int x, int y) {

        }
    };
    private Window releasedWindow = new Window() {
        @Override
        public void update() {

        }

        @Override
        public void draw(Graphics2D graph) {

        }

        @Override
        public void resume() {

        }

        @Override
        public void keyPressed(int key) {

        }

        @Override
        public void mouseClickd(int x, int y) {

        }
    };
    private boolean exitClicked;
    private int name = 0;
    private GameManager manager = new GameManager();

    public void loadReleased(){
        Window temp = currentWindow;
        currentWindow = releasedWindow;
        currentWindow.resume();
        releasedWindow = temp;
        temp = null;
        System.gc();
    }

    @Given("I have function releaseWindow")
    public void i_have_function_release_window() {
        this.loadReleased();
    }

    @Given("I have variable name equal to {int}")
    public void i_have_variable_name_equal_to(Integer int1) {
        this.name = int1;
    }

    @Then("Depending on it I create new Window")
    public void depending_on_it_i_create_new_window() {
        switch(name){
            case Window.MENU:{
                currentWindow = new Menu(manager);
                break;
            }
            case Window.NEW_USER: {
                currentWindow = new NewUser(manager);
                break;
            }
            case Window.DASHBOARD: {
                currentWindow = new Dashboard(manager);
                break;
            }
            case Window.TRAININHG: {
                currentWindow = new Training(manager);
                break;
            }
            case Window.BLOOD: {
                currentWindow = new Blood(manager);
                break;
            }
            case Window.BREAST: {
                currentWindow = new Breast(manager);
                break;
            }
            case Window.LUNG: {
                currentWindow = new Lung(manager);
                break;
            }
            case Window.PAUSE: {
                currentWindow = new Pause(manager);
                break;
            }
            case Window.OPENING: {
                currentWindow = new Opening(manager);
                break;
            }
            case Window.HOW_TO_PLAY: {
                currentWindow = new HowToPlay(manager);
                break;
            }
        }
    }

    @Then("I set variable currentIndex with {int}")
    public void i_set_variable_current_index_with(Integer int1) {
        switch(name){
            case Window.MENU:{
                currentIndex = Window.MENU;
                break;
            }
            case Window.NEW_USER: {
                currentIndex = Window.NEW_USER;
                break;
            }
            case Window.DASHBOARD: {
                currentIndex = Window.DASHBOARD;
                break;
            }
            case Window.TRAININHG: {
                currentIndex = Window.TRAININHG;
                break;
            }
            case Window.BLOOD: {
                currentIndex = Window.BLOOD;
                break;
            }
            case Window.BREAST: {
                currentIndex = Window.BREAST;
                break;
            }
            case Window.LUNG: {
                currentIndex = Window.LUNG;
                break;
            }
            case Window.PAUSE: {
                currentIndex = Window.PAUSE;
                break;
            }
            case Window.OPENING: {
                currentIndex = Window.OPENING;
                break;
            }
            case Window.HOW_TO_PLAY: {
                currentIndex = Window.HOW_TO_PLAY;
                break;
            }
        }
    }

    //==============================================================================================
    Window temp;
    Window _currentWindow;

    @Given("I have variable of class Window")
    public void i_have_variable_of_class_window() {
        temp = new Window() {
            @Override
            public void update() {

            }

            @Override
            public void draw(Graphics2D graph) {

            }

            @Override
            public void resume() {

            }

            @Override
            public void keyPressed(int key) {

            }

            @Override
            public void mouseClickd(int x, int y) {

            }
        };
        this._currentWindow = new Window() {
            @Override
            public void update() {

            }

            @Override
            public void draw(Graphics2D graph) {

            }

            @Override
            public void resume() {

            }

            @Override
            public void keyPressed(int key) {

            }

            @Override
            public void mouseClickd(int x, int y) {

            }
        };
        temp = currentWindow;
    }

    @Then("I set currentWindow with releasedWindow")
    public void i_set_current_window_with_released_window() {
        currentWindow = releasedWindow;
    }

    @Then("I call function resume")
    public void i_call_function_resume() {
        currentWindow.resume();
    }

    @Then("I assign temp to releasedWindow")
    public void i_assign_temp_to_released_window() {
        releasedWindow = temp;
        temp = null;
    }

    @Then("I call function System gc")
    public void i_call_function_system_gc() {
        System.gc();
    }

    // ========================================================================================
    @Given("I set releasedWindows with currentWindow")
    public void i_set_released_windows_with_current_window() {
        releasedWindow = currentWindow;
    }

    @Given("_I call function update")
    public void _i_call_function_update() {
        currentWindow.update();
    }

    //===============================================================================================
    Graphics2D __graph;

    @Given("_____I have Graphics2D graph")
    public void _____i_have_graphics2d_graph() {
        this.__graph = new Graphics2D() {
            @Override
            public void draw(Shape s) {

            }

            @Override
            public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
                return false;
            }

            @Override
            public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {

            }

            @Override
            public void drawRenderedImage(RenderedImage img, AffineTransform xform) {

            }

            @Override
            public void drawRenderableImage(RenderableImage img, AffineTransform xform) {

            }

            @Override
            public void drawString(String str, int x, int y) {

            }

            @Override
            public void drawString(String str, float x, float y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, int x, int y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, float x, float y) {

            }

            @Override
            public void drawGlyphVector(GlyphVector g, float x, float y) {

            }

            @Override
            public void fill(Shape s) {

            }

            @Override
            public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
                return false;
            }

            @Override
            public GraphicsConfiguration getDeviceConfiguration() {
                return null;
            }

            @Override
            public void setComposite(Composite comp) {

            }

            @Override
            public void setPaint(Paint paint) {

            }

            @Override
            public void setStroke(Stroke s) {

            }

            @Override
            public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {

            }

            @Override
            public Object getRenderingHint(RenderingHints.Key hintKey) {
                return null;
            }

            @Override
            public void setRenderingHints(Map<?, ?> hints) {

            }

            @Override
            public void addRenderingHints(Map<?, ?> hints) {

            }

            @Override
            public RenderingHints getRenderingHints() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public void translate(double tx, double ty) {

            }

            @Override
            public void rotate(double theta) {

            }

            @Override
            public void rotate(double theta, double x, double y) {

            }

            @Override
            public void scale(double sx, double sy) {

            }

            @Override
            public void shear(double shx, double shy) {

            }

            @Override
            public void transform(AffineTransform Tx) {

            }

            @Override
            public void setTransform(AffineTransform Tx) {

            }

            @Override
            public AffineTransform getTransform() {
                return null;
            }

            @Override
            public Paint getPaint() {
                return null;
            }

            @Override
            public Composite getComposite() {
                return null;
            }

            @Override
            public void setBackground(Color color) {

            }

            @Override
            public Color getBackground() {
                return null;
            }

            @Override
            public Stroke getStroke() {
                return null;
            }

            @Override
            public void clip(Shape s) {

            }

            @Override
            public FontRenderContext getFontRenderContext() {
                return null;
            }

            @Override
            public Graphics create() {
                return null;
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

    @Then("I call function clearRect with x equal to {int} and y equal to {int}")
    public void i_call_function_clear_rect_with_x_equal_to_and_y_equal_to(Integer int1, Integer int2) {
        this.__graph.clearRect(int1, int2, Game.WIDTH, Game.HEIGHT);
    }

    @Then("I set background color with {string}_")
    public void i_set_background_color_with(String s1) {
        if (s1.equals("darkBlue")) {
            this.__graph.setBackground(Game.Colors.darkBlue);
        }
    }

    @Then("I draw the graph")
    public void i_draw_the_graph() {
        currentWindow.draw(this.__graph);
    }

    //=============================================================================
    int __key = 0;

    @Given("I have varaible key equal to {int}")
    public void i_have_varaible_key_equal_to(Integer int1) {
        this.__key = int1;
    }

    @Then("I call funcntion key pressed with this key")
    public void i_call_funcntion_key_pressed_with_this_key() {
        currentWindow.keyPressed(this.__key);
    }

    //=========================================================================================
    int __x = 0;
    int __y = 0;

    @Given("I have variable x equal to {int}")
    public void i_have_variable_x_equal_to(Integer int1) {
        this.__x = int1;
    }

    @Given("I have variable y equal to {int}")
    public void i_have_variable_y_equal_to(Integer int1) {
        this.__y = int1;
    }

    @Then("I call function mouse clicked")
    public void i_call_function_mouse_clicked() {
        currentWindow.mouseClickd(this.__x, this.__y);
    }

    //=========================================================================================
    boolean __exitClicked;

    @Given("I have variable exitClicked")
    public void i_have_variable_exit_clicked() {
        this.__exitClicked = true;
    }

    @Then("I set it with {int}")
    public void i_set_it_with(Integer int1) {
        if (int1 == 1) {
            this.__exitClicked = true;
        }
        else if (int1 == 0) {
            this.__exitClicked = false;
        }
    }

}
