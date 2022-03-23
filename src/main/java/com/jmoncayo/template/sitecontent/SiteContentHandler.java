package com.jmoncayo.template.sitecontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SiteContentHandler {

    @GetMapping("hello")
    public Mono<SiteContent> hello() {
        return Mono.just(new SiteContent("Hello"));
    }
}
