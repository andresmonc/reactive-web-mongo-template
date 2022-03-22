package com.jmoncayo.template.sitecontent;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class SiteContentClient {
    private final WebClient client;

    // Spring Boot auto-configures a `WebClient.Builder` instance with nice defaults and customizations.
    // We can use it to create a dedicated `WebClient` for our component.
    public SiteContentClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8080").build();
    }

    public Mono<String> getMessage() {
        return this.client.get().uri("/hello").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(SiteContent.class)
                .map(SiteContent::getName);
    }

}
