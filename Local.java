public class Local extends Inmueble {
    
    protected void Imprimir(){
        super.Imprimir();
        System.out.println("IdentificadorInmobilario ="+identificadorInmobiliario);
        System.out.println("Area en metros cuadrados ="+areaMetrosCuadrados);
        System.out.println("DIreccion ="+direccion);
    }
}
