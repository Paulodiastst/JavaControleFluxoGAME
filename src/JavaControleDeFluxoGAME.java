import java.io.IOException;

public class JavaControleDeFluxoGAME {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite uma das letras da palavra Aplicativos: ---> ");

        int codigoASCII = System.in.read();

        // alternativa para o IF (codição) { } ELSE { }
        switch ((char) codigoASCII) {
            //bloco de código
            case 'A':
                System.out.println("Opa! Parabéns");
            case 'p':
            case 'l':
            case 'i':
            case 'c':
            case 'a':
            case 't':
            case 'v':
            case 'o':
            case 's':
            case 'P':
            case 'L':
            case 'I':
            case 'C':
            case 'T':
            case 'V':
            case 'O':
            case 'S':
                System.out.println("\n\nCódigo da Tecla: "+codigoASCII);
                System.out.println("Código digitado: "+(char) codigoASCII);
                break;
            default:
                System.out.println("\n\nLetra digitada não pertence a palavra Aplicativos");

        }
    }
}
