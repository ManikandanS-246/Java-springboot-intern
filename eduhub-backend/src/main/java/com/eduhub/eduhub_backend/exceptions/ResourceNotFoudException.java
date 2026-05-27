package com.eduhub.eduhub_backend.exceptions;

public class ResourceNotFoudException extends RuntimeException{
    public ResourceNotFoudException(String resource,String field,String error) {
        super(String.format("%s not foud with %s:%s",resource,field,error));
    }
}
