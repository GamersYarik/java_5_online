package ua.com.alevel.test;

import  org.apache.commons.lang3.StringUtils;

public class Print {
    public void printMessage(String message) {
        System.out.println("Message = " + message);
        System.out.println("Message = " + StringUtils.upperCase(message));
    }
}
