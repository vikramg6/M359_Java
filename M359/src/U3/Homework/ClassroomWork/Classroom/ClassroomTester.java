package U3.Homework.ClassroomWork.Classroom;

public class ClassroomTester {
        public static void main(String[] args) {
            Classroom c1 = new Classroom("223", "DeSteph", 25);
            Classroom c2 = new Classroom("221", "Denna");


            c1.startClass();
            System.out.println(c1.getClassInfo());
            c1.endClass();
            System.out.println(c2.getClassInfo());
            c2.addStudent();
            c2.addStudent();
            c2.startClass();
            System.out.println(c2.getClassInfo());
        }
    }

