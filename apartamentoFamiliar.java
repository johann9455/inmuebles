public class apartamentoFamiliar extends Apartamento {
    private double valorArea;
    private int valorAdministracion;

    

    public apartamentoFamiliar(int numeroHabitaciones, int numeroBanos, double valorArea, int valorAdministracion) {
        super(numeroHabitaciones, numeroBanos);
        this.valorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
    }
    



    public double getValorArea() {
        return valorArea;
    }




    public void setValorArea(double valorArea) {
        this.valorArea = valorArea;
    }




    public int getValorAdministracion() {
        return valorAdministracion;
    }




    public void setValorAdministracion(int valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public int calcularPrecioVenta() {
        return 2000000*valorArea;
    }



    protected void imprimirBaños(){
        super.imprimirBaños();
        System.out.println(" Numero de Habitaciones = " +numeroHabitaciones);
        System.out.println("Numero Baños = " +numeroBanos);
        
        }

        protected void imprimirAptfamiliar(){
            System.out.println("Valor Area"+valorArea);
            System.out.println("Ingrese el valor de la administracion"+valorAdministracion);
        }

}
