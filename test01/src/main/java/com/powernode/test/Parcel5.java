package com.powernode.test;

public class Parcel5 {
    public Destination destination(String s)
    {
        class PDestination implements Destination {
            private String lable;

            public PDestination(String lable) {
                this.lable = lable;
            }
            @Override
            public String readline() {
                return lable;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination destination = p.destination("test");
        System.out.println(destination.readline());
    }
}
