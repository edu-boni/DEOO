package view;
import model.Matriz;

public class Main {
    public static void main(String[] args) {
        Matriz matriz2x2 = new Matriz(2);
        matriz2x2.setElemento(0, 0, 4.0);
        matriz2x2.setElemento(0, 1, 3.0);
        matriz2x2.setElemento(1, 0, 2.0);
        matriz2x2.setElemento(1, 1, 1.0);

        System.out.println("Matriz 2x2 inicial:");
        System.out.println(matriz2x2);

        matriz2x2.adicionar(1);
        matriz2x2.subtrair(0.5);
        matriz2x2.multiplicar(2);
        matriz2x2.dividir(3);

        System.out.println("Matriz 2x2 após operações:");
        System.out.println(matriz2x2);

        System.out.println("Elemento [0][1]: " + matriz2x2.getElemento(0, 1));
        matriz2x2.setElemento(0, 1, 10.0);
        System.out.println("Após alteração, elemento [0][1]: " + matriz2x2.getElemento(0, 1));

        System.out.println("Determinante: " + matriz2x2.determinante());
        System.out.println("Maior Valor: " + matriz2x2.maiorValor());
        System.out.println("Menor Valor: " + matriz2x2.menorValor());

        Matriz matriz3x3 = new Matriz(3);
        matriz3x3.setElemento(0, 0, 1.0);
        matriz3x3.setElemento(0, 1, 2.0);
        matriz3x3.setElemento(0, 2, 3.0);
        matriz3x3.setElemento(1, 0, 4.0);
        matriz3x3.setElemento(1, 1, 5.0);
        matriz3x3.setElemento(1, 2, 6.0);
        matriz3x3.setElemento(2, 0, 7.0);
        matriz3x3.setElemento(2, 1, 8.0);
        matriz3x3.setElemento(2, 2, 9.0);

        System.out.println("\nMatriz 3x3 inicial:");
        System.out.println(matriz3x3);

        matriz3x3.adicionar(1);
        matriz3x3.subtrair(0.5);
        matriz3x3.multiplicar(2);
        matriz3x3.dividir(2);

        System.out.println("Matriz 3x3 após operações:");
        System.out.println(matriz3x3);

        System.out.println("Elemento [1][1]: " + matriz3x3.getElemento(1, 1));
        matriz3x3.setElemento(1, 1, 20.0);
        System.out.println("Após alteração, elemento [1][1]: " + matriz3x3.getElemento(1, 1));

        System.out.println("Determinante: " + matriz3x3.determinante());
        System.out.println("Maior Valor: " + matriz3x3.maiorValor());
        System.out.println("Menor Valor: " + matriz3x3.menorValor());
    }
}
