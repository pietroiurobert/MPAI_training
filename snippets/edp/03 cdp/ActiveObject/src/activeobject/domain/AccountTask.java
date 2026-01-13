/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activeobject.domain;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author null
 */
public class AccountTask {

    private int amount = 0;
    private BlockingQueue<Runnable> dispatchQueue
            = new LinkedBlockingQueue<>();

    public AccountTask() {
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            try {
                                dispatchQueue.take().run();
                            } catch (InterruptedException e) {
                            }
                        }
                    }
                }
        ).start();
    }

    public void deposit(int sum) throws InterruptedException {
        dispatchQueue.put(
                new Runnable() {
                    @Override
                    public void run() {
                        if (amount + sum > 0) {
                            amount += sum;
                        }
                        System.out.println("deposited " + sum);
                    }
                });
    }

    public void withdraw(int sum) throws InterruptedException {
        dispatchQueue.put(
                new Runnable() {
                    @Override
                    public void run() {
                        if (amount - sum > 0) {
                            amount -= sum;
                        }
                        System.out.println("withdrawn " + sum);
                    }
                });
    }
}
