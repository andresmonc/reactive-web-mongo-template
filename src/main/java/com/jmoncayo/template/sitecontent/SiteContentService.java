package com.jmoncayo.template.sitecontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class SiteContentService {

    private final SiteContentRepository siteContentRepository;

    @Autowired
    public SiteContentService(SiteContentRepository siteContentRepository) {
        this.siteContentRepository = siteContentRepository;
    }

    public Flux<SiteContent> getAllSiteContent() {
        return siteContentRepository.findAll();
    }
}
