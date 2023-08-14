package ra;

import impl.Student;

import java.util.Scanner;

public interface IStudent {
    public static final int MARK_PASS =5;

    void inputData(Scanner scanner,Student[] students,int index);

    void displayData();
    void calAvgMark();
}
