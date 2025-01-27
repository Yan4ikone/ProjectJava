package student_yan.lesson_3;

class course {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        int p = 0;
        for (; i < 1000; i++)
            if ((i % 3 == 0) && (i % 5 != 0)) {
                sum = i;
                if (sum > 0) {
                    p = ((sum % 10) + (sum / 10));
                    if (p < 10) {
                        System.out.println(i);
                    }

                }

            }
    }
}