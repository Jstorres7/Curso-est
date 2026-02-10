package Semana2;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        //forma 1 --> Definiendio directamente los valores del arreglo
        int[]a={4,8,9,6,1,2,10};
        // iterar los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
           System.out.println("a[" + i + "]"+a [i] ); 
        }

        // suma los numero pares impares del arreglo y mostrar el resultado
        int sumaPares = 0;  int sumaImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a [i]%2==0) {
                sumaPares + = a[i];
            } else {
                sumaImpares+=a[i];
            }
        }
        System.out.println("suma Pares = " + sumaPares+ "suma impares" + sumaImpares );
    }
}
