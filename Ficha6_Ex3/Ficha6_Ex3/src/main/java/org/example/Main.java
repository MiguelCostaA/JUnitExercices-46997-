package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Metodo para calcular area
    public int area(int base, int height) {
        return base * height;
    }
    // Metodo para calcular a altura
    public int perimeter(int base, int height) {
        return 2 * (base + height);
    }
    // Metodo para vericar se 1 lado é sempre mais pequeno que a soma dos outros 2 (Verificar se é um triangulo)
    public int isTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
