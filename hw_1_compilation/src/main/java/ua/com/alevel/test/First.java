package ua.com.alevel.test;

import org.apache.commons.lang3.StringUtils;
import java.util.Random;
import org.apache.commons.math3.util.MathUtils;

public class First {
    public void printMessage(String message) {
        System.out.println("Message = " + message);
        System.out.println("Message = " + StringUtils.upperCase(message));
        System.out.println("Message = " + StringUtils.lowerCase(message));
        Random ran = new Random();
        int nxt = ran.nextInt();
        System.out.println("The Randomly generated integer is : " + nxt);
        MathUtils.checkNotNull(nxt);
        System.out.println(MathUtils.copySign(-124,126));
    }
}
