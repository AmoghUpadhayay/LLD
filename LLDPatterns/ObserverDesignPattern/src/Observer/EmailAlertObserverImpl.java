package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String email;
    StockObservable observableObj;

    public EmailAlertObserverImpl(String email, StockObservable observableObj){
        this.email = email;
        this.observableObj = observableObj;
    }
    @Override
    public void update() {
        sendMail(email,"Back in Stock, Hurry Up!!");
    }

    public void sendMail(String email, String message){
        // Send Email Logic
        System.out.println("Mail Sent to"+ email);
    }
}
