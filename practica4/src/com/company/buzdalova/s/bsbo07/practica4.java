package com.company.buzdalova.s.bsbo07;
import java.util.*;
import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;

public class practica4 {
    //part 1
    public static void task1() throws InterruptedException {
        Thread myThready1 = new Thread(new Runnable() {
           public void run()
        {for (int i =0; i<=33;i++)
            { int r= i%10; if(r==0){System.out.println(i);} }
            try { sleep(1000); }
            catch (InterruptedException e) { e.printStackTrace(); }
        }});myThready1.start();
        Thread myThready2 = new Thread(new Runnable() {
            public void run()
            {for (int i =34; i<=65;i++)
                { int r= i%10; if(r==0){System.out.println(i);} }
                try { sleep(3000); }
                catch (InterruptedException e) { e.printStackTrace(); }
            }});myThready2.start();
        Thread myThready3 = new Thread(new Runnable() {
            public void run()
            { for (int i = 66; i <= 100; i++)
                {int r = i % 10;if (r == 0) { System.out.println(i); } }
                try { sleep(5000); }
                catch (InterruptedException e) { e.printStackTrace(); }
            }});myThready3.start();
    }


/* //task2()
{
     StringBuilder sb= new StringBuilder().append('a');
    class PrintChar_ extends Thread
    {
        public PrintChar_(StringBuilder sb){ *//*this.sb=sb; this.TreadID= TreadID*//*}
        PrintChar_ myt= new PrintChar_(sb);
       // PrintChar_ myt2= new PrintChar_(sb);
       // PrintChar_ myt3= new PrintChar_(sb);
        PrintChar_[] treads= new PrintChar_[]{
                (PrintChar_) new Thread(myt),
                (PrintChar_) new Thread(myt),
                (PrintChar_) new Thread(myt),
        };

       // Thread t1
        //Thread t2= new Thread(myt2);
        //Thread t3= new Thread(myt3);
        @Override
        public  void run(){
            synchronized (sb){
            for(int i=0;i<100;i++){
                System.out.print(sb);
               // System.out.println(Thread.currentThread());
                System.out.println();
                char chars = sb.charAt(0);
                sb.setCharAt(0,++chars);
            }}
            for(PrintChar_ thread: treads ){thread.start();}
            //t1.run();
           // t2.run();
            //t3.run();
        }


    }
        ArrayList<PrintChar_> printChar=new ArrayList<>();
        for(int i=0;i<10;i++){
            printChar.add(new PrintChar_(sb));
        }
        printChar.forEach(Thread::start);
}*/

    static Scanner in=new Scanner(System.in);
      static Integer s;

    public static   class Task3 {
        static Integer  sr=(int) (Math.random() * 10);
        public static Vector<Integer>vector=new Vector(sr);
        public static void zapolnenie() {
            System.out.println("Vector's size : "+sr);

            for (int i = 0; i < vector.capacity(); i++) {
                vector.add(i, 0);
                System.out.println(vector + " to position: " + i);
            }
            Task3.WriteThread write = new Task3.WriteThread();
            Task3.ReadThread read = new Task3.ReadThread();
            Thread TWrite = new Thread(write);
            Thread TRead = new Thread(read);
            TWrite.start();
            TRead.start();

        }

         static class WriteThread extends Thread {
            public void run() {
                for (int i = 0; i < sr; i++) {
                    Integer r = 1 + (int) (Math.random() * 100);
                    vector.set(i, r);
                    System.out.println("Write: " + r + " to position " + i);
                }
            }
        }

         static class ReadThread extends Thread {
            public void run() {
                try {
                    Thread.sleep(10000);
                    System.out.println(vector);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < sr; i++) {
                    System.out.println("Read: " + vector.get(i) + " from position " + i);
                }
            }
        }
    }

    public static void task4()
    {System.out.println("enter the num of work's threads ");
        s=in.nextInt();
        System.out.println("enter the length for massiv");
       Integer s1=in.nextInt();
        int massivShella[]= new int[s1];
        Thread mainThread = new Thread(new Runnable() {
            public void run()
            {System.out.println("main поток");
                System.out.println("the nums for massiv");
                for (int i = 0; i < s1; i++) {
                   massivShella[i] = (int)(Math.random() * 100);
                    System.out.print(massivShella[i] + " ");
                }

            }

            });
        mainThread.run();

        List<Thread> ThreadList = new ArrayList <Thread> ();
        for (int i = 0; i < s; i++) {
            ThreadList.add(new Thread("Thread #" + i) {
                @Override
                public void run() {
                    System.out.println(getName() + " was activated");
                    int step = s1 / 2;
                    try {
                        Thread.sleep(10000);
                        while (step > 0) {
                            for (int i = 0; i < (s1 - step); i++) { int j = i;
                                while (j >= 0 && massivShella[j] > massivShella[j + step])
                                { int temp = massivShella[j];
                                    massivShella[j] = massivShella[j + step];
                                    massivShella[j + step] = temp;
                                    j--;
                                }
                            }step = step / 2;
                        }
                    }
                    catch (Exception e) {}
                }});
        }
        System.out.println("\nThreads in list: ");
        for (Thread currentThread : ThreadList) { currentThread.run(); }
// Выводим отсортированный массив
        for (int i = 0; i < s1; i++) { System.out.print(massivShella[i] + " "); }
    }

}

