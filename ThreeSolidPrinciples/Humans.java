package threesolid;

import Java.lang.io;

    public class Worker implements IWorker(){
        public void work(){
            System.out.println("Worker working...");
        }

        public void eat(){
            System.out.println("Worker eating...");
        }

    };

    public class SuperWorker implements IWorker(){
        public void work(){
            System.out.println("SuperWorker is soopa working...");
        }

        public void eat(){
            System.out.println("SuperWorker is soopa eating...");
        }


    };