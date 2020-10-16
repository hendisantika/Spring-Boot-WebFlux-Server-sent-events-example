package com.hendisantika.serversentevents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : server-sent-events
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/10/20
 * Time: 08.17
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String index(final Model model) {
        return "index";
    }
}
