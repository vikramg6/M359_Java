package U3.Homework.Classroom;

public class Classroom{
    private String room;
    private String teach;
    private int students;
    public Classroom(String room, String teach, int students){
        this.room = room;
        this.teach = teach;
        this.students = students;
    }
    public Classroom(String room, String teach){
        this.room = room;
        this.teach = teach;
        this.students = 0;
    }
    public void startClass(){
        System.out.println("Class in room " + room + " has started with " + students + " students.");
    }
    public String getClassInfo(){
        return "Class: " + room + " | Teacher: " + teach + " | Student: " + students;
    }
    public void endClass(){
        System.out. println("Class in room " + room + " has started ended.");
    }
    public void addStudent(){
        students++;
    }
}
