import java.util.List;

/**
 * Description:
 * Date: 2024-10-17
 * Time: 21:47
 */
public abstract class Carries implements Trackable{
    private Integer Id;

    protected List<Cargo> cargoList;

    public Carries(Integer id) {
        Id = id;
        this.cargoList = cargoList;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }
}
