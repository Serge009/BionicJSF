import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by oper4 on 21.10.2014.
 */

@ManagedBean(name = "loginBean", eager = true)
public class LoginBean {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
