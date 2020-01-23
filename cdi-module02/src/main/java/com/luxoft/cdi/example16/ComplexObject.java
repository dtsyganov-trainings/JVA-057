package com.luxoft.cdi.example16;


import javax.enterprise.inject.Vetoed;

@Vetoed
public class ComplexObject {
    private static int nextId = 1;
    private int id;

    public ComplexObject() {
        this.id = nextId++;
        System.out.println("Complex Object Produced with id = " + this.id);
    }

    public void manualDisposeMethod() {
        System.out.println("Complex Object with id " + this.id + " Disposed ");
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "id=" + id +
                '}';
    }
}
