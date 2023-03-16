package pl.code_cool.solid.zad4_interface_segregation_principle;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();

        IWorker worker = new Worker();
        IWorkable iWorkable = worker;
        IFeedable iFeedable = worker;

        manager.setWorker(worker);
        manager.manage();

        manager.setWorker(iWorkable);
        manager.manage();
    }
}
