public class MyClass {

    public int productoria(int numeros[]) {
        int total = 1;
        int i;
        int longitud = numeros.length;

        for(i = 0; i < longitud; i++) {
            total *= numeros[i];
        }
        return total;
    }


    public int cantidadDePares(int numeros[]) {
        int pares = 0;
        int i;
        int longitud = numeros.length;
        for (i = 0; i < longitud; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public boolean capicua(String palabra) {
        boolean toReturn = true;
        int inicio;
        int longitud = palabra.length();
        int fin = longitud - 1;
        if(palabra.contains(" ")) {
            toReturn = false;
        }
        else {
            for(inicio = 0; inicio < (longitud)/2 && toReturn; inicio++) {
                toReturn = (palabra.charAt(inicio) == palabra.charAt(fin));
                fin--;
            }
        }
        return toReturn;
    }
}
