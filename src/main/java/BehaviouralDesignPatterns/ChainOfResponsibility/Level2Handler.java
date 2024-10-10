package BehaviouralDesignPatterns.ChainOfResponsibility;

public class Level2Handler implements SupportHandler{

    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.INTERMEDIATE){
            System.out.println("Request handled by Level 2 Handler");
        }else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.nextHandler = supportHandler;
    }
}
