import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "userData1", eager = true)
@SessionScoped
public class UserData1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String[] data = {"1", "2", "3"};

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
