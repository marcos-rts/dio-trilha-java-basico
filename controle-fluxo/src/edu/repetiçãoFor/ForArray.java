package edu.repetiçãoFor;

public class ForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //Forma nominal
        for (int x=0; x<alunos.length; x++){
            System.out.println("O Aluno no indice x=" + x + " é " + alunos[x]);
        }

        // Forma abreviada
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + alunos);
        }
    }
}
