public class InvertirTexto {
    public static void main(String[] args) {
        String texto = System.console().readLine("Ingrese una palabra o frase: ");

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);
    }
}


