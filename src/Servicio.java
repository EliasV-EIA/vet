public abstract class Servicio extends ItemsFactura {
    public Servicio(String nombre, double costo){
        super(nombre,costo);
    }

    @Override
    public double calcularSubtotal() {
        return 0;
    }
}
