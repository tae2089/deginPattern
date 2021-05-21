package com.degin.singleton;

public class Client {
    private static final int USER_NUM = 5;

    public static void main(String[] args) {
        User[] user = new User[USER_NUM];
        for (int i = 0; i < USER_NUM; i++) {
            // User 인스턴스 생성
            user[i] = new User(String.valueOf(i + 1));
            user[i].print();
        }
    }
}
