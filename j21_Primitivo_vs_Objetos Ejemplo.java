public class j21_Primitivo_vs_Objetos {

    public static void main(String[] args) {

        // ==========================================
        // 1. TIPO PRIMITIVO (double) - Solo el valor
        // ==========================================
        double temperaturaPrimitiva = 28.5;

        System.out.println("--- Tipo de dato primitivo ---");
        System.out.println("Temperatura: " + temperaturaPrimitiva);

        // El tipo primitivo guarda directamente el valor.


        // ==========================================
        // 2. OBJETO / WRAPPER (Double)
        // ==========================================
        Double temperaturaObjeto = 28.5;

        System.out.println("\n--- OBJETO (Double) ---");
        System.out.println("Temperatura: " + temperaturaObjeto);

        // Herramienta 1: Convertir el número a texto
        String texto = temperaturaObjeto.toString();
        System.out.println("Temperatura en texto: " + texto);

        // Herramienta 2: Contar los caracteres del texto
        System.out.println("Cantidad de caracteres: "
                + texto.length());

        // Herramienta 3: Comparar con otra temperatura
        int comparacion = temperaturaObjeto.compareTo(30.0);
        System.out.println("¿Es menor que 30 grados?: "
                + (comparacion < 0));

        // Herramienta 4: Consultar el valor máximo
        System.out.println("Valor máximo de Double: "
                + Double.MAX_VALUE);
    }
}