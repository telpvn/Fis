public class MainApplication {
    public static void main(String[] args) {
        // Тип_данных имя_переменной = начальное_зачение;

        // Примитивные типы данных (8 шт)
        // Целочисленные (-2^(N-1) to 2^N-1)
        byte a = 5;          // 8-bit -128 to 127
        short b = 100;       // 16-bit -32k to 32k
        int c = 10;          // 32-bit -2M to 2M
        long d = 100L;       // 64-bit
        // Числа с плавающей запятой
        float e = 1.567f;    // 32-bit
        double f = 2.32234;  // 64-bit
        // Логиский тип данных
        boolean g = true;
        // Символьный тип данных
        char h = '*';
        System.out.println(a);

        // Ссылочное типы данных
        String str1 = "ACD98";

        System.out.println(str1);
        System.out.println(h);
    }
}
