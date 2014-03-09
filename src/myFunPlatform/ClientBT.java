package myFunPlatform;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.bluetooth.ServiceRecord;
import javax.microedition.io.StreamConnection;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.5D9DB700-1C87-B268-E09A-31CCA4FC66F9]
// </editor-fold> 
public class ClientBT extends Thread{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2BC4BA48-252A-4434-9C3E-0C14333EB44F]
    // </editor-fold> 
    private StreamConnection connection;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3E137827-9C81-7EED-FCFA-86AD83F934C2]
    // </editor-fold> 
    private InputStream input;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CB671D54-2B86-4D66-DC5C-FEFA7E1EF629]
    // </editor-fold> 
    private OutputStream output;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.80129BEE-FA40-951D-E81E-427D394A2E55]
    // </editor-fold> 
    private boolean isClosed;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.20A3FDD4-90DF-84EC-225A-D505DD9D0BFA]
    // </editor-fold> 
    private ServiceRecord record;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A9B6C2FC-FEB9-E622-7312-46E7E4F383ED]
    // </editor-fold> 
    private MainMIDlet mainMIDlet;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9071B9DF-2079-5F32-C315-AD723CCF99CA]
    // </editor-fold> 
    public ClientBT (ServiceRecord record, MainMIDlet mainMIDlet) {
        this.record = record;
        this.mainMIDlet = mainMIDlet;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.90D5DA83-E26D-5071-3E95-3EBEDB594F3A]
    // </editor-fold> 
    public void run () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0D4210D5-A186-B5E3-67D8-BC2A02D2C558]
    // </editor-fold> 
    public void closeDown () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.46EED068-5799-AE60-B5B5-0F3DC5739C9B]
    // </editor-fold> 
    public void echoMessage (String msg) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.158BA92B-CE4D-8A77-4906-819FD8F7CDD6]
    // </editor-fold> 
    public void disableClient (String msg) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.96E61777-7704-AC7A-26A0-714FCA2FFFE7]
    // </editor-fold> 
    public void sendMessage (Vector msg) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1A4E6F47-3450-BF52-A7E1-ED4A4C481A58]
    // </editor-fold> 
    public Vector readData () {
        return null;
    }

}

