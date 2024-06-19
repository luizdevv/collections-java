package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao))
                tarefaSet.remove(t);
                break;
        }
    }

    public Set<Tarefa> exibirTarefas() { return tarefaSet; }

    public int contarTarefas() { return tarefaSet.size(); }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = null;

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluido() == true)
                    tarefasConcluidas.add(t);
            }
        } else {
            throw new RuntimeException("A lista está vazia.");
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = null;

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluido() == false)
                    tarefasPendentes.add(t);
            }
        } else {
            throw new RuntimeException("A lista está vazia.");
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao))
                    t.setConcluido(true);
                    break;
            }
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao))
                    t.setConcluido(false);
                    break;
            }
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void limparListaTarefas() {
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("tarefa 1");
        tarefas.adicionarTarefa("tarefa 2");
        tarefas.adicionarTarefa("tarefa 3");
        tarefas.adicionarTarefa("tarefa 4");
        tarefas.adicionarTarefa("tarefa 5");
        tarefas.adicionarTarefa("tarefa 6");
        tarefas.adicionarTarefa("tarefa 7");
        tarefas.adicionarTarefa("tarefa 8");

        System.out.println(tarefas.contarTarefas());
        tarefas.limparListaTarefas();
        System.out.println(tarefas.contarTarefas());
    }
}
