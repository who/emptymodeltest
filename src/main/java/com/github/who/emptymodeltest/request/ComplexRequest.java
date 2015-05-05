package com.github.who.emptymodeltest.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComplexRequest{
    private String[] things;
    private String thing;
    private String anotherThing;
    private String andAnotherThing;

    @JsonCreator
    public static ComplexRequest create(
            @JsonProperty("things") String[] users,
            @JsonProperty("thing") String start,
            @JsonProperty("anotherThing") String limit,
            @JsonProperty("andAnotherThing") String sort) {
        
        return new ComplexRequest(users, start, limit, sort);
    }

    private ComplexRequest(String[] users, String start, String limit, String sort) {
        this.things = users;
        this.thing = start;
        this.anotherThing = limit;
        this.andAnotherThing = sort;
    }

    public String[] getThings() {
        return things;
    }

    public String getThing() {
        return thing;
    }

    public String getAnotherThing() {
        return anotherThing;
    }

    public String getAndAnotherThing() {
        return andAnotherThing;
    }
}
