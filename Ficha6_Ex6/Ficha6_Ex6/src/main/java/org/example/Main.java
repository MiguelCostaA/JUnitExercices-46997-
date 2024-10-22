package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Metodo que calcula a media dos digitos de um numero inteiro
    public double averageDigit(int number) {
        int sum = 0;
        int count = 0;
        int num = Math.abs(number);

        // Loop para percorrer todos os digitos do numero
        while(num>0){
        int digit = num % 10;
        sum = sum + digit;
        count++;
        num /= 10;
        }

        if(count==0){
            return 0;
        }

        return (double) sum / count;
    }
}