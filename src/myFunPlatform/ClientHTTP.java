package myFunPlatform;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.DBC143F2-1AB0-BF24-B03E-B5CCA9F448E1]
// </editor-fold> 
public class ClientHTTP extends Thread {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3B6DC8FB-2118-A565-5B6D-38349FEE0F2A]
    // </editor-fold> 
    private boolean isClosed;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6BCF09D9-FF55-E994-01AA-D70805D0651F]
    // </editor-fold> 
    private String URL;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A8893B8D-766E-DACB-A282-5EC93FEC0449]
    // </editor-fold> 
    private MainMIDlet mainMIDlet;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1C304648-9163-7083-1FB0-E531373E4C39]
    // </editor-fold> 
    public ClientHTTP (MainMIDlet mainMIDlet, String key) {
        this.mainMIDlet = mainMIDlet;
        this.URL = dbManager.getStaticContent().translateProtocol(key);
        Thread t = new Thread(this);
        t.start();
        isClosed = true;
    }

    /**
     *  <p style="margin-top: 0">
     *        recuperare URL; conectare; citire date: string/buffer
     *      </p>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FEEFE754-EFCE-0F39-B925-764E8D8E4B5D]
    // </editor-fold> 
    public void run () {
        HttpConnection hc = null;
        DataInputStream in = null;
        try {
            hc = (HttpConnection) Connector.open(URL);
            isClosed = false;
            int length = (int) hc.getLength();
            byte[] data = null;
            if (length!=-1) {
                data = new byte[length];
                in = new DataInputStream(hc.openInputStream());
                in.readFully(data);
            }
            else {
                int chunkSize = 512;
                int index = 0;
                int readLength = 0;
                in = new DataInputStream(hc.openInputStream());
                data = new byte[chunkSize];
                do {
                    if (data.length < index + chunkSize) {
                        byte[] newData = new byte[index + chunkSize];
                        System.arraycopy(data,0,newData,0,data.length);
                        data = newData;
                    }
                    readLength = in.read(data,index,chunkSize);
                    index += readLength;
                } while (readLength == chunkSize);
                length = index;
                    }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (hc != null) {
                    hc.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
          }
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4E139B6E-678E-B16D-7A6F-08C0927CC1B1]
    // </editor-fold> 
    public void closeDown () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.85CE34EA-DBD1-B878-9338-A352DA3F3B6F]
    // </editor-fold> 
    public void getHTTPMessage () {
    }

}

