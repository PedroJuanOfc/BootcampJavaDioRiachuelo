public class PrimitiveTypes {
    public static void main(String[] args) {
        // Tipos inteiros
        byte Byte = 127;                   // 1 byte, de -128 a 127
        short Short = 32000;               // 2 bytes, de -32.768 a 32.767
        int Int = 2147483647;              // 4 bytes, de -2.147.483.648 a 2.147.483.647
        long Long = 9223372036854775807L;  // 8 bytes, precisa do "L" no final

        // Tipos de ponto flutuante
        float Float = 3.14f;               // 4 bytes, precisa do "f" no final
        double Double = 3.141592653589793; // 8 bytes, mais preciso

        // Tipo caractere
        char Char = 'A';                   // 2 bytes, armazena um único caractere Unicode

        // Tipo lógico
        boolean Boolean = true;            // 1 bit, valores possíveis: true ou false
    }
}