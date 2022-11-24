package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {
        User user = User.builder()
                .name("김준일")
                .email("skjil1218@kakao.com")
                .build();

        System.out.println(user);
    }

}
