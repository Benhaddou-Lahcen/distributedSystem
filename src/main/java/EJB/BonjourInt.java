package EJB;
import jakarta.ejb.Local;

@Local
public interface BonjourInt {
    public String Bonjour(String name);
}
