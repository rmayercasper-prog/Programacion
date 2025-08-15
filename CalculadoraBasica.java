public class CalculadoraBasica {
    public static void main(String[] args) throws java.io.IOException {
        String num1Texto = "";
        String num2Texto = "";
        double num1, num2, resultado = 0;
        char operador;
        int caracter;

        // Leer primer número
        System.out.print("Ingrese el primer número: ");
        while ((caracter = System.in.read()) != '\n') {
            if (caracter != '\r') {
                num1Texto += (char) caracter;
            }
        }
        num1 = Double.parseDouble(num1Texto.trim());

        // Leer operador
        System.out.print("Ingrese el operador (+, -, *, /): ");
        operador = (char) System.in.read();

        // Limpiar buffer (muy importante para que funcione el segundo número)
        while (System.in.available() > 0) {
            System.in.read();
        }

        // Leer segundo número
        System.out.print("Ingrese el segundo número: ");
        while ((caracter = System.in.read()) != '\n') {
            if (caracter != '\r') {
                num2Texto += (char) caracter;
            }
        }
        num2 = Double.parseDouble(num2Texto.trim());

        // Operaciones
        if (operador == '+') {
            resultado = num1 + num2;
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '*') {
            resultado = num1 * num2;
        } else if (operador == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                return;
            }
        } else {
            System.out.println("Operador no válido.");
            return;
        }

        // Mostrar resultado
        System.out.println("El resultado es: " + resultado);
    }
}

