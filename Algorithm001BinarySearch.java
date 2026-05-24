public class Algorithm001BinarySearch {
    

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int intemProcurrado = 1;

        int resultado = binarySearch(numeros, intemProcurrado);
        if(resultado != -1) {
            System.out.println("Item na posição " + resultado + " com o valor " + numeros[resultado]);
        } else {
            System.out.println("Não foi encontrado o numero!");
        }

    }


    public static int binarySearch(int[] arrayInt, int item) {

        int inicio = 0;
        int fim = arrayInt.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int chute = arrayInt[meio];

            if(chute == item) {
                return meio;
            }

            if(chute > item) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }  

        return -1;

    }

}
