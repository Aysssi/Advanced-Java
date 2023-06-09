package LabStacksAndQueues;

import java.util.*;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] names = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kids = new PriorityQueue<>();
        Collections.addAll(kids, names);

        int currentNumber = 1;

        while (kids.size() > 1) {
            for (int i = 1; i < number; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }
            if (isPrime(currentNumber)) {
                System.out.println("Prime " + kids.peek());
            } else {
                String removedKid = kids.poll();
                System.out.println("Removed " + removedKid);
            }
            currentNumber++;
        }
        System.out.println("Last is " + kids.poll());
    }
    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



}
