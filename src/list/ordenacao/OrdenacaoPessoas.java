package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, altura, idade));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenadoPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(ordenadoPorIdade);

        return ordenadoPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenadoPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(ordenadoPorAltura, new CompararPorAltura());

        return ordenadoPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
