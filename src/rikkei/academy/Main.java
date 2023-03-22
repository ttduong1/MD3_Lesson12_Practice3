package rikkei.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Thương", 18, "TP.HCM");
        Student student1 = new Student("Thảo", 21, "HN");
        Student student2 = new Student("Trang", 20, "HN");
        Student student3 = new Student("Quỳnh", 22, "BN");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student st : lists){
            System.out.println(st.toString());
        }
    }
}