package com.ddddvia.patterndesign.factory.jdksrc;

import java.util.Calendar;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Factory {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Äê£º"+ calendar.get(Calendar.YEAR));
    }
}
