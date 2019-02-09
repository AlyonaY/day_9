package com.company;


    class BoxDemo {
        public static void main(String[] args) {
            Box mybox = new Box(10,20,15);
            Box mybox1 = new Box(13,3,19);
            Box mybox2 = new Box();
            System.out.println(mybox.volume());
            System.out.println(mybox1.volume());


            mybox = null;
            System.out.println(mybox);
            System.gc();
        }
    }
