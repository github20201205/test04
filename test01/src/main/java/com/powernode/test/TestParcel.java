package com.powernode.test;

class Parcle4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {

        private String lable;

        public PDestination(String lable) {
            this.lable = lable;
        }

        @Override
        public String readline() {
            return lable;
        }
    }

    public Contents contents() {
        return new PContents();
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }
}


public class TestParcel {
    public static void main(String[] args) {
        Parcle4 p = new Parcle4();
        Contents contents = p.contents();
        Destination destination = p.destination("test");
        System.out.println(contents.value());
        System.out.println(destination.readline());
    }
}
