package com.hendisantika.serversentevents.repository;

import com.hendisantika.serversentevents.entity.Comment;
import reactor.core.publisher.Flux;

/**
 * Created by IntelliJ IDEA.
 * Project : server-sent-events
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/10/20
 * Time: 08.12
 */
public interface CommentRepository {

    Flux<Comment> findAll();
}
