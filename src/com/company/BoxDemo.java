package com.company;

     class Box {
           double height;
           double depth;
           double width;

         public Box(double width, double height, double depth) {
             this.height = height;
             this.depth = depth;
             this.width = width;
         }

         public Box() {
             System.out.println("нет данных");
         }

         @Override
         protected void finalize() throws Throwable {
             super.finalize();
             System.out.println("Goodbye");
         }

         double volume() {
            return width * height * depth;
        }
    }


