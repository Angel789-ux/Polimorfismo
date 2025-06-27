public class TestingPolimorfismo {
    
    public static void main(String[] args) {
        FiguraGeometrica unaFiguraGeometrica = new FiguraGeometrica("Rombo");
        System.out.println();
        unaFiguraGeometrica.setArea(12.45);
        // el ejemplo de polimorfismo estatico:
        // el programador indica cual usar segun los parametros que envie
        System.out.println(unaFiguraGeometrica.toString());
        System.out.println("Area de la figura: "+ unaFiguraGeometrica.toString(true));

        Circulo circulo1 = new Circulo("Circulo",10.5);
        // ejemplo de polimorfismo dinamico
        // java dectecta que objeto es para llamar al metodo apropiado
        double a = circulo1.getArea();
        circulo1.setArea(a);
        System.out.println("info de circulo1: " + circulo1.toString());

        Triangulo triangulo1 = new Triangulo("triangulo",34.67,44.12);
        double = triangulo1.getArea(a);
        triangulo1.setArea(b);
        double = triangulo1.getPerimetro(b);
        triangulo1.setPerimetro(a);
        System.out.println("info de trinagulo1: " + triangulo1.toString());
    }
}
