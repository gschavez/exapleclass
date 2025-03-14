package exampleMethod;

public class Producto {

private String nombreP;
private double precioP;
private boolean descuento;
private double dcto = 15;

public Producto(){
}
public Producto(String nombreP, double precioP){
    this.nombreP= nombreP;
    this.precioP= precioP;
}
public String getDatosGenerales(){
    return "El producto es " + nombreP +
            (descuento ? ", tiene un descuento del " + dcto + "%" : ", no tiene descuento") +
            ", el precio final es " + getPrecioP();
}
    public void setDescuento(String Descuento) {
        if (Descuento.equalsIgnoreCase("si"))
            descuento = true;
    }
    public boolean isDescuento() {
        return descuento;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getPrecioP() {
        if (descuento) {
            double precioFinal =  precioP - (precioP/100*dcto);
            return precioFinal;
        }
        return precioP;
    }
    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa",50000);
        producto1.setDescuento("si");
        System.out.println(producto1.getDatosGenerales());
        Producto producto2 = new Producto("pantalon",90000);
        producto2.setDescuento("no");
        System.out.println(producto2.getDatosGenerales());
        Producto producto3 = new Producto("zapatos",150000);
        producto3.setDescuento("si");
        System.out.println(producto3.getDatosGenerales());
        Producto producto4 = new Producto("gorra",80000);
        producto4.setDescuento("si");
        System.out.println(producto4.getDatosGenerales());
    }
}


