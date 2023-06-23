public class Main {
    public static void main(String[] args) {
        ObjetosCoresDictionario dicionario = new ObjetosCoresDictionario();

        // Adicionar objetos e cores ao dicionário
        dicionario.adicionarObjetoCor("bola", "azul");
        dicionario.adicionarObjetoCor("boneca", "amarela");
        dicionario.adicionarObjetoCor("dado", "rosa");

        // Imprimir todas as chaves com seus valores associados
        dicionario.imprimirObjetosCores();
    }
}