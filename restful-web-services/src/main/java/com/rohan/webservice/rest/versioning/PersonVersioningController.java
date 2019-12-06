package com.rohan.webservice.rest.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {


    // URI VERSIONING

    @GetMapping("v1/person")
    public PersonV1 personV1() {
        return new PersonV1("Stan Smith");
    }

    @GetMapping("v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Stan", "Smith"));
    }

    // More elegant way of doing this

    /**
     *
     * REQUEST PARAM VERSIONING
     * How to call
     * <p>
     * http://localhost:8085/person/param?version=2
     */

    @GetMapping(value = "/person/param", params = "version=1")
    public PersonV1 paramV1() {
        return new PersonV1("Stan Smith");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Stan", "Smith"));
    }

    /**
     * Header Versioning
     * <p>
     * pass the value in headers
     */

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 headerV1() {
        return new PersonV1("Stan Smith");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerV2() {
        return new PersonV2(new Name("Stan", "Smith"));
    }


    /**
     * Accept header versioning / MIME type versioning
     * Using produces
     */
    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonV1 producesV1() {
        return new PersonV1("Stan Smith");
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonV2 producesV2() {
        return new PersonV2(new Name("Stan", "Smith"));
    }


}
