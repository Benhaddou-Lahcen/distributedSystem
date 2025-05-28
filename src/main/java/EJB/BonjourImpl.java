package EJB;

import jakarta.ejb.Stateful;

@Stateful
public class BonjourImpl implements BonjourInt{
    @Override
    public String Bonjour(String name){
        return "bonjour" + name ;
    }
}
