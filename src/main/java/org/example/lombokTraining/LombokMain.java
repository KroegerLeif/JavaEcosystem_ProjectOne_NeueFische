package org.example.lombokTraining;

import java.util.ArrayList;

public class LombokMain {
    public static void main(String[] args) {

        //Creation of Students
        System.out.println("Students: ");
        Student student = new Student(1,"Paul","Berlin",3);
        Student student2 = new Student(2,"John","New York",4);
        Student student3 = new Student(3,"George","London",5);
        Student student4 = new Student(4,"Ringo","Paris",6);
        Student student5 = new Student(5,"Pauline","Tokyo",7);
        Student student6 = new Student(6,"George","Moscow",8);
        Student student7 = new Student(7,"John","Hong Kong",9);
        Student student8 = new Student(8,"Ringo","Singapore",10);
        Student student9 = new Student(9,"Pauline","Sydney",11);

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student8);
        System.out.println(student9);


        //Creation of Teachers
        System.out.println("Teachers: ");
        Teacher teacher = new Teacher(1,"Paul","Biology");
        Teacher teacher2 = new Teacher(2,"John","Physics");
        Teacher teacher3 = new Teacher(3,"George","Chemistry");

        System.out.println(teacher);
        System.out.println(teacher2);
        System.out.println(teacher3);

        //Bio
        System.out.println("Students Bio: ");
        ArrayList<Student> studentsBio = new ArrayList<>();
        studentsBio.add(student);
        studentsBio.add(student2);
        studentsBio.add(student5);
        studentsBio.add(student3);
        studentsBio.add(student8);
        studentsBio.add(student6);

        for (Student studentBio : studentsBio) {
            System.out.println(studentBio);
        }

        //Physik
        System.out.println("Students Physik: ");
        ArrayList<Student> studentsPhysik = new ArrayList<>();
        studentsBio.add(student7);
        studentsBio.add(student2);
        studentsBio.add(student8);
        studentsBio.add(student6);

        for (Student studentPhy : studentsPhysik) {
            System.out.println(studentPhy);
        }

        //Chemistry
        System.out.println("Students Chemistry: ");
        ArrayList<Student> studentChemistry = new ArrayList<>();
        studentsBio.add(student4);
        studentsBio.add(student2);
        studentsBio.add(student9);
        studentsBio.add(student7);
        studentsBio.add(student8);
        studentsBio.add(student3);

        for (Student studentChem : studentChemistry) {
            System.out.println(studentChem);
        }

        //Creation of Courses
        System.out.println("Courses: ");
        Course biology = new Course(1, "Biology",teacher,studentsBio);
        Course physics = new Course(2, "Physics",teacher2,studentsPhysik);
        Course chemistry = new Course(3, "Chemistry",teacher3,studentChemistry);

        System.out.println(biology);
        System.out.println(physics);
        System.out.println(chemistry);
    }
}
