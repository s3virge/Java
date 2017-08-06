package homework.oop.week2.biker;

/**
 //  when the motorcycle repaired
 //  detail
 //  cost of repairs
 */
public class Repairs {
    public String sRepaireDate;
    public String sDetail;
    public int iDetailPrice;

    public Repairs(String sRepaireDate, String sDetail, int iDetailPrice) {
        this.sRepaireDate = sRepaireDate;
        this.sDetail = sDetail;
        this.iDetailPrice = iDetailPrice;
    }

    public String getRepaireDate() {
        return sRepaireDate;
    }

    public String getDetail() {
        return sDetail;
    }

    public int getDetailPrice() {
        return iDetailPrice;
    }
}
