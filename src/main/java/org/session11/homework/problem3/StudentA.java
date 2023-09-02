package org.session11.homework.problem3;

public class StudentA extends Marks{

    private int subjectAGrade;
    private int subjectBGrade;
    private int subjectCGrade;

    public StudentA(int subjectAGrade, int subjectBGrade, int subjectCGrade) {
        this.subjectAGrade = subjectAGrade;
        this.subjectBGrade = subjectBGrade;
        this.subjectCGrade = subjectCGrade;
    }

    @Override
    double getPercentage() {
        return (subjectAGrade+subjectBGrade+subjectCGrade)/3;
    }
}
