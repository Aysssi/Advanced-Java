package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String > printQueue = new ArrayDeque<>();

       String inputData = scanner.nextLine();
       while (!inputData.equals("print")){

         if (inputData.equals("cancel")){
             if (!printQueue.isEmpty()){
                 System.out.println("Canceled " + printQueue.poll());

             }else  {
                 System.out.println("Printer is on standby");

             }
         }else {
             printQueue.offer(inputData);
         }

           inputData = scanner.nextLine();
       }

       while (!printQueue.isEmpty()){
           System.out.println(printQueue.poll());
       }
    }
}
