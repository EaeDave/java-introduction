//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;  // Foi importado essa classe para poder converter Array para String.
import java.util.ArrayList;  // Foi importado essa classe para criar um Array dinâmico.

// Classe principal.
public class SintaxeBasica {
    // Método principal da classe.
    public static void main(String[] args) {
        // Declaração de variáveis.
        // 1.º Forma.
        // tipo nome = valor;
        int idade = 22;  // É possível declarar a variável dessa forma.
        int salario;  // Também é possível declarar a variável sem valor atribuído.

        // 2.° Forma.
        // var nome = valor;
        var sobrenome = "Rodrigues";  // Dessa forma, o tipo da variável é declarado conforme o valor dela.
        // var idade; - Não é possível declarar a variável sem atribuir um valor.
// ---------------------------------------------------------------------------------------------------------------------
        // Tipos primitivos - Valores Inteiros.
        // byte = Possui 8 bits com um range de -128 à 127;
        // short = Possui 16 bits com um range de -32.768 à 32.767;
        // int = Possui 32 bits com um range de -2.147.483.648 à 2.147.483.647;
        // long = Possui 64 bits com um range de -9.223.372.036.854.775.808 à 9.223.372.036.854.775.807.

        // É quase impossível ter mais do que 10 filhos hoje em dia.
        // Atribuir essa variável como byte, usará apenas 8 bits de memória para armazenar esse valor na RAM.
        byte qtd_Filhos = 2;
// ---------------------------------------------------------------------------------------------------------------------
        // Tipos primitivos - Valores reais.
        float mediaBimestral = 9.5F;  // Ocupa 32 bits e representa números ponto flutuante com menos precisão.
        double decimoTerceiro = 1891.35;  // Ocupa 64 bits e representa números ponto flutuante de precisão.
// ---------------------------------------------------------------------------------------------------------------------
        // Tipos primitivos - Boolean.
        boolean eBrasileiro = true;  // Retorna um valor lógico "verdadeiro".
        boolean eMulher = false;  // Retorna um valor lógico "falso".
//----------------------------------------------------------------------------------------------------------------------
        // Tipos primitivos - Char.
        char letra = 'D'; // Consome 16 bits e pode representar uma ampla gama de caracteres Unicode, incluindo ASCII.
// ---------------------------------------------------------------------------------------------------------------------
        // Classe - String (Cadeia de caracteres)
        // É uma classe e não um tipo primitivo, é formado por um array de caracteres do tipo char (16bits).
        // O cálculo de espaço em memória varia conforme o tamanho do array e especificação.
        String nome = "David";  // Tem aproximadamente 10 bytes (16 bits * 5 caracteres declarados = 80 bits ou 10 bytes)
// ---------------------------------------------------------------------------------------------------------------------
        // Condicionais (if & else & else if).
        short anoAtual = 2024;
        if (anoAtual == 1991) {
            System.out.println("O Java foi criado esse ano!");
        } else if (anoAtual > 1991) {
            System.out.println("O Java existe!");
        } else {
            System.out.println("O Java não existe!");
        }
// ---------------------------------------------------------------------------------------------------------------------
        // Array - Declaração.
        // tipo[] nome;
        int[] idades = {7, 14, 21};  // Foi inicializado o array "idades" contendo os valores, [7, 14, 21].
        System.out.println(Arrays.toString(idades));  // Foi necessário converter o array para string.

        String[] nomes = new String[2];  // Foi inicializado o array "nomes" sem especificar valores, somente a qtd.
        nomes[0] = "David";  // Foi declarado o valor "David" para o índice 0 de "nomes[]".
        nomes[1] = "Matheus";  // Foi declarado o valor "Matheus" para o índice 1 de "nomes[]".
        System.out.printf("%s %s\n", nomes[0], nomes[1]);

        // Porém, dessa forma fica limitado, pois não é possível declarar um array dinâmico.
// ---------------------------------------------------------------------------------------------------------------------
        // Classe ArrayList - Array dinâmico.
        ArrayList<String> linguagensProgramacao = new ArrayList<String>();  // Foi declarado o ArrayList.
        linguagensProgramacao.add("Java");  // Foi acrescentado o valor "Java" utilizando o método add().
        linguagensProgramacao.add("Python");  // Foi acrescentado o valor "Python" utilizando o método add().
        System.out.println(linguagensProgramacao.getFirst());
        System.out.println(linguagensProgramacao.get(1));
// ---------------------------------------------------------------------------------------------------------------------
        // Loop - for.
        int numero = 10;
        for(var i = 0; i < numero; i++){
            System.out.println(i);
        }
// ---------------------------------------------------------------------------------------------------------------------
        // Loop - while.
        int x = 0;
        while(x < 10){
            System.out.println(x);
            x++;
        }
// ---------------------------------------------------------------------------------------------------------------------
        // Casting - Conversão de Tipos.
        int idade1 = 22;  // idade1 = 22.
        double idade2 = idade1;  // idade2 = 22.0.
        idade1 = (int) idade2;  // Casting explícito, essa conversão concorda em perder partes dos dados para a conversão.

        char letra1 = 'D';  // Foi declarado a variável letra1 com o valor 'D'.
        String nome1 = String.valueOf(letra1);  // Foi convertido de tipo char para String.
        letra1 = nome1.charAt(0);  // Foi convertido String para char.

        int numeroInteiro = 2001;
        String numeroEmString = String.valueOf(numeroInteiro);  // numeroEmString = "2001"
        numeroInteiro = Integer.parseInt(numeroEmString);  // Foi convertido de String para int.
    }
}