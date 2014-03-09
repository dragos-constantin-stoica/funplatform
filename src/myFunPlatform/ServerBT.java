package myFunPlatform;
//comentariu
//comentariu 2
import java.util.Vector;
import javax.microedition.io.StreamConnectionNotifier;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E364616A-9BAD-B132-E646-051859C6D432]
// </editor-fold> 
public class ServerBT extends Thread {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EB3F3763-7B0B-800F-77AC-FCD60AA76E3F]
    // </editor-fold> 
    private StreamConnectionNotifier connection;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5A196218-7F31-B197-6920-ACCB275B1561]
    // </editor-fold> 
    private boolean isRunning;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2ED287F7-1D97-D183-A29E-F428910F2DA3]
    // </editor-fold> 
    private MainMIDlet mainMIDlet;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.479E84ED-B57E-E948-8E96-35672082018A]
    // </editor-fold> 
    public ServerBT (MainMIDlet mainMIDlet) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8C502BD9-8079-294A-2BEB-754C0191D802]
    // </editor-fold> 
    public void run () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FB139D31-C6DA-3C44-4FC9-7A5115002D00]
    // </editor-fold> 
    public void sendAll (Vector msg) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E30D8054-1C5B-E0BA-EE5B-DAE211798C3D]
    // </editor-fold> 
    public void sendAll (String msg) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.95420FBE-18E1-11B4-7116-A5487BE2E5CC]
    // </editor-fold> 
    public void closeDown () {
    }

}

