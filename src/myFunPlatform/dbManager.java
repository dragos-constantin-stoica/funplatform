package myFunPlatform;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.AF5175EF-DD0F-651F-6C40-4F2A7E6D81A4]
// </editor-fold> 
public class dbManager {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C8A371D0-C85C-9763-6417-68F43D1AD1EC]
    // </editor-fold> 
    private RecordStore rs;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9B054485-2071-82E8-E038-5652C3515F7D]
    // </editor-fold> 
    private MainMIDlet mainMIDlet;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AB7D0451-7561-713F-F026-9817960456A4]
    // </editor-fold> 
    private StaticContent sc;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C855B1FE-F823-EFD6-96DC-92D8CBE5A723]
    // </editor-fold> 
    private dbManager (MainMIDlet mainMIDlet,StaticContent sc, RecordStore rs) 
            throws RecordStoreNotOpenException, RecordStoreException {
        this.mainMIDlet = mainMIDlet;
        this.sc = sc;
        this.rs = rs;
        RecordStore.openRecordStore(rs.getName(), true);
    }

    //returns the recordId of the new record
    public void addValueRecord (String value) throws RecordStoreNotOpenException
            , RecordStoreException {
        byte[] valueByte = value.getBytes();
        rs.addRecord(valueByte, 0, valueByte.length);
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2BA4F205-A03E-F442-23EB-05C22E6EF9A8]
    // </editor-fold> 
    public String getValueStatic (String name) {
        return sc.getValue(name);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3CE3BC7B-5A28-3A84-F5C6-7AD4FE907381]
    // </editor-fold> 
    public String getValueRecord (int id) {
        try {
            return rs.getRecord(id).toString();
        } catch (RecordStoreException ex) {
            ex.printStackTrace();
            return "Error in Record Store";
        }
    }

    public void deleteValueRecord(int id) {
        try {
            rs.deleteRecord(id);
        } catch (RecordStoreException ex) {
            ex.printStackTrace();
        }
    }

    public void updateValueRecord(int id, String value) {
            byte[] valueByte = value.getBytes();
        try {
            rs.setRecord(id, valueByte, 0, valueByte.length);
        } catch (RecordStoreException ex) {
            ex.printStackTrace();
        }
    }

}

