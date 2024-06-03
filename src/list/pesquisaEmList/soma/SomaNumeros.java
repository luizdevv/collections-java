package list.pesquisaEmList.soma;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        for (Integer n : numeros)
            soma += n;

        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;

        for (Integer n : numeros)
            if (n > maiorNumero)
                maiorNumero = n;

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;

        for (Integer n : numeros)
            if (n < menorNumero)
                menorNumero = n;

        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros num = new SomaNumeros();

        num.adicionarNumero(2);
        num.adicionarNumero(3);
        num.adicionarNumero(43);
        num.adicionarNumero(65);
        num.adicionarNumero(111);

        System.out.println("Lista de números: " + num.exibirNumeros());
        System.out.println("Soma dos números: " + num.calcularSoma());

        System.out.println("Maior número: " + num.encontrarMaiorNumero());
        System.out.println("Menor número: " + num.encontrarMenorNumero());
    }
}
