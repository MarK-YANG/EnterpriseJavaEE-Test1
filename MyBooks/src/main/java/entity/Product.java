package entity;

/**
 * Created by mark on 4/28/15.
 */
public class Product {
    private int PRODUCT_ID;
    private int MANUFACTURER_ID;
    private String PRODUCT_CODE;
    private double PURCHASE_COST;
    private int QUANTITY_ON_HAND;
    private double MARKUP;
    private String AVAILABLE;
    private String DESCRIPTION;

    public String getAVAILABLE() {
        return AVAILABLE;
    }

    public void setAVAILABLE(String AVAILABLE) {
        this.AVAILABLE = AVAILABLE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public int getMANUFACTURER_ID() {
        return MANUFACTURER_ID;
    }

    public void setMANUFACTURER_ID(int MANUFACTURER_ID) {
        this.MANUFACTURER_ID = MANUFACTURER_ID;
    }

    public double getMARKUP() {
        return MARKUP;
    }

    public void setMARKUP(double MARKUP) {
        this.MARKUP = MARKUP;
    }

    public String getPRODUCT_CODE() {
        return PRODUCT_CODE;
    }

    public void setPRODUCT_CODE(String PRODUCT_CODE) {
        this.PRODUCT_CODE = PRODUCT_CODE;
    }

    public int getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public double getPURCHASE_COST() {
        return PURCHASE_COST;
    }

    public void setPURCHASE_COST(double PURCHASE_COST) {
        this.PURCHASE_COST = PURCHASE_COST;
    }

    public int getQUANTITY_ON_HAND() {
        return QUANTITY_ON_HAND;
    }

    public void setQUANTITY_ON_HAND(int QUANTITY_ON_HAND) {
        this.QUANTITY_ON_HAND = QUANTITY_ON_HAND;
    }
}
