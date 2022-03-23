package com.jmoncayo.template.sitecontent;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SiteContentRepository extends ReactiveMongoRepository<SiteContent, String> {
}
