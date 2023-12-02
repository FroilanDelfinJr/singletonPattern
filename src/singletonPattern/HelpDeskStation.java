package singletonPattern;

public class HelpDeskStation {
    public static void main(String[] args){

        QueuingSystem queuingSystem = QueuingSystem.getInstance();

        queuingSystem.incrementQueueNum();

        queuingSystem.resetQueueNum(100);

        queuingSystem.getCurrentQueueNum();

    }
}
