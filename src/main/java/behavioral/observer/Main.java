package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();
        Observer obj1 = new MyTopicSubscriber("obj1");
        Observer obj2 = new MyTopicSubscriber("obj2");
        Observer obj3 = new MyTopicSubscriber("obj3");
        Observer obj4 = new MyTopicSubscriber("obj4");
        // register objeksts to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        topic.register(obj4);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);
        obj4.setSubject(topic);

        //check if any update is available
        obj1.update();
        //send message to subject
        topic.postMessage("New message received");
        obj1.update();

        topic.postMessage("New message received2");
    }
}
