
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(200, 100), 400, Color.DARK_GRAY, true);
        
        // Ears:
        RightTriangle leftEar = new RightTriangle(new Point(230, 200), 50, 150, Color.DARK_GRAY, true );
        RightTriangle rightEar = new RightTriangle(new Point(570, 200), -50, 150, Color.DARK_GRAY, true );
        RightTriangle innerleftEar = new RightTriangle(new Point(235, 200), 15, 100, Color.PINK, true );
        RightTriangle innerrightEar = new RightTriangle(new Point(565, 200), -15, 100, Color.PINK, true );
                
        // Eyes:
        Oval leftEye = new Oval(new Point(275, 200), 50, 76, Color.WHITE, true);
        Oval rightEye = new Oval(new Point(475, 200), 50, 76, Color.WHITE, true);
        Oval leftPupil = new Oval(new Point(285, 205), 30, 66, Color.BLACK, true);
        Oval rightPupil = new Oval(new Point(485, 205), 30, 66, Color.BLACK, true);
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(375, 300), 40, Color.BLACK, true);
        PolyLine leftWhisker = new PolyLine(new Point(290, 340), new Point(400, 375), 50, Color.BLACK, true);
        PolyLine rightWhisker = new PolyLine(new Point(400, 375), new Point(510, 340), 50, Color.BLACK, true);
        
        // Tongue:
        Oval tongue = new Oval(new Point(400, 390), 45, 66, Color.RED, true);
                
        // Collar:
        Oval collar = new Oval(new Point(220, 480), 380, 50, Color.BLUE, true);
        Circle collarTag = new Circle(new Point(363, 470), 75, Color.RED, true);
        Circle collarTagDesign = new Circle(new Point(370, 477), 60, Color.GREEN, false);
        
        // Square around the dog:
        Square outSquare = new Square(new Point(145, 40), 515, Color.MAGENTA, false);
        Circle outCircle = new Circle(new Point(40, -65), 725, Color.BLACK, false);
        
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(leftEye);
        drawPanel.addShape(rightEye);
        drawPanel.addShape(leftPupil);
        drawPanel.addShape(rightPupil);
        drawPanel.addShape(nose);
        drawPanel.addShape(leftEar);
        drawPanel.addShape(rightEar);
        drawPanel.addShape(innerleftEar);
        drawPanel.addShape(innerrightEar);
        drawPanel.addShape(leftWhisker);
        drawPanel.addShape(rightWhisker);
        drawPanel.addShape(tongue);
        drawPanel.addShape(collar);
        drawPanel.addShape(collarTag);
        drawPanel.addShape(collarTagDesign);
        drawPanel.addShape(outSquare);
        drawPanel.addShape(outCircle);
        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
