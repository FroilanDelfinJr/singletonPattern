package singletonPattern;

public class QueuingSystem {

    private static QueuingSystem instance;
    private int currentQueueNum;

    private QueuingSystem(){
        this.currentQueueNum = 0;
    }

    public static synchronized QueuingSystem getInstance(){
        if (instance == null)
            instance = new QueuingSystem();
        return instance;
    }

    public synchronized int getCurrentQueueNum(){
        System.out.println("Current Queue Number: " + currentQueueNum);
        return currentQueueNum;
    }

    public synchronized void incrementQueueNum(){
        currentQueueNum++;
        System.out.println("Current Queue Number: " + currentQueueNum);
    }

    public synchronized void resetQueueNum(int newQueueNum) {
        currentQueueNum = newQueueNum;
        System.out.println("Queue Reset. Current Queue Number: " + currentQueueNum);
    }
}
