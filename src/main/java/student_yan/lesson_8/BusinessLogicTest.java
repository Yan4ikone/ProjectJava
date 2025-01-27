package student_yan.lesson_8;

import java.util.ArrayList;
import java.util.List;

class BusinessLogicTest {

    public static void main(String[] args) {
        BusinessLogicTest test = new BusinessLogicTest();
        test.findBestMark();

    }

    public void findBestMark() {
        BusinessLogic bl = new BusinessLogic();
        bl.addMark("Eng", 6);
        bl.addMark("Eng", 6);
        bl.addMark("Math", 10);
        int bestMark = bl.findBestMark("Eng");
        if (bestMark == 7) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }
    }

}
