public class CalculadoraDeImpuestos {

    private double totalImpuestos = 0;


    public void calcularImpuestos(Tributable item){
         this.totalImpuestos += item.getValorImpuesto();
    }

    public double getTotalImpuestos(){
        return this.totalImpuestos;
    }

    public static void main(String[] args) {

        Servicio servicio = new Servicio();
        servicio.setValor(2.0);
        servicio.setCuotaJubilacion(2.0);

        System.out.println(servicio.getValorImpuesto());

        Producto producto = new Producto();
        producto.setValor(3.4);

        System.out.println(producto.getValorImpuesto());


    }

}
