package org.yukung.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yukung
 */
@RestController
public class ConsumerSideController {

    private final RestTemplate restTemplate;

    ConsumerSideController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping(path = "/beer",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String gimmeABeer(@RequestBody Person person) {
        // TODO implement here
        return null;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {
    public String name;
    public int age;
}

class Response {
    public ResponseStatus status;
}

enum ResponseStatus {
    OK, NOT_OK
}

/*
    @PostMapping(path = "/beer",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String gimmeABeer(@RequestBody Person person) {
        ResponseEntity<Response> response = restTemplate.exchange(
                RequestEntity
                        .post(URI.create("http://localhost:8090/check"))
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(person),
                Response.class);
        switch (response.getBody().status) {
            case OK:
                return "HERE YOU GO!";
            default:
                return "YOU ARE KIDDING!";
        }
    }
*/
