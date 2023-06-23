import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjetosCoresDictionario {
    private Map<String, List<String>> objetosCores;

    public ObjetosCoresDictionario() {
        objetosCores = new HashMap<>();
    }

    public void adicionarObjetoCor(String objeto, String cor) {
        if (objetosCores.containsKey(objeto)) {
            objetosCores.get(objeto).add(cor);
        } else {
            List<String> cores = new ArrayList<>();
            cores.add(cor);
            objetosCores.put(objeto, cores);
        }
    }

    public void imprimirObjetosCores() {
        for (String objeto : objetosCores.keySet()) {
            List<String> cores = objetosCores.get(objeto);
            System.out.println("Objeto: " + objeto);
            System.out.println("Cores: " + cores);
            System.out.println();
        }
    }
}