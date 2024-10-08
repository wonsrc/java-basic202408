package oop.this_;

public class Player {

    // 필드
    String  nickName;
    int level;
    int hp;

    Player() {
        System.out.println("Player의 기본 생성자 호출");
        level = 1;
        hp = 50;

    }

    Player(String nickName) {
        this(); // 내 다른 생성자를 호출하는 문.
        System.out.println("Player의 2번 생성자 호출!");
        this.nickName = nickName;
//        level = 1;
//        hp = 50;
    }

    Player(String nickName, int hp) {
        this(nickName); // 내 다른 생성자 호출은 반드시 생성자 최상단에 위치해야 함!
        System.out.println("Player의 3번 생성자 호출!");
        this.hp = hp;
    }

    public Player(int level, String nickName, int hp) {
        this.level = level;
        this.nickName = nickName;
        this.hp = hp;
    }

    // 메서드
    void attack(Player target) {
        if(this == target) {
            System.out.println("타겟이 잘못되었습니다");
            return;
        }
        System.out.printf("%s 이(가) %s(을)를 공격합니다.\n"
                , this.nickName, target.nickName);
        // 맞는 Player 체력 10 감소
        target.hp -= 10; //
        // 때리는 Player  체력 3 감소
        this.hp -= 3;
        System.out.printf("%s 님의 남은 체력: %d\n", this.nickName, this.hp);
        System.out.printf("%s 님의 남은 체력: %d", target.nickName, target.hp);
    }

    // 객체 내부의 속성을 문자열 형태로 확인하기 위한 메서드
    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}
