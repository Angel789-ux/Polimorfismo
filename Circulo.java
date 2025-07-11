public class Circulo extends FiguraGeometrica{
    private double radio;
    private final double PI = 3.1416; // constante
    
    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    // se genera un getter para consultar el valor de PI
    public double getPI() {
        return PI;
    }
    // este metodo sobre escribe al heredado de FiguraGeometrica
    // conserva la misma firma, pero su comportamiento es diferente
    @Override
    public double getArea(){
        double area = this.PI * this.radio * this.radio;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo [radio=" + radio + "]";
    }

    
}
