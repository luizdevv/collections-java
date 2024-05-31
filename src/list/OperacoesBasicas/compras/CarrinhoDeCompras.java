package list.OperacoesBasicas.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //Funções
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getNome() == nome)
                itensParaRemover.add(item);
        }

        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double res = 0;

        for (Item item : itemList) {
            res += (item.getPreco() * item.getQuantidade());
        }

        return res;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Abobra", 12.0, 2);
        carrinho.adicionarItem("Abobra", 12.0, 2);
        carrinho.adicionarItem("Abobra", 12.0, 2);
        carrinho.adicionarItem("Feijão", 7.90, 1);
        carrinho.adicionarItem("Arroz Camil", 11.0, 2);
        carrinho.adicionarItem("Monster Mangoloco", 12.0, 3);

        System.out.println("O valor total do carrinho é R$: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Abobra");

        System.out.println("O valor total do carrinho é R$: " + carrinho.calcularValorTotal());
    }
}
