package com.hendisantika.serversentevents.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Project : server-sent-events
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/10/20
 * Time: 08.13
 */
public class CommentGenerator {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final Random RANDOM = new Random(System.currentTimeMillis());

    private static final List<String> COMMENT_AUTHOR =
            Arrays.asList(
                    "Mkyong", "Oliver", "Jack", "Harry", "Jacob",
                    "Isla", "Emily", "Poppy", "Ava", "Isabella", "Hendi", "Naruto", "Sasuke", "Kakashi");


    private static final List<String> COMMENT_MESSAGE =
            Arrays.asList(
                    "I Love this!",
                    "Me too!",
                    "Wow",
                    "True!",
                    "Hello everyone here?",
                    "Good!");

    public static String randomAuthor() {
        return COMMENT_AUTHOR.get(RANDOM.nextInt(COMMENT_AUTHOR.size()));
    }

    public static String randomMessage() {
        return COMMENT_MESSAGE.get(RANDOM.nextInt(COMMENT_MESSAGE.size()));
    }

    public static String getCurrentTimeStamp() {
        return dtf.format(LocalDateTime.now());
    }
}
