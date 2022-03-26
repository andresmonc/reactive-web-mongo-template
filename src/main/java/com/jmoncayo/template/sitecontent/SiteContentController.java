package com.jmoncayo.template.sitecontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
        return siteContentService.getSiteContentRepository().findAll();
    }

    @PutMapping("/sitecontent")
    public Mono<SiteContent> createSiteContent(){
        return null;
    }

    @PostMapping("/sitecontent/{id}")
    public Mono<SiteContent> updateSiteContent(@PathVariable String id, @RequestBody SiteContent body){
        return siteContentService.getSiteContentRepository().save(body);
    }

}
