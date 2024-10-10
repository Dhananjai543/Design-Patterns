package BehaviouralDesignPatterns.ChainOfResponsibility;

public interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler supportHandler);
}
