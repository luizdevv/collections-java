package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicasSet=" + palavrasUnicasSet +
                '}';
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            palavrasUnicasSet.remove(palavra);
        } else  {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void verificarPalavra(String palavra) {
        boolean isTrue = false;
        if (!palavrasUnicasSet.isEmpty()) {
            for (String p : palavrasUnicasSet) {
                if (p.equalsIgnoreCase(palavra)) {
                    isTrue = true;
                }
            }
        }

        String res = isTrue == false ? "Nenhuma palavra encontrada." : "A palavra está presente no conjunto";
        System.out.println(res);
    }

    public void  exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.verificarPalavra("GoLang");
    }
}
