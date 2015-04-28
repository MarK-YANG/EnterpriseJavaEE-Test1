package entity;

/**
 * Created by mark on 4/28/15.
 */
public class ProductCode {
    private String PROD_CODE;
    private String DISCOUNT_CODE;
    private String DESCRIPTION;

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDISCOUNT_CODE() {
        return DISCOUNT_CODE;
    }

    public void setDISCOUNT_CODE(String DISCOUNT_CODE) {
        this.DISCOUNT_CODE = DISCOUNT_CODE;
    }

    public String getPROD_CODE() {
        return PROD_CODE;
    }

    public void setPROD_CODE(String PROD_CODE) {
        this.PROD_CODE = PROD_CODE;
    }
}
