package com.appdynamics.extensions.coherence;


public enum CoherenceMBeanKeyPropertyEnum {

    NODEID("nodeId"),
    SERVICE("service"),
    RESPONSIBILITY("responsibility"),
    DOMAIN("Domain"),
    SUBTYPE("subType"),
    CACHE("cache"),
    TIER("tier");

    private final String name;

    private CoherenceMBeanKeyPropertyEnum(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
