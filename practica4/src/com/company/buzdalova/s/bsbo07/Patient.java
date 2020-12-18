package com.company.buzdalova.s.bsbo07;
public  class Patient  {

    public static  volatile boolean hasservicedT;
     public static volatile boolean hasservicedMRT;
      public static volatile int ID;

    public Patient(int ID, boolean hasservicedT, boolean hasservicedMRT) throws InterruptedException {
        Thread.sleep(1000);
    }

}
