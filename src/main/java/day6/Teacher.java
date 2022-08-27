
package day6;

public class Teacher {
    private String teacherName;
    private String subject;

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    String evaluation;
    public void evaluate (Student st){
        int mark = (int) ((Math.random()*4)+2);
        switch(mark){
            case 5 :
                evaluation = "excellent";
                break;
            case 4 :
                evaluation = "good";
                break;
            case 3 :
                evaluation = "satisfactory";
                break;
            case 2 :
                evaluation = "unsatisfactory";
                break;
        }
        // сорри за корявый английский, проблемы с кодировкой
        System.out.println(subject + " teacher " + teacherName + " graded student " + st.getStudentName() + "'s work as " + evaluation);
    }
}
