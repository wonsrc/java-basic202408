package oop.poly.player;



public class Warrior extends Player {

    int rage; // 전사만이 가지는 속성

    Warrior(String nickName) {
        // 모든 생성자에는 super()가 내장되어 있습니다.
        // 자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
        // 부모의 속성과 기능이 실존하게 되고, 물려줄 수 있기 때문입니다.
        super(nickName);this.rage = 100;
        this.rage = 100;
    }

    public void dash() {
        System.out.println("돌진 스킬을 사용합니다");
    }


    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage: " + rage);
    }
}
