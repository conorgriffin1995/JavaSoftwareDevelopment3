/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
 
 
public class TestProducerConsumer {
 
   public static void main(String[] args) throws Exception {
 
       BlockingQueue bq = new ArrayBlockingQueue(1);
 
       Producer producer = new Producer(bq);
       Consumer consumer = new Consumer(bq);
 
       Thread p = new Thread(producer);
       Thread c = new Thread(consumer);
       p.start();
       c.start();
 
       Thread.sleep(4000);
 
   }
}
