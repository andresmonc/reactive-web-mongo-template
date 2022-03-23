package com.jmoncayo.template.sitecontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SiteContentController {

    private final SiteContentService siteContentService;

    @Autowired
    public SiteContentController(SiteContentService siteContentService) {
        this.siteContentService = siteContentService;
    }

    @GetMapping("/sitecontent")
    public Flux<SiteContent> getAllSiteContent() {
        return siteContentService.getAllSiteContent();
    }

    @PutMapping("/sitecontent")
    public Mono<SiteContent> addSiteContent(){
        return null;
    }
}
