package student_yan.lesson_4;

class TriangleAreaTest {

    public static void main(String[] args) {
        TriangleAreaTest test = new TriangleAreaTest();

    }

    public void test1() {
        TriangleArea triangleArea = new TriangleArea();

        double result = triangleArea.calculateArea(20, 10, 15);
        if (result == 10) {
            System.out.println("Test is OK");

        } else {
            System.out.println("Test Fail");
        }
    }



}
