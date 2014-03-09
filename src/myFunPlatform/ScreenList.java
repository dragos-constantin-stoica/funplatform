package myFunPlatform;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A0AB95EB-A566-AF82-D1F4-600EA3F30B70]
// </editor-fold> 
public abstract class ScreenList extends List implements CommandListener {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.32F5AB96-03AA-5D0D-961F-6F393B43CA8D]
    // </editor-fold> 
    private MainMIDlet mainMIDlet;

    public ScreenList(MainMIDlet mainMIDlet, String title, String[] elem,
            Command commands[]) {
        super(title,List.IMPLICIT);
        this.mainMIDlet = mainMIDlet;
        for(int i=0; i<elem.length; i++) {
            setElement(elem[i]);
        }
        for(int i=0; i<commands.length; i++) {
            addCommand(commands[i]);
        }
        setCommandListener(this);
    }

    public void setElement(String e) {
        this.append(e, null);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.76C93B52-284F-D000-0B96-A5D157137E24]
    // </editor-fold> 
    abstract public void commandAction (Command c, Displayable d);

}

