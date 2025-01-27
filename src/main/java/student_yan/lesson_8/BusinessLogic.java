package student_yan.lesson_8;

import java.util.ArrayList;
import java.util.List;

class BusinessLogic {

    private Dairy dairy;

    public BusinessLogic() {
        this.dairy = new Dairy();
    }

    public void addMark(String subject, int mark) {

        Mark newMark = new Mark(subject, mark);
        dairy.addMark(newMark);
    }

    // find all marks by subject
    public List<Mark> findMarksBySubjects(String subject) {
        List<Mark> subjectMarks = new ArrayList<>();
        for (Mark mark : dairy.getMarks()) {
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
    return subjectMarks;
    }

    //find best mark for subject
    public int findBestMark(String subject) {
        List<Mark> subjectMarks = findMarksBySubjects(subject);
        int bestMark = subjectMarks.get(0).getMark();
        for (Mark mark : subjectMarks) {
            if (mark.getMark() > bestMark) {
                bestMark = mark.getMark();
            }
        }
        return bestMark;
    }


}
