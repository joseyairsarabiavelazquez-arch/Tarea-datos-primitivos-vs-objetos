public class j22_Primitivo_vs_Objeto_Str {

    public static void main(String[] args) {

        // 1. TIPO PRIMITIVO (char)
        // Guardamos una sola letra
        char inicial = 'C';

        System.out.println("--- TIPO PRIMITIVO (char) ---");
        System.out.println("Inicial del carro: " + inicial);


        // 2. OBJETO (String)
        // Guardamos el nombre de un carro
        String carro = "Mi carro Chevrolet";

        System.out.println("\n--- OBJETO (String) ---");
        System.out.println("Nombre: " + carro);


        // 1. Contar los caracteres
        System.out.println("Cantidad de caracteres: " + carro.length());


        // 2. Convertir a mayúsculas
        System.out.println("En mayúsculas: " + carro.toUpperCase());


        // 3. Cambiar una palabra
        System.out.println("Cambiar Chevrolet por Nissan: "
                + carro.replace("Chevrolet", "Nissan"));


        // 4. Buscar una palabra
        System.out.println("¿Contiene Chevrolet?: "
                + carro.contains("Chevrolet"));


        // 5. Convertir a minúsculas
        System.out.println("En minúsculas: " + carro.toLowerCase());

    }
}