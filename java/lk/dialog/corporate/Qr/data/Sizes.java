package lk.dialog.corporate.Qr.data;
// Generated Sep 3, 2012 11:08:46 AM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * Sizes generated by hbm2java
 */
@Component
public class Sizes  implements Serializable {


     private String sizeId;
     private int width;
     private int length;
     private Set<Barcode> barcodes = new HashSet<Barcode>(0);
     private Set<UserSize> userSizes = new HashSet<UserSize>(0);

    public Sizes() {
    }

	
    public Sizes(String sizeId, int width, int length) {
        this.sizeId = sizeId;
        this.width = width;
        this.length = length;
    }
    public Sizes(String sizeId, int width, int length, Set<Barcode> barcodes, Set<UserSize> userSizes) {
       this.sizeId = sizeId;
       this.width = width;
       this.length = length;
       this.barcodes = barcodes;
       this.userSizes = userSizes;
    }
   
    public String getSizeId() {
        return this.sizeId;
    }
    
    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }
    public int getWidth() {
        return this.width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return this.length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    public Set<Barcode> getBarcodes() {
        return this.barcodes;
    }
    
    public void setBarcodes(Set<Barcode> barcodes) {
        this.barcodes = barcodes;
    }
    public Set<UserSize> getUserSizes() {
        return this.userSizes;
    }
    
    public void setUserSizes(Set<UserSize> userSizes) {
        this.userSizes = userSizes;
    }




}


