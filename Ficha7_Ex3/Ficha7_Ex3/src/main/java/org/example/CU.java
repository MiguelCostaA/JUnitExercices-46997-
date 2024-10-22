package org.example;

import java.util.ArrayList;

public class CU {
    private String nameCU;
    private ArrayList<Mark> marks;
    private int totalStudents;

    // Construtor da classe CU
    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>(totalStudents);
    }

    // Metodo para inserir a nota de um estudante na CU
    public boolean insertMarkCU(int numStudent, double mark) {
        if (marks.size() < totalStudents){
            marks.add(new Mark(numStudent, mark));
            return true;
        }
        return false;
    }

    // Metodo para procurar a nota de um estudante pelo seu numero
    public double searchStudent (int numStudent) {
        for (Mark m : marks) {
            if (m.getNumStudent() == numStudent) ;
            {
                return m.getMark();
            }
        }
        return -1;
    }

    // Metodo para calcular a media na CU
    public double averageCU (){
        if (marks.isEmpty()){
            return 0;
        }
        double totalMarks = 0;
        for (Mark m : marks){
            totalMarks += m.getMark();
        }
        return totalMarks / marks.size();
    }

    // Metodo para verificar se o aluno foi aprovado (nota >= 9.5)
    public boolean isApproved(int numStudent){
        double mark = searchStudent(numStudent);
        return mark >= 9.5;
    }
    public String getNameCU() {
        return nameCU;
    }
}
