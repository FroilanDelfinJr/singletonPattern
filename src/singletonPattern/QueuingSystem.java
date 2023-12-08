package singletonPattern;

public class QueuingSystem {

    private static QueuingSystem instance;
    private int currentQueueNum;

    private QueuingSystem(){
        this.currentQueueNum = 1;
    }

    public static synchronized QueuingSystem getInstance(){
        if (instance == null)
            instance = new QueuingSystem();
        return instance;
    }

    public synchronized int getCurrentQueueNum(){
        System.out.println("\tCurrent Queue Number: " + currentQueueNum);
        return currentQueueNum;
    }

    public synchronized void incrementQueueNum(){
        currentQueueNum++;
        System.out.println("\tCurrent Queue Number: " + currentQueueNum);
    }

    public synchronized void resetQueueNum(int newQueueNum) {
        currentQueueNum = newQueueNum;
        System.out.println("\tQueue Reset. Current Queue Number: " + currentQueueNum);
    }
}
