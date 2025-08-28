public class Medicamentos extends ItemsFactura {
    private int cantidad;
    public Medicamentos(String n, double s, int c){
        super(n,s);
        this.cantidad=c;
    }
    @Override
    public double calcularSubtotal(){

        return this.cantidad* this.precio;
    }

    public void mostrarDetalle(){
        System.out.println("El precio del medicamento "+this.nombre+" es "+this.precio +" su subtotal siendo "+this.calcularSubtotal());
    }

}
