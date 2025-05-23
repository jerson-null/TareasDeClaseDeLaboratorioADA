package org.example;

//El algoritmo cumple lo que se le pide hasta el maximo de m=3 y n=7 con numero mayores como
// m>3 y n>7 falla o se vuelve lento
public class AckFun {
    public static int Ack(int m, int n) {

        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return Ack(m - 1, 1);
        } else {
            return Ack(m - 1, Ack(m, n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(Ack(3, 4));
    }
}
