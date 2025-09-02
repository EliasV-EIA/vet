    public abstract class ItemsFactura {
        protected String nombre;
        protected double precio;

        public ItemsFactura(String n, double s) {
            this.nombre = n;
            this.precio = s;
        }
        public abstract double calcularSubtotal();
        public abstract void mostrarDetalle();
    }

