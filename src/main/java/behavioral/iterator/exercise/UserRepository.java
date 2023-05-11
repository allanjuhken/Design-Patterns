package behavioral.iterator.exercise;

public class UserRepository implements Container {

    @Override
    public Iterator getIterator() {
        return new UserIterator();
    }
}
