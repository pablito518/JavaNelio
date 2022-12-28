package exercicio3.entities;

import java.text.MessageFormat;

public class Student {
    public String nome;
    public double primeiroTrimestre;
    public double segundoTrimestre;
    public double terceiroTrimestre;

    public String checkResults(){
        double finalGrade = primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
        String result;
        if(finalGrade >= 60){
           result = finalGrade + "\nPASS";
        }
        else{
            result = "FAILED\nMISSING " + (60 - finalGrade) + " POINTS";
        }
        return result;
    }

    @Override
    public String toString(){
      return MessageFormat.format("FINAL GRADE = {0}", checkResults());
    }
}
