package org.example;

public class Main {

    // Metodo para verificar se um numero é primo
    public boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i=2; i<= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    // Metodo para verificar se um numero é par
    public boolean isEven(int number){
        return number % 2 == 0;
    }

    // Metodo para verificar se um numero é multiplo de um divisor
    public boolean isMultiple(int number, int divisor){
        return number % divisor == 0;
    }
}