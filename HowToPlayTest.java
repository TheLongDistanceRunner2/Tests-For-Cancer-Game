package testy;

import game.frame.HowToPlay;
import game.frame.Window;
import game.operator.Game;
import game.operator.GameManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.*;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HowToPlayTest {
    private String fileDestination = "";
    private ArrayList<String> store = new ArrayList<>();
    private String data = "";

    @Given("file destination {string}")
    public void file_destination(String s1) {
        this.fileDestination = s1;
    }

    @When("I read the file")
    public void i_read_the_file() {
        File file = new File(this.fileDestination);

        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String temp;

            while((temp = br.readLine()) != null){
                data += temp;
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(HowToPlay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HowToPlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Then("I add read data to store ArrayList")
    public void i_add_read_data_to_store_array_list() {
        StringTokenizer st = new StringTokenizer(data,"#");

        while(st.hasMoreElements()){
            this.store.add(st.nextElement().toString());
        }
    }

    //========================================================================================================
    private Graphics2D graph;
    private Font textFont,headerFont;
    private int yPos;
    private int keyPressed = 0;
    GameManager manager = new GameManager();


    @Given("I have Graphics2D graph")
    public void i_have_graphics2d_graph() {
        this.graph = new Graphics2D() {
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

        textFont = Game.Fonts.getFont("Courier.ttf",Font.BOLD,16);
        headerFont = Game.Fonts.getFont("Courier.ttf",Font.BOLD,30);
    }

    @Then("I set background color with {string}")
    public void i_set_background_color_with(String s1) {
        if (s1.equals("darkBlue")) {
            this.graph.setBackground(Game.Colors.darkBlue);
        }
    }

    @Then("I set color with {string}")
    public void i_set_color_with(String s1) {
        if (s1.equals("red")) {
            graph.setColor(Color.red);
        }
    }

    @Then("I set font with {string}")
    public void i_set_font_with(String s1) {
        if (s1.equals("headerFont")) {
            graph.setFont(headerFont);
        }
    }

    @Then("I draw string {string} {int} {int}")
    public void i_draw_string(String s1, Integer int1, Integer int2) {
        graph.drawString(s1, int1, int2);
    }

    @Then("I set color2 with {string}")
    public void i_set_color2_with(String s1) {
        if (s1.equals("white")) {
            graph.setColor(Color.WHITE);
        }
    }

    @Then("I set font2 with {string}")
    public void i_set_font2_with(String s1) {
        if (s1.equals("textFont")) {
            graph.setFont(textFont);
        }
    }

    @Then("I set yPos with {int}")
    public void i_set_y_pos_with(Integer int1) {
        this.yPos = int1;
    }

    @Then("I draw strings with x equal to {int}")
    public void i_draw_strings_with_x_equal_to(Integer int1) {
        for(String s:store){
            graph.drawString(s, int1, this.yPos);
            this.yPos += 20;
        }
    }

    @When("I press key of value {int}")
    public void i_press_key_of_value(Integer int1) {
        this.keyPressed = int1;
    }

    @Then("I call function loadReleased")
    public void i_call_function_load_released() {
        if(this.keyPressed == KeyEvent.VK_ESCAPE || this.keyPressed == KeyEvent.VK_BACK_SPACE){
            manager.loadReleased();
        }
    }
}
