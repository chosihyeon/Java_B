package CatDailylife;

class Cat_2 {
    // 필드를 private으로 선언하여 외부에서 직접 접근하지 못하게 함
    private String breed;
    private String color;
    private int age;

    // 생성자
    Cat_2(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    Cat_2(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    Cat_2(String color) {
        this.color = color;
        System.out.println("나의 고양이는 " + color + " 코숏입니다.");
    }

    // Getter와 Setter 메서드

    // breed 필드의 getter와 setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // color 필드의 getter와 setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // age 필드의 getter와 setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 메서드: 고양이가 사료를 먹음
    void eat(String time) {
        System.out.printf("%s에 사료를 먹습니다.\n", time);
    }

    // 메서드: 고양이가 야옹함
    void meow() {
        System.out.println("야옹~~~~");
    }

    // 메서드: 고양이가 스크래치를 긁음
    void scratch() {
        System.out.println("스크래치를 긁습니다.");
    }
}

public class CatTest_2 {

    public static void main(String[] args) {
        // '노랑' 색깔 고양이 생성
        Cat_2 a = new Cat_2("노랑");

        // getter와 setter 사용 예시
        a.setColor("검정"); // setter로 색상을 '검정'으로 변경
        System.out.println("고양이의 색깔은 " + a.getColor() + "입니다."); // getter로 색상 출력

        // 낮에 사료 먹고 야옹
        a.eat("낮");
        a.meow();
        System.out.println();

        // 점심에 사료 먹고 스크래치, 야옹
        a.eat("점심");
        a.scratch();
        a.meow();
    }
}


