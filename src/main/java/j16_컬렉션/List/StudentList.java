package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(20220001, "이승아", 21, null));
        students.add(new Student(20220002, "김수현", 22, null));
        students.add(new Student(20220003, "문경원", 23, null));
        students.add(new Student(20220004, "홍지혜", 24, null));
        students.add(new Student(20220005, "고동현", 25, null));

        Student student2 = students.get(3);

        System.out.println(student2);

        //이름이 문경원인 학생의 나이를 26세로 바꾸세요.

        for(int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }

        for(Student s : students) {
            if(s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }

        System.out.println(students);

        // 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
        // 제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동

        String lastName = null;
        for(int i = 0; i < students.size(); i++) {
            int nowIndex = students.size() - 1 - i;
            int preIndex = nowIndex - 1;
            Student s = students.get(nowIndex);

            if(nowIndex == 0) {
                s.setName(lastName);
            }

            if(nowIndex == students.size() - 1) {
                lastName = s.getName();
            }
            s.setName(students.get(preIndex).getName());
        }

        System.out.println(students);

    }
}
