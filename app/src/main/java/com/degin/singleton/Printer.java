package com.degin.singleton;

/*TODO: 
singleton패턴은 전역 변수를 사용하지 않고 객체를 하나만 생성 하도록 하며, 생성된 객체를 어디에서든지 참조할 수 있도록 하는 패턴이다.

*/
public class Printer {
    private static Printer printer = null;

    private Printer() {
    }

    public static Printer getPrinter() {
        // 조건 검사 구문 (문제의 원인!)
        if (printer == null) {
            try {
                // 스레드 스케줄링 변경(스레드 실행 1ms동안 정지)
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }

            // Printer 인스턴스 생성
            printer = new Printer();
        }
        return printer;
    }

    public void print(String str) {
        System.out.println(str);
    }
}
