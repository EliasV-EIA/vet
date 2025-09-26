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

    public double calcularTotal(){
        double total = this.costoBase;
        for (ItemsFactura item : items){
            total += item.calcularSubtotal();
        }
        return total;
    }
    public void mostrarDetalleFactura() {
        String medicamentos = "";
        String servicios = "";

        double subtotalMedicamentos = 0;
        double subtotalServicios = 0;

        for (ItemsFactura item : items) {
            if (item instanceof Medicamentos) {
                medicamentos += "- " + item.mostrarDetalle() + "\n";
                subtotalMedicamentos += item.calcularSubtotal();
            } else if (item instanceof Servicios) {
                servicios += "- " + item.mostrarDetalle() + "\n";
                subtotalServicios += item.calcularSubtotal();
            }
        }

    }
