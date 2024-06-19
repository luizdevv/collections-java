package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
   private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Luiz", 12);
        convidados.adicionarConvidado("Gustavo", 15);
        convidados.adicionarConvidado("Luiz", 123);
        convidados.adicionarConvidado("Pedro", 13);
        convidados.adicionarConvidado("Guilherme", 15);

        System.out.println(convidados.contarConvidados());

       // convidados.removerConvidadoPorCodigoConvite(123);

        convidados.exibirConvidados();
    }
}
