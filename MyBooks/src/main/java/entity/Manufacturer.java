package entity;

/**
 * Created by mark on 4/28/15.
 */
public class Manufacturer {

    private int MANUFACTURER_ID;
    private String NAME;
    private String ADDRESSLINE1;
    private String ADDRESSLINE2;
    private String CITY;
    private String STATE;
    private String ZIP;
    private String PHONE;
    private String FAX;
    private String EMAIL;
    private String REP;

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getADDRESSLINE1() {
        return ADDRESSLINE1;
    }

    public void setADDRESSLINE1(String ADDRESSLINE1) {
        this.ADDRESSLINE1 = ADDRESSLINE1;
    }

    public String getADDRESSLINE2() {
        return ADDRESSLINE2;
    }

    public void setADDRESSLINE2(String ADDRESSLINE2) {
        this.ADDRESSLINE2 = ADDRESSLINE2;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getFAX() {
        return FAX;
    }

    public void setFAX(String FAX) {
        this.FAX = FAX;
    }

    public int getMANUFACTURER_ID() {
        return MANUFACTURER_ID;
    }

    public void setMANUFACTURER_ID(int MANUFACTURER_ID) {
        this.MANUFACTURER_ID = MANUFACTURER_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getREP() {
        return REP;
    }

    public void setREP(String REP) {
        this.REP = REP;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }
}
