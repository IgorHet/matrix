public class matrix {
    public static void main(String[] args) {
        int size = 8; // Розмір матриці

        // Виведення матриці
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = (i % 2 == 0) ? (j + 1) : (size - j);
                System.out.print(value);
                if (j < size - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}