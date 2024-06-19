import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int resultado = numeros.stream()
                                .reduce(0, Integer::sum);

        System.out.println(resultado);
    }
}