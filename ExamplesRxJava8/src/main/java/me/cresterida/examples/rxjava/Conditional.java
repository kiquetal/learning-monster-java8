/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.cresterida.examples.rxjava;

import rx.Observable;
import rx.subjects.PublishSubject;

/**
 *
 * @author kiquetal
 */
public class Conditional {
    
    
    
    public static void main(String args[]) throws InterruptedException
    {
        
        DummyThread dm1=new DummyThread(50L,"first");
        DummyThread dm2=new DummyThread(100L,"second");
        
        Observable.amb(dm1.getObs(),dm2.getObs())
                .subscribe((s)->{
                    System.out.println("I can identify"+s);
                });
        
        
        dm1.start();
        dm2.start();
        Thread.sleep(3000);
        dm1.stop();
        dm2.stop();
        
    }
    
    
}

class DummyThread
{
    private PublishSubject<Long> subject;
    private final Long waitMilis;
    private Thread wrapperThread;
        private long lastTick;
        private final String name;
        private volatile boolean paused=false;
    private final Long startTime;
    public DummyThread(long waitMilis,String name)
    {
        this.waitMilis=waitMilis;
        this.name=name;
        this.startTime=System.currentTimeMillis();
        subject=PublishSubject.create();
    }
    
  
 public synchronized void start() {

        if (wrapperThread != null) {
            return; // No active thread.
        }

        lastTick = System.currentTimeMillis();

        paused = false;

        wrapperThread = new Thread(() -> {

            try {
                while (Thread.interrupted() == false) {
                    Thread.sleep(5);

                    if (paused) {
                        continue;
                    }

                    // Get the current time
                    long currentTime = System.currentTimeMillis();
                    if (currentTime - lastTick > waitMilis) {
                        lastTick = currentTime;
                     
                        subject.onNext(lastTick);
                                
                    }
                    else
                    {
                        System.out.println("lolNO"+Thread.currentThread().getName());
                    }
                }
            } catch (InterruptedException e) {
            } catch (Throwable t) {
                subject.onError(t);
            }

            subject.onCompleted();

        }, "TimedEventSequence Thread"+this.name);
        wrapperThread.start();
    }

    public synchronized void stop() throws InterruptedException
    {
        wrapperThread.interrupt();
        System.out.println("interrupt!!!");
        wrapperThread.join();
        wrapperThread=null;
    }
    public Observable<Long> getObs()
    {
        return this.subject;
    }
    
    
    
    
}