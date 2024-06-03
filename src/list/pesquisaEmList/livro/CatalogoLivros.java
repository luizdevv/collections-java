package list.pesquisaEmList.livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        for (Livro l : livroList)
            if (l.getAutor().equalsIgnoreCase(autor))
                livroPorAutor.add(l);


        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorAno = new ArrayList<>();
        for (Livro l : livroList)
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                livroPorAno.add(l);


        return livroPorAno;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> livroPorTitulo = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo))
                livroPorTitulo.add(l);
                break;
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));


    }
}
