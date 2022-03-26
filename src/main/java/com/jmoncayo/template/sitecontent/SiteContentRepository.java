package com.jmoncayo.template.sitecontent;

import com.jmoncayo.template.caching.Caches;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface SiteContentRepository extends ReactiveMongoRepository<SiteContent, String> {

    @Override
    @Cacheable(Caches.Constants.SITECONTENT)
    Flux<SiteContent> findAll();
}
