package com.hendisantika.serversentevents.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : server-sent-events
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/10/20
 * Time: 08.11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private String author;
    private String message;
    private String timestamp;
}
