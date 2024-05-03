import java.util.ArrayList;
import java.util.List;

public class GestorMateriales {
    private List<Materiales> materiales;

    public GestorMateriales() {
        this.materiales = new ArrayList<>();
        inicializarMateriales();
    }

    private void inicializarMateriales() {
        materiales.add(new Materiales("Piedra", 0));
        materiales.add(new Materiales("Madera", 0));
        materiales.add(new Materiales("Hierro", 0));
        materiales.add(new Materiales("Oro", 0));
        materiales.add(new Materiales("Diamante", 0));
    }

    public void agregarMaterial(Materiales material) {
        materiales.add(material);
    }

    public void eliminarMaterial(Materiales material) {
        materiales.remove(material);
    }

    public List<Materiales> getMateriales() {
        return materiales;
    }
}