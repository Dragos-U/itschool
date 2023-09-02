package org.session11.homework.problem3;

public class StudentB extends Marks{

    private int subjectAGrade;
    private int subjectBGrade;
    private int subjectCGrade;
    private int subjectDGrade;

    public StudentB(int subjectAGrade, int subjectBGrade, int subjectCGrade, int subjectDGrade) {
        this.subjectAGrade = subjectAGrade;
        this.subjectBGrade = subjectBGrade;
        this.subjectCGrade = subjectCGrade;
        this.subjectDGrade = subjectDGrade;
    }

    @Override
    double getPercentage() {
        return  (subjectAGrade+subjectBGrade+subjectCGrade+subjectDGrade)/3;
    }
}
