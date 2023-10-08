public class CasaConjuntoCerrado extends CasaUrbana {

    private double area;
    private double valorAdministracion;
    private double tienePiscina;

    public CasaConjuntoCerrado(double area, double valorAdministracion, double tienePiscina) {
        this.area = area;
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public double getTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(double tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public double calcularPrecioVenta() {
        return 2500000 + valorAdministracion;
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Area = " + area);
        System.out.println("Valor Administracion = " + valorAdministracion);
        System.out.println("¿Tiene Piscina? = " + tienePiscina);
    }
}

