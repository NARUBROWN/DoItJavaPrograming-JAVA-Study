//접근 제어자 public 을 선언한 Variable 클래스
public class day1 {

    // 메인메소드 선언
    // 접근 제어자 public, 정적 함수라는 것을 명시 static,
    // 함수가 끝날때 반환 값이 없다는것을 표현하는 void
    // 자바의 시작은 항상 main 함수로 시작해야 함
    // main 함수
    // main 의 parameter 로 args 를 String 배열 문자로 사용하겠다는 의미
    // JVM entry point (진입지점, 프로그래밍 시작지점)은 main(String[] args)
    // 단 하나만으로 정의되었음
    // JAVA Method 요약에 보면  static void main(String[] args) 전체가
    // entry point 라고 명시되어 있음
    public static void main(String[] args) {
        // 자바 변수 명명법
        // 변수 이름은 영문자나 숫자를 사용할 수 있음
        // 변수 이름은 숫자로 시작할 수 없음
        // 예약어 사용 불가
        // Camel notation 사용

        char ch1 = 'A';
        int in1 = 1;

        System.out.println(ch1);
        System.out.println(in1);

        // final 자바에서 상수 선언
        final int in2 = 2;
        System.out.println(in2);

        // local variable type inference 지역 변수 자료 추론
        // JAVA 10에서 생김 지연 변수에서만 사용가능
        // 선언될때 초기화 됐던 값의 자료형으로 고정
        var va1 = "안녕하세요";
        System.out.println(va1);

        var va2 = 1;
        System.out.println(va2);

        // 형 변환
        // 묵시적 형 변환 (자동 형변환)
        // 바이트가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이뤄진다.
        // 덜 정밀한 자료형에서 정밀한 자료형으로 형 변환은 자동으로 이뤄진다.
        int in3 = 5;
        long lo1 = in3;

        System.out.println(lo1);

        // 명시적 형 변환 (강제 형 변환)
        // 큰 자료형에서 작은 자료형으로 형 변환은 강제로 이뤄진다.
        long lo2 = 232;
        // 바꿀 자료형을 ()로 명시해줘야 한다.
        int in4 = (int)lo2;
        System.out.println(in4);

        // 논리 연산자
        // 논리 곱 && 두 합이 참인 경우에만 깂과 값이 참
        boolean var1 = (5 > 3) && (5 > 2);
        System.out.println(var1);
        // 논리 합 || 두 합 중 하나만 참이여도 결과 값이 참
        boolean var2 = (5 > 3) || (5 < 2);
        System.out.println(var2);
        // 부정 ! 참인 경우에는 거짓으로 바꾸고 거짓인 경우에는 참으로 바뀜
        boolean var3 = !(4 > 2);

        // 복합대입 연산자 (비트 연산자 제외)
        // += 두합의 값을 더해서 왼쪽 항에 대입
        // -= 왼쪽 항에서 오른쪽 항을 빼서 그 값을 왼쪽 항에 대입
        // *= 두 항의 값을 곱해서 왼쪽 항에 대입
        // /= 왼쪽 항을 오른쪽 항으로 나누어 그 몫을 왼쪽 항에 대입
        // %= 왼쪽 항을 오른쪽 항으로 나누어 그 나머지를 왼쪽항에 대입


        // 조건 연산자 (삼항 연산자)
        // 조건식 ? 결과1 : 결과 2의 형태
        //         조건식  ? 결과1 : 결과2
        int num = (5 > 3) ? 10 : 20;
        System.out.println(num);

        // 조건문
        // if else 문
        int age = 10;
        if (age >= 8) {
            System.out.println("학교에 다닙니다.");
        } else {
            System.out.println("학교에 다니지 않습니다.");
        }
        // else if 문
        if (age >= 8) {
            System.out.println("학교에 다닙니다.");
        } else if (age >= 15 && age <= 20){
            System.out.println("중학교나 고등학교에 다닙니다.");
        } else {
            System.out.println("그 외의 상황 입니다.");
        }
        // switch - case 문
        var rank = 2;
        var medalColor = "";

        switch(rank) {
            case 1 :
                medalColor = "G";
                break;
            case 2 :
                medalColor = "S";
                break;
            case 3 :
                medalColor = "B";
                break;
            case 4 :
                System.out.println("탈락");
                break;
        }
        System.out.println(medalColor);


        // 반복문
        // while 문
        int num1 = 1;
        int sum = 0;

        while (num1 <= 10) {
            sum += num;
            num1++;
        }
        System.out.println(sum);
        // do while 문
        // do-while 은 do 만의 문장을 무조건 먼저 수행한 후에 검사한다.
        do {
            sum += num;
            num1++;
        } while (num1 <= 10);
        System.out.println(sum);

        // for 문
        int i;
        int sum1 = 0;
        for (i = 1; i <= 10; i++) {
            sum1 += i;
        }
        System.out.println("FOR문 " + sum1);


    }
}
