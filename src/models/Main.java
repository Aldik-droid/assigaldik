package models;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bagdat", "Omirbek", 19, true);
        student1.addGrade(88);
        student1.addGrade(92);

        Student student2 = new Student("Almas", "Kenzhebai", 20, true);
        student2.addGrade(76);
        student2.addGrade(85);

        Teacher teacher1 = new Teacher("Ardak", "Lezbekov", 45, true, "Math", 15, 50000);
        Teacher teacher2 = new Teacher("Gulmira", "Besikesovna", 38, false, "Biology", 8, 45000);

        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        teacher1.giveRaise(10);
        teacher2.giveRaise(5);

        school.displayMembers();

        System.out.println(student1.name + " GPA: " + student1.calculateGPA());
        System.out.println(student2.name + " GPA: " + student2.calculateGPA());

        System.out.println(teacher1.name + " new salary: " + teacher1.salary);
        System.out.println(teacher2.name + " new salary: " + teacher2.salary);
    }
}