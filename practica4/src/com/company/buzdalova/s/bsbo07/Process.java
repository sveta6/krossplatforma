package com.company.buzdalova.s.bsbo07;

public class Process extends Thread {
    boolean isBusy=false;
    public volatile  Patient service;

//    public enum ServiceCategory{
//        DOCTOR, MRT;
//    }
//    public ServiceCategory patientstep;
//
//    public Process (ServiceCategory patientstep){
//        this.patientstep= patientstep;
//    }



   // private Object p;
    /*public static Thread mrtt=new Thread(()->{
        for (int i =0; i<MyQueue.queue.size()&&!Thread.interrupted(); )
        {   try{System.out.println("patient "+Patient.ID +" in  MRT's room");
            //therapist(this);
           // Thread.sleep(1000);
            Patient.hasservicedMRT=true;
            Thread.yield();
            //MyQueue.queue.poll();
            i++;

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        }
    });

    //static volatile String patient;
    public  static Thread doctor=new Thread(()->{
         for (int i =0; i<MyQueue.queue.size()&&!Thread.interrupted(); )
         {   try{System.out.println("patient "+Patient.ID +" in  therapist's class");
             //therapist(this);
             //Thread.sleep(300);
             Patient.hasservicedT=true;
             if (Patient.hasservicedT&&Patient.hasservicedMRT==true) System.out.println(Patient.ID+" good serv");
             else System.out.println(Patient.ID+" bad serv");
             MyQueue.queue.remove();

         }
             catch (Exception e) {
             e.printStackTrace();
         }

         }

    });
*/

    public void therapist(Patient patient){
         Thread doctor=new Thread(()->{
        if(MyQueue.maxLength!=0)
        {if(!isBusy)
            { System.out.println("Patient "+MyQueue.queue.element()+" go to therapist");
            service= patient;
            isBusy=true;
            try { Thread.sleep(1000); }
            catch (InterruptedException e){
                e.printStackTrace(); }
            Patient.hasservicedT=true;
            System.out.println("Patient "+ MyQueue.queue.element()+ " out of the therapist");
            isBusy=false;
            }
            else {
            System.out.println("Therapist is busy by patient " + patient.ID);
            Patient.hasservicedT=false;
            }
        }});
        doctor.start();
    }



    public  void mrt( Patient patient){
        Thread mrtt=new Thread(()->{
            if(MyQueue.maxLength!=0)
            {if(!isBusy)
                { System.out.println("Patient "+MyQueue.queue.element()+" go to MRT");
                service= patient;
                isBusy=true;
                try { Thread.sleep(1000); }
                catch (InterruptedException e){ e.printStackTrace(); }
                Patient.hasservicedMRT=true;
                System.out.println("Patient "+ MyQueue.queue.element()+ " out of the MRT");
                isBusy=false;
                }
                else {
                System.out.println("MRT is busy by patient " + patient.ID);
                patient.hasservicedMRT=false; }
            }
        });
        mrtt.start();
    }


   /* @Override
    public String toString() {
        return "Process{" +
                "name=" + patient +
                '}';
    }*/
   //public MyQueue getQueue() {return queue;}
  // private List<Process> flows;
    @Override
    public  void run() {

//System.out.println(Thread.currentThread().getName());
//Process process= flows.get(0);//
// MyQueue queue=process.getQueue();
        /*for (int i = 0; i < processNumber; i++) {
            int r=random.nextInt(10);
            process = new Process(patientstep);
            queue.addPatientToQueue(patientstep);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        /*flag = true;
        synchronized (this) {
            notifyAll();
        }*/

        //mrtt.start();
        //doctor.start();
 //for (int i=0;i<MyQueue.maxLength;){
     therapist(MyQueue.queue.peekFirst());
     try {
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     mrt(MyQueue.queue.peekFirst());
try {
    Thread.sleep(5000);
    if (Patient.hasservicedT&&Patient.hasservicedMRT==true) System.out.println(" good serv");
    else System.out.println(" bad serv");

} catch (InterruptedException e) {
    e.printStackTrace();
}}}
   // i++;
// }

//
//    }
//    public boolean isFlag() {
//        return flag;
//    }
//
//    public void operating(MyQueue queue) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
/*    public void oneflow()
    {Process process= flows.get(0);
      //  MyQueue queue=process.getQueue();
        while (!process.isFlag() || queue.getSize() != 0) {
            try{if (queue.getSize() == 0) {
                Thread.sleep(500);
            } else {
                operating(queue);
            }} catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
    public void twoflow(){
        Process processFlow1 = flows.get(0);
        Process processFlow2 = flows.get(1);
        MyQueue cQueue1 = processFlow1.getQueue();
        MyQueue cQueue2 = processFlow2.getQueue();
        while (!processFlow1.isFlag() || !processFlow2.isFlag() || queue.getSize()!= 0) {
            try{ if (cQueue1.getSize() != 0) {
                operating(cQueue1);
            } else if (cQueue2.getSize() != 0) {
                operating(cQueue2);
            } else {
                Thread.sleep(1000);
            }}
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }*/
//}
