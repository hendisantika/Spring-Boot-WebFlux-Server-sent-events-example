package com.hendisantika.serversentevents.controller;

import com.hendisantika.serversentevents.entity.Comment;
import com.hendisantika.serversentevents.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created by IntelliJ IDEA.
 * Project : server-sent-events
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/10/20
 * Time: 08.17
 */
@RestController
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping(path = "/comment/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Comment> feed() {
        return this.commentRepository.findAll();
    }
}
