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


        Triangulo triangulo1 = new Triangulo("Triangulo", 34.67, 44.12);
        double areaTriangulo = triangulo1.getArea();
        triangulo1.setArea(areaTriangulo);
        double perimetroTriangulo = triangulo1.getPerimetro();
        triangulo1.setPerimetro(perimetroTriangulo);
        System.out.println("info de triangulo1: " + triangulo1.toString());
    }
}
