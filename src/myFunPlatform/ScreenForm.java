package myFunPlatform;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1824A167-73EF-D43D-5B65-EA77A047547C]
// </editor-fold> 
public abstract class ScreenForm extends Form implements CommandListener {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.347512A1-3443-18F6-6077-AA507F1ACFB2]
    // </editor-fold> 
    private MainMIDlet mainMIDlet;

    public ScreenForm (MainMIDlet mainMIDlet, String title, Command[] commands) {
        super(title);
        this.mainMIDlet = mainMIDlet;
        for(int i=0; i<commands.length; i++) {
            addCommand(commands[i]);
        }
        setCommandListener(this);
    }

    public void addTextField (TextField text) {
        append(text);
    }

    public void addStringItem (StringItem string) {
        append(string);
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.21EBCF5F-ADD4-491B-AE20-B5F12E5BD9BD]
    // </editor-fold> 
    abstract public void commandAction (Command c, Displayable d);

}

