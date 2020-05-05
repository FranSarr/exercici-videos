import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuari {

    protected String name;
    protected String surname;
    protected String contra;
    protected java.util.Date regi_date=new java.util.Date();
    protected List<Video> llista_v = new ArrayList<Video>();

    public Usuari(String name, String surname, String password, java.util.Date regi_date) {
        this.name = name;
        this.surname = surname;
        this.contra = contra;
        this.regi_date = regi_date;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getRegi_date() {
        return regi_date;
    }

    public void setLlista_v(List<Video> llista_v) {
        this.llista_v = llista_v;
    }

    public List<Video> getLlista_v() {
        return llista_v;
    }
}
