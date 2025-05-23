package model;

public class Matriz {
    private double[][] matriz;
    private int tamanho;

    public Matriz(int tamanho, double valorInicial) {
        this.tamanho = tamanho;
        matriz = new double[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = valorInicial;
            }
        }
    }

    public Matriz(int tamanho) {
        this(tamanho, 0.0);
    }

    public double getElemento(int linha, int coluna) {
        return matriz[linha][coluna];
    }

    public void setElemento(int linha, int coluna, double valor) {
        matriz[linha][coluna] = valor;
    }

    public void adicionar(double valor) {
        for (int i = 0; i < tamanho; i++)
            for (int j = 0; j < tamanho; j++)
                matriz[i][j] += valor;
    }

    public void subtrair(double valor) {
        for (int i = 0; i < tamanho; i++)
            for (int j = 0; j < tamanho; j++)
                matriz[i][j] -= valor;
    }

    public void multiplicar(double valor) {
        for (int i = 0; i < tamanho; i++)
            for (int j = 0; j < tamanho; j++)
                matriz[i][j] *= valor;
    }

    public void dividir(double valor) {
        if (valor == 0){
            System.out.println("Divisão impossível por zero\n");
            return;
        } 
        for (int i = 0; i < tamanho; i++)
            for (int j = 0; j < tamanho; j++)
                matriz[i][j] /= valor;
    }

    public double maiorValor() {
        double maior = matriz[0][0];
        for (int i = 0; i < tamanho; i++)
            for (int j = 0; j < tamanho; j++)
                if (matriz[i][j] > maior) maior = matriz[i][j];
        return maior;
    }

    public double menorValor() {
        double menor = matriz[0][0];
        for (int i = 0; i < tamanho; i++)
            for (int j = 0; j < tamanho; j++)
                if (matriz[i][j] < menor) menor = matriz[i][j];
        return menor;
    }

    public double determinante() {
        if (tamanho == 2) {
            return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        } else {
            return (matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[0][1] * matriz[1][2] * matriz[2][0]) + (matriz[0][2] * matriz[1][0] * matriz[2][1]) -
                   (matriz[0][2] * matriz[1][1] * matriz[2][0]) - (matriz[0][1] * matriz[1][0] * matriz[2][2]) - (matriz[0][0] * matriz[1][2] * matriz[2][1]);
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                string.append(String.format("%.2f\t", matriz[i][j]));
            }
            string.append("\n");
        }
        return string.toString();
    }
}