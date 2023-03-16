package pl.code_cool.solid.zad1_single_resposibility_principle;

public class Email implements IMail{

    @Override
    public void setSender(String sender) {

    }

    @Override
    public void setReceiver(String receiver) {

    }

    @Override
    public void setContent(IContent content) {

        content.getAsString();
    }
}
