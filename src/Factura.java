import java.util.ArrayList;
import java.util.List;

public class Factura {
    private double costoBase;
    private List<ItemsFactura> items;

    public Factura(){
        this.costoBase=3000;
        this.items = new ArrayList<>();
    }

    public double getCostoBase() {
        return costoBase;
    }
    public void agregarItem(ItemsFactura item){
        this.items.add(item);
    }
}
