package com.example;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

class Mail {}

public class ArrayBlockingQueueExample {
    public static Queue<Mail> mailbox = new ArrayBlockingQueue<>(5);
    
    public static void depositMail(int action){
        // While an action has been done to add mail
        while(action > 0){
            // return true that mail has been entered to the queue
            // offer() add a new mail to the queue
            boolean success = mailbox.offer(new Mail());
            if (success) {
                System.out.println("The mailman deposited a mail number: " + action);
            } else {
                System.out.println("The mailman tries to deposit mail number: " + action + ", but mailbox's full!");
            }
            // subtract one from the mailbox to stop the while loop
            action--;
        }
    }

    public static void ownerGetsMail(int action) {
        int mailNumber = 1;
        while (action > 0) {
            // when the owner gets a mail, subtract 1 from the mail
            action--;
            // if the mailbox is not empty
            if (mailbox.peek() != null) {
                System.out.println("The homeowner picked up a mail item number: " + mailNumber);
                // the mail is retrieved and removed
                //poll() retrieves the head element and removes it
                mailbox.poll();
            } else {
                System.out.println("The homeowner tries to grab some mail, but there isn't any!");
            }
            // add a mail to stop the while loop
            mailNumber++;
        }
    }

    public static void main(String[] args) {
        depositMail(2);
        ownerGetsMail(3);
    }
}

