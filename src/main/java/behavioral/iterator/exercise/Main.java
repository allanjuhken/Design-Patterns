package behavioral.iterator.exercise;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        for (Iterator iterator = userRepository.getIterator(); iterator.hasNext();){
            User user = (User) iterator.next();
            System.out.println(user.getUsername());
        }
    }
}
