package org.example;

public class Mark {
    private int numStudent;
    private double mark;

    // Construtor da classe Mark
    public Mark(int numStudent, double mark){
        this.numStudent = numStudent;
        this.mark = mark;
    }

    // Metodos getters para o numero de estudante e a nota
    public int getNumStudent(){
        return numStudent;
    }
    public double getMark() {
        return mark;
    }
}
