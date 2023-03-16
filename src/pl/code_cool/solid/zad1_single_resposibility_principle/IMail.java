package pl.code_cool.solid.zad1_single_resposibility_principle;

public interface IMail {

    void setSender(String sender);

    void setReceiver(String receiver);

    void setContent(IContent content);
}
