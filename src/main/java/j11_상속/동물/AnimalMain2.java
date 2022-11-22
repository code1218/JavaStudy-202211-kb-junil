package j11_상속.동물;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println("[업캐스팅]");
        for(int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        System.out.println();

        System.out.println("[다운캐스팅]");
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) {
                ((Human) animals[i]).readBooks();
            } else if(animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();
            }
        }


    }
}
