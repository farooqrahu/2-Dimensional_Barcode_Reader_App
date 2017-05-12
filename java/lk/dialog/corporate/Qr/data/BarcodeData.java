package lk.dialog.corporate.Qr.data;
// Generated Sep 3, 2012 11:08:46 AM by Hibernate Tools 3.2.1.GA

import java.io.Serializable;
import org.springframework.stereotype.Component;




/**
 * BarcodeData generated by hbm2java
 */
@Component
public class BarcodeData  implements Serializable {


     private String id;
     private Barcode barcode;
     private String attribute;
     private String value;

    public BarcodeData() {
    }

    public BarcodeData(String id, Barcode barcode, String attribute, String value) {
       this.id = id;
       this.barcode = barcode;
       this.attribute = attribute;
       this.value = value;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public Barcode getBarcode() {
        return this.barcode;
    }
    
    public void setBarcode(Barcode barcode) {
        this.barcode = barcode;
    }
    public String getAttribute() {
        return this.attribute;
    }
    
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }




}


