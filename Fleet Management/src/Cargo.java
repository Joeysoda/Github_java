/**
 * Description:
 * Date: 2024-10-17
 * Time: 21:41
 */
public abstract class  Cargo implements Trackable{

    private Integer Rfid;

    public Integer getRfid() {
        return Rfid;
    }

    public void setRfid(Integer rfid) {
        this.Rfid = rfid;
    }

    public abstract void load();
    public abstract void unload();

}
