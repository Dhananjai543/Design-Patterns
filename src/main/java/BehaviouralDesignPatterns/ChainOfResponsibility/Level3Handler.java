package BehaviouralDesignPatterns.ChainOfResponsibility;

public class Level3Handler implements SupportHandler{

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.ADVANCED) {
            System.out.println("Request handled by Level 3 Handler");
        } else {
            System.out.println("Request cannot be handled");
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        //no next handler for level 3
    }
}
