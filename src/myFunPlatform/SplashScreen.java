package myFunPlatform;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0E1E2E5B-9733-8C79-E5AD-7AA22BE50D80]
// </editor-fold> 
public class SplashScreen extends Canvas {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7F491B3A-D46D-BEB0-C506-3CA2144E6AB4]
    // </editor-fold> 
    private Image image;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.88A98D9E-2E4A-F92E-CFD0-7F5F37D1F893]
    // </editor-fold> 
    private Timer timer = new Timer();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.484981E1-A545-A771-2EFC-933F0ABF994C]
    // </editor-fold> 
    private final MainMIDlet mainMIDlet;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0F921E8F-3D44-DA7E-0B9A-A23FE13731B1]
    // </editor-fold> 
    public SplashScreen (MainMIDlet mainMidlet) {
        this.mainMIDlet = mainMidlet;
        try {
            image = Image.createImage("include/icon.png");
        }
        catch (IOException e) {
        //TODO
            image = Image.createImage(64,64);
            Graphics g = image.getGraphics();
            g.setColor(0x002288FF);
            g.fillRoundRect(5,5,40,40,10,10);
        }
    }


    void start() {
        if (timer != null) {
            timer.cancel();
        }

        timer = new Timer();

        TimerTask dismissTask =
            new TimerTask() {
                public void run() {
                    if (timer != null) {
                        dismiss();
                    }
                }
            };

        // dismiss the splash screen after 5 seconds
        timer.schedule(dismissTask, 5000L);
    }


    private void dismiss()
    {
        timer.cancel();
        mainMIDlet.splashScreenDone();
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.935510A0-08D1-900D-F207-C25CBF9E8915]
    // </editor-fold> 
    public void paint (Graphics g) {
        // This paint method assumes that at least the splash.png image
        // fits within the Canvas. If there is additional space left,
        // it will also draw the 'MIDlet-Vendor' string.

        //TODO
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        int canvasWidth = getWidth();
        int canvasHeight = getHeight();

        Font font = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_SMALL);

        // 1) use a WHITE background
        g.setColor(0xFFFFFF);
        g.fillRect(0, 0, canvasWidth, canvasHeight);

        // 2) draw the splash image
        int anchor = (Graphics.TOP | Graphics.HCENTER);
        int y = canvasHeight - imageHeight;
        if (canvasHeight >= (imageHeight + 4 + font.getHeight()))
        {
            // if there is space to use the vendor string, we'll use it
            y -= (4 + font.getHeight());
        }
        y /= 2;
        g.drawImage(image, (canvasWidth / 2), y, anchor);

        // 3) Check if canvas has enough space to also draw vendor string
        y += (imageHeight + 4); // 4 pixels of space between image & string
        if (canvasHeight >= (y + font.getHeight()))
        {
            g.setFont(font);
            g.setColor(0x000000); // BLACK text
            String vendor = mainMIDlet.getAppProperty("MIDlet-Vendor");
            g.drawString(vendor, (canvasWidth / 2), y, anchor);
        }
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0C39EE22-3B2C-C0EE-80DB-716D6560F9AA]
    // </editor-fold> 
    public void keyPressed (int keyCode) {
         dismiss();
    }


}

