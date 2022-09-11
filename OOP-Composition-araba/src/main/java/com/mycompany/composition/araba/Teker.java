
package com.mycompany.composition.araba;

public class Teker {
    
    private String marka;
    private String jant;
    private int jantboyu;
 
    
    public Teker(String marka,String jant,int jantboyu){
        
        this.marka = marka;
        this.jant = jant;
        this.jantboyu = jantboyu;    
    }

    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @return the jant
     */
    public String getJant() {
        return jant;
    }

    /**
     * @param jant the jant to set
     */
    public void setJant(String jant) {
        this.jant = jant;
    }

    /**
     * @return the jantboyu
     */
    public int getJantboyu() {
        return jantboyu;
    }

    /**
     * @param jantboyu the jantboyu to set
     */
    public void setJantboyu(int jantboyu) {
        this.jantboyu = jantboyu;
    }
    
    
    
    
}
