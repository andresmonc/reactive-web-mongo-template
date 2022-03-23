package com.jmoncayo.template.sitecontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class SiteContentHandler {

    private final SiteContentService siteContentService;

    @Autowired
    public SiteContentHandler(SiteContentService siteContentService) {
        this.siteContentService = siteContentService;
    }



    @GetMapping("/sitecontent")
    public Flux<SiteContent> getAllSiteContent() {
        return siteContentService.getAllSiteContent();
    }
}
