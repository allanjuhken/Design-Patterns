package behavioral.iterator.exercise;

public class UserIterator implements Iterator {
    User users[] = {new User("robi"), new User("ummi"), new User("tuut")};
private int index;


    @Override
    public boolean hasNext() {
        if (index < users.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()){
            return users[index++];
        }
        return null;
    }
}
