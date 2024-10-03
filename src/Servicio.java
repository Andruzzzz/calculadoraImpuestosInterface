public class Servicio implements Tributable {

    private String descripcion;
    private double valor;
    private double cuotaJubilacion;

    //GETTER
    public double getValor() {
        return valor;
    }

    public double getCuotaJubilacion() {
        return cuotaJubilacion;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCuotaJubilacion(double cuotaJubilacion) {
        this.cuotaJubilacion = cuotaJubilacion;
    }




    @Override
    public double getValorImpuesto() {
        return (this.valor * this.cuotaJubilacion) / 100;
    }
}
