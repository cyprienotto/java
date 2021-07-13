package com.cyprienotto;

import com.cyprienotto.generics.User;

public class Main {

    public static void main(String[] args) {
        var user1 = new User(15);
        var user2 = new User(20);

        boolean isSup = (user2.compareTo(user1) < 0);
        System.out.println(isSup);
    }

    public static void sayhello(String name) {
        System.out.println(name.toUpperCase());
    }
}
