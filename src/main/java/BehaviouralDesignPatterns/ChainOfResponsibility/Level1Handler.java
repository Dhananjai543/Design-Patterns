package BehaviouralDesignPatterns.ChainOfResponsibility;

public class Level1Handler implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.BASIC) {
            System.out.println("Request handled by Level 1 Handler");
        } else if (nextHandler!=null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.nextHandler = supportHandler;
    }
}
