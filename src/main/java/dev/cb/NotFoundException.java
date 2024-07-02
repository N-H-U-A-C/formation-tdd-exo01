package dev.cb;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String label){
        super(label);
    }
}
