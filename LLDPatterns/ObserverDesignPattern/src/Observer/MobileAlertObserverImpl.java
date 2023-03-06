package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    StockObservable observableObj;
    String id;

    public MobileAlertObserverImpl(String id, StockObservable observableObj){
        this.id = id;
        this.observableObj = observableObj;
    }
    @Override
    public void update() {
        sendMsg(id,"Product in stock. Hurry Up! ");
    }

    public void sendMsg(String id,String msg){
        // Send mail logic
        System.out.println("Mail Sent to"+ id);
    }
}
