public class Classes {
    // Aqui são declarados os atributos da classe.
    String nome;
    static String nome2;

    // Este é o método principal da classe.
    public static void main(String[] args) {
        System.out.println(nome2);

        // Instanciando um novo objeto "minhaClasse" da classe "Classes".
        Classes minhaClasse = new Classes();
        minhaClasse.declaraNome();  // Usando o método declaraNome da classe.
        System.out.println(minhaClasse.getNome());
    }

    // Este é um método void.
    void declaraNome() {
        nome = "David";
    }

    // Este é um método String.
    String getNome() {
        return nome;
    }
}
