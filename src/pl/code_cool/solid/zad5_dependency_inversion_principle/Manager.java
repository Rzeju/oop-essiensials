package pl.code_cool.solid.zad5_dependency_inversion_principle;

public class Manager {

    private IWorker worker;

    public void setWorker(IWorker worker) {
        this.worker = worker;
    }

    public void manage() {
        worker.work();
    }
}
