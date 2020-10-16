package com.hendisantika.serversentevents.repository;

import com.hendisantika.serversentevents.entity.Comment;
import com.hendisantika.serversentevents.util.CommentGenerator;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : server-sent-events
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/10/20
 * Time: 08.13
 */
@Repository
public class ReactiveCommentRepository implements CommentRepository {

    @Override
    public Flux<Comment> findAll() {
        //simulate data streaming every 1 second.
        return Flux.interval(Duration.ofSeconds(1))
                .onBackpressureDrop()
                .map(this::generateComment)
                .flatMapIterable(x -> x);
    }

    private List<Comment> generateComment(long interval) {

        Comment obj = new Comment(CommentGenerator.randomAuthor(), CommentGenerator.randomMessage(),
                CommentGenerator.getCurrentTimeStamp());
        return Arrays.asList(obj);

    }
}
