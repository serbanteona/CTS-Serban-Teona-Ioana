package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobaza {
    List<AutobuzMemento> listaAutobuzeMemento;

    public ManagerAutobaza() {
        this.listaAutobuzeMemento = new ArrayList<>();
    }

    public ManagerAutobaza(List<AutobuzMemento> listaAutobuzeMemento) {
        this.listaAutobuzeMemento = listaAutobuzeMemento;
    }
    public void add(AutobuzMemento a){
        listaAutobuzeMemento.add(a);

    }
    public AutobuzMemento getMemento(int poz){
        listaAutobuzeMemento.get(poz);
        return (AutobuzMemento) listaAutobuzeMemento;
    }
}
