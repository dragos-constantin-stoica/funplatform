package myFunPlatform;

import java.util.Hashtable;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.20A02B3B-17F9-FBBE-7584-17F26F2F729C]
// </editor-fold> 
public class StaticContent {

    private static Hashtable values;
    private static Hashtable protocols;

    public StaticContent() {
        values = new Hashtable();
        protocols = new Hashtable();
   //     values.put()
        protocols.put("mailto","socket 25");
        values.put("default volume level","5");
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4FCC449D-2010-2011-FC2A-A37BB6D21A12]
    // </editor-fold> 
    public String getValue (String resourceId) {

        return (String)values.get(resourceId);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.37BC5337-841E-DDC5-ECE9-72DC90103A47]
    // </editor-fold> 
    public String translateProtocol (String URL) {
        return (String)protocols.get(URL);
     }

}

