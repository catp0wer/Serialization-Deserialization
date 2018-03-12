
public class Grade {
    int grade;
    String subject;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Grade(int grade, String subject){
        this.grade=grade;
        this.subject=subject;
    }

    public Grade(){}
}
