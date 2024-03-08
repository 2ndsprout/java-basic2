package Exam.TV3;

 class TVSimulation {
     public static void main(String[] args) {

         // 샤오미 TV 객체 생성
         샤오미Tv a샤오미Tv = new 샤오미Tv("샤오미Tv");
         a샤오미Tv.켜기();
         a샤오미Tv.끄기();
         a샤오미Tv.vr켜기();

         // 삼성 TV 객체 생성
         삼성Tv a삼성Tv = new 삼성Tv("삼성Tv");
         a삼성Tv.켜기();
         a삼성Tv.끄기();
         a삼성Tv.ar켜기();

         // LG TV 객체 생성
         LGTv aLGTv = new LGTv("LGTv");
         aLGTv.켜기();
         aLGTv.끄기();
         aLGTv.게임모드전환();

         System.out.println("== 표준Tv 리모콘 들여온 후 ==");

         // 표준Tv 리모콘을 만든다.
         표준Tv a표준Tv;

         // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
         a표준Tv = new 샤오미Tv("샤오미Tv");
         a표준Tv.켜기();
         a표준Tv.끄기();

         // a표준Tv 변수에 삼성Tv 객체를 연결한다.
         a표준Tv = new 삼성Tv("삼성Tv");
         a표준Tv.켜기();
         a표준Tv.끄기();

         // a표준Tv 변수에 LGTv 객체를 연결한다.
         a표준Tv = new LGTv("LGTv");
         a표준Tv.켜기();
         a표준Tv.끄기();
     }
 }

class 표준Tv {
    String brand;

    // 생성자를 통해 브랜드 이름 설정
    public 표준Tv(String brand) {
        this.brand = brand;
    }

    void 켜기() {
        System.out.println(brand + " 켜집니다.");
    }

    void 끄기() {
        System.out.println(brand + " 꺼집니다.");
    }

    void vr켜기() {
        System.out.println(brand + " vr켜기!");
    }

    void ar켜기() {
        System.out.println(brand + " ar켜기!");
    }

    void 게임모드전환() {
        System.out.println(brand + " 게임모드전환!");
    }
}

class 샤오미Tv extends 표준Tv {
    public 샤오미Tv(String brand) {
        super(brand);
    }

    // 특화된 메서드 오버라이딩
    @Override
    void vr켜기() {
        System.out.println(brand + " vr켜기!");
    }
}

class 삼성Tv extends 표준Tv {
    public 삼성Tv(String brand) {
        super(brand);
    }

    // 특화된 메서드 오버라이딩
    @Override
    void ar켜기() {
        System.out.println(brand + " ar켜기!");
    }
}

class LGTv extends 표준Tv {
    public LGTv(String brand) {
        super(brand);
    }

    // 특화된 메서드 오버라이딩
    @Override
    void 게임모드전환() {
        System.out.println(brand + " 게임모드전환!");
    }
}