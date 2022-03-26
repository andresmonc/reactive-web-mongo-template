package com.jmoncayo.template.sitecontent;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SiteContentService {

    @Getter
    private final SiteContentRepository siteContentRepository;

    @Autowired
    public SiteContentService(SiteContentRepository siteContentRepository) {
        this.siteContentRepository = siteContentRepository;
    }

    public Mono<SiteContent> newSiteContent(SiteContent siteContent) {
        return siteContentRepository.save(siteContent);

    }

}
