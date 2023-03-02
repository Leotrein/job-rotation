public class Challenge1 {

    /*
     * Ao final do processamento, qual será o valor da variável SOMA?
     */

    public static void main(String[] args) {

        int index = 13, soma = 0, k = 0;

        while (k < index) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);

        // soma = 91

    }

}