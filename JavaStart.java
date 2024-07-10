public class JavaStart {
        public static void main(String[] args) {
        //byte(8 bits), short(16 bits), int(32 bits), long(64 bits)
        //boolean eBrasileiro = true
        //char letra = "A"
        //double(numero de ponto flutuante preciso) double = 2,1234567 
        //float(número de ponto flutuante menos preciso) float = 2,12f
        var name = "Cristiam"; // variável local
        String lastname = "Vasques";
        int age;
        age = 47;
        int number = 1977;

        // Condicionais
        int origem = 1977;
        int atual = 2024;

        if (origem < atual) {
            System.out.println("47 anos");
        } else if (origem == atual) {
            System.out.println("nasceu");
        } else {
            System.out.println("errado");
        }

    }
}
