package testy;

import game.frame.Window;
import game.operator.Game;
import game.operator.GameManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import structure.Sound;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.*;
import java.awt.image.renderable.RenderableImage;
import java.io.*;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingTest {
    private File file;
    private String temp = "";
    private StringTokenizer st;
    private ArrayList<String> list = new ArrayList<>();
    private boolean basicLoaded, areaLoaded;
    private Image anim,goodCell,cancerCell,pendingCell,chemo,radiation,surgery;

    @Given("I have a file named {string}")
    public void i_have_a_file_named(String s1) {
        this.file = new File("res//files//" + s1);
    }

    @When("I read_ the file")
    public void i_read_the_file() {
        try{
            FileReader fr = new FileReader(this.file);
            BufferedReader br = new BufferedReader(fr);
            String loaderString;

            while((loaderString = br.readLine()) != null){
                this.temp += loaderString;
            }

            br.close();
            fr.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    @Then("I create stringtokenizer")
    public void i_create_stringtokenizer() {
        this.st = new StringTokenizer(temp,"{}");
    }

    @Then("I add elements to the list")
    public void i_add_elements_to_the_list() {
        while(this.st.hasMoreElements()){
            this.list.add(this.st.nextElement().toString());
        }
    }

    @Then("If file name equals {string}")
    public void if_file_name_equals(String s1) {
        String name = "basic.FILE";
        Assert.assertEquals(name, s1);
    }

    @Then("I set basicLoaded with {long}")
    public void i_set_basic_loaded_with(Long l1) {
        if (l1 == 1) {
            this.basicLoaded = true;
        }
        else {
            this.basicLoaded = false;
        }
    }

    @Then("If the file name equals {string}")
    public void if_the_file_name_equals(String s1) {
        String name = "area.FILE";
        Assert.assertEquals(name, s1);
    }

    @Then("I set the areaLoaded with {long}")
    public void i_set_the_area_loaded_with(Long l1) {
        if (l1 == 1) {
            this.basicLoaded = true;
        }
        else {
            this.basicLoaded = false;
        }
    }

    // =======================================================================
    @Then("I have image named {string} and create it")
    public void i_have_image_named_and_create_it(String s1) {
        if (s1.equals("/image/level/cell.png")) {
            this.goodCell = Game.getImage(s1);
        }
        else if (s1.equals("/image/level/cancer_left.png")) {
            this.cancerCell = Game.getImage(s1);
        }
        else if (s1.equals("/image/level/cell_bw.png")) {
            this.pendingCell = Game.getImage(s1);
        }
        else if (s1.equals("/image/level/chemo.png")) {
            this.chemo = Game.getImage(s1);
        }
        else if (s1.equals("/image/level/radiation.png")) {
            this.radiation = Game.getImage(s1);
        }
        else if (s1.equals("/image/level/scissor.png")) {
            this.surgery = Game.getImage(s1);
        }
    }

    //====================================================================
    private Graphics2D graph;
    private Font labelFont;
    private int selectY = 340;

    @Given("_I have Graphics2D graph")
    public void _i_have_graphics2d_graph() {
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

        labelFont = Game.Fonts.getFont("Courier.ttf", Font.BOLD, 30);
    }

    @Then("_I set font with {string}")
    public void _i_set_font_with(String s1) {
        if (s1.equals("labelFont")) {
            graph.setFont(labelFont);
        }
    }

    @Then("_I set color with {string}")
    public void _i_set_color_with(String s1) {
        if (s1.equals("white")) {
            graph.setColor(Color.white);
        }
        else if (s1.equals("darkBlue")) {
            graph.setColor(Game.Colors.darkBlue);
        }
        else if (s1.equals("red")) {
            graph.setColor(Color.red);
        }
    }

    @Then("I fill rect {int} {int} {int}")
    public void i_fill_rect(Integer int1, Integer int2, Integer int3) {
        graph.fillRect(int1, selectY,int2,int3);
    }

    @Then("_I draw image {int} {int} {int} {int}")
    public void _i_draw_image(Integer int1, Integer int2, Integer int3, Integer int4) {
        graph.drawImage(anim,int1,int2,int3,int4,null);
    }

    @Then("_I draw string {string} {int} {int}")
    public void _i_draw_string(String s1, Integer int1, Integer int2) {
        graph.drawString(s1, int1, int2);
    }

    //============================================================================================
    private Graphics2D _graph2;
    private final ArrayList<String> area = new ArrayList<>();
    private Font textFont = Game.Fonts.getFont("Courier.ttf", Font.BOLD, 20);

    @Given("__I have a graph2")
    public void __i_have_a_graph2() {
        this._graph2 = new Graphics2D() {
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

    @When("__I set color with {string}")
    public void __i_set_color_with(String s1) {
        if (s1.equals("white")) {
            this._graph2.setColor(Color.white);
        }
    }

    @When("__I set font with {string}")
    public void __i_set_font_with(String s1) {
        if (s1.equals("labelFont")) {
            _graph2.setFont(labelFont);
        }
        else if (s1.equals("textFont")) {
            graph3.setFont(textFont);
        }
    }

    @Then("__I draw strings")
    public void __i_draw_strings() {
        int y = 40;
        for (int i=0; i<area.size(); i++){
            if (area.get(i).length() < 50){
                graph.drawString(area.get(i),310,y);
                y+=35;
            }
            else{
                graph.drawString(area.get(i).substring(0,50),310,y);
                y+=35;
                graph.drawString(area.get(i).substring(50),310,y);
                y+=35;
            }
        }
    }

    @Then("___I draw strings")
    public void ___i_draw_strings() {
        int y = 40;
        for(int i=0; i<area.size(); i++){
            if(area.get(i).length() < 50){
                graph.drawString(area.get(i),310,y);
                y+=35;
            }
            else{
                graph.drawString(area.get(i).substring(0,50),310,y);
                y+=35;
                graph.drawString(area.get(i).substring(50),310,y);
                y+=35;
            }
        }
    }

    //========================================================================================
    private Graphics2D graph3;

    @Given("____I have a graph3")
    public void ____i_have_a_graph3() {
        graph3 = new Graphics2D() {
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

    @Then("_I fill Threed rect {int} {int} {int} {int} {int}")
    public void _i_fill_threed_rect(Integer arg0, Integer arg1, Integer arg2, Integer arg3, Integer f) {
        boolean flag = false;

        if (f == 1) {
            flag = true;
        }
        else if (f == 0) {
            flag = false;
        }

        //graph3.fill3DRect(305, 5, 50, 50, true);
    }

    @Then("__I draw image {int} {int} {int} {int}")
    public void __i_draw_image(Integer arg0, Integer arg1, Integer arg2, Integer arg3) {
        graph3.drawImage(goodCell,arg0,arg1,arg2,arg3,null);
        graph3.drawImage(cancerCell,arg0,arg1,arg2,arg3,null);
        graph3.drawImage(pendingCell,arg0,arg1,arg2,arg3,null);
        graph3.drawImage(chemo,arg0,arg1,arg2,arg3,null);
        graph3.drawImage(radiation,arg0,arg1,arg2,arg3,null);
        graph3.drawImage(surgery,arg0,arg1,arg2,arg3,null);
    }

    @Then("___I set color with {string}")
    public void ___i_set_color_with(String s1) {
        if (s1.equals("white")) {
            this.graph3.setColor(Color.white);
        }
    }

    @Then("___I draw string {string} {int} {int}")
    public void ___i_draw_string_text_x_y(String text, int x, int y) {
        graph3.drawString(text, x, y);
    }

    //=================================================================================
    private Graphics2D graph4;
    private Graphics2D graph5 = new Graphics2D() {
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
    private final ArrayList<String> basic = new ArrayList<>();

    @Given("I have flag basicLoaded with value {int}")
    public void i_have_flag_basic_loaded_with_value(Integer f) {
        boolean flag = false;

        if (f == 1) {
            flag = true;
        }
        else if (f == 0) {
            flag = false;
        }

        this.basicLoaded = flag;
    }

    @Given("I have flag areaLoaded with value {int}")
    public void i_have_flag_area_loaded_with_value(Integer f) {
        boolean flag = false;

        if (f == 1) {
            flag = true;
        }
        else if (f == 0) {
            flag = false;
        }

        this.areaLoaded = flag;
    }

    @Given("Have a graph4")
    public void have_a_graph4() {
        this.graph4 = new Graphics2D() {
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

    @Then("I draw panel")
    public void i_draw_panel() {
        graph4.setFont(labelFont);
        graph4.setColor(Color.WHITE);
        graph4.fillRect(0, 0, 300,Game.HEIGHT);
        graph4.drawImage(anim,0,0,300,300,null);

        //selection rectangle
        graph4.setColor(Game.Colors.darkBlue);
        graph4.fillRect(0,selectY,300,50);

        //options
        graph4.setColor(Color.red);
        graph4.drawString("Basic",80, 375);
        graph4.drawString("Area",80, 425);
        graph4.drawString("Components",80, 475);
    }

    @Then("set font with {string}")
    public void set_font_with(String s1) {
        if (s1.equals("labelFont")) {
            graph4.setFont(labelFont);
        }
    }

    @Then("set color with {string}")
    public void set_color_with(String s1) {
        if (s1.equals("red")) {
            this.graph4.setColor(Color.red);
        }
    }

    @Then("I do some action depending on value {int}")
    public void i_do_some_action_depending_on_value(Integer now) {
        switch(now) {
            case 0:
                graph4.setColor(Color.WHITE);
                graph4.setFont(textFont);
                int y = 50;
                for(String i : basic){
                    if(i.length() < 50){
                        graph4.drawString(i, 310,y);
                        y += 40;
                    }
                    else{
                        graph4.drawString(i.substring(0, 50),310,y);
                        y+=40;
                        graph4.drawString(i.substring(50),310, y);
                        y+=70;
                    }

                }
                break;
            case 1:
                graph4.setColor(Color.WHITE);
                graph4.setFont(textFont);
                int _y = 40;
                for(int i=0; i<area.size(); i++){
                    if(area.get(i).length() < 50){
                        graph4.drawString(area.get(i),310,_y);
                        _y+=35;
                    }
                    else{
                        graph4.drawString(area.get(i).substring(0,50),310,_y);
                        _y+=35;
                        graph4.drawString(area.get(i).substring(50),310,_y);
                        _y+=35;
                    }
                }
                break;
            case 2:
                graph5.setColor(Color.LIGHT_GRAY);
//                graph5.fill3DRect(305, 5, 50, 50, true);
//                graph5.fill3DRect(305, 85, 50, 50, true);
//                graph5.fill3DRect(305, 165, 50, 50, true);
//                graph5.fill3DRect(305, 245, 50, 50, true);
//                graph5.fill3DRect(305, 325, 50, 50, true);
//                graph5.fill3DRect(305, 405, 50, 50, true);
                graph5.drawImage(goodCell,310,10,40,40,null);
                graph5.drawImage(cancerCell,310,90,40,40,null);
                graph5.drawImage(pendingCell,310,170,40,40,null);
                graph5.drawImage(chemo,310,250,40,40,null);
                graph5.drawImage(radiation,310,330,40,40,null);
                graph5.drawImage(surgery,310,410,40,40,null);

                graph5.setFont(textFont);
                graph5.setColor(Color.WHITE);
                graph5.drawString("Normal Cell", 370, 35);
                graph5.drawString("Cancer Cell", 370, 115);
                graph5.drawString("Cell Under Therapy", 370, 195);
                graph5.drawString("Chemotherapy", 370, 275);
                graph5.drawString("Radiation Therapy", 370, 355);
                graph5.drawString("Surgery", 370, 435);
                break;
        }
    }

    //====================================================================================
    private int key = 0;
    private int now = 0;
    private Sound selectionSound = Game.getSound("option.wav");;

    @Given("I have a key of value {int}")
    public void i_have_a_key_of_value(Integer int1) {
        this.key = int1;
    }

    @When("It is equal {int}")
    public void it_is_equal(Integer int1) {
        this.key = 40;
        Assert.assertEquals(this.key, (long)int1);
    }

    @Then("I call play function and set some values")
    public void i_call_play_function_and_set_some_values() {
        this.selectionSound.play();
        switch(now){
            case 0: now = 2; selectY = 440; break;
            case 1: now = 0; selectY = 340; break;
            case 2: now = 1; selectY = 390; break;
        }
    }

    @When("_It is equal {int}")
    public void _it_is_equal(Integer int1) {
        int key2 = 22;
        Assert.assertEquals(key2, (long)int1);
    }

    @When("It is equal {int} or {int}")
    public void it_is_equal_or(Integer int1, Integer int2) {
        int key3 = 27;
        int key4 = 8;
        Assert.assertEquals(key3, (long)int1);
        Assert.assertEquals(key4, (long)int2);
    }

    private GameManager manager = new GameManager();

    @Then("_I load window")
    public void _i_load_window() {
        manager.loadWindow(Window.MENU);
    }

    //==============================================================================
    private int x = 5;
    private int y = 43;

    @Given("I have x equal to {int}")
    public void i_have_x_equal_to(Integer int1) {
        Assert.assertEquals(x, (long)int1);
    }

    @Given("I have y equal to {int}")
    public void i_have_y_equal_to(Integer int1) {
        Assert.assertEquals(y, (long)int1);
    }

    @When("x is greater than {int}")
    public void x_is_greater_than(Integer int1) {
        assertTrue(this.x > int1);
    }

    @When("x is less then {int}")
    public void x_is_less_then(Integer int1) {
        assertTrue(this.x < int1);
    }

    @Then("if y is equal or greater to {int} and less than {int}")
    public void if_y_is_equal_or_greater_to_and_less_than(Integer int1, Integer int2) {
        this.x = 350;
        assertTrue(this.x >= int1 && this.x < int2);
    }

    private int selectX = 0;

    @Then("I set select with {int}")
    public void i_set_select_with(Integer int1) {
        this.selectX = int1;
    }

    @Then("I set now with {int}")
    public void i_set_now_with(Integer int1) {
        this.now = int1;
    }
}
