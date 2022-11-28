package j14_스태틱.빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .address("부산")
                .studentCode(20220001)
                .build();

        System.out.println(student);

        Student.StudentBuilder sb = new Student.StudentBuilder();


    }
}
