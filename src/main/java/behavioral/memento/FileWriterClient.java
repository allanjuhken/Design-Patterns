package behavioral.memento;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterCareTaker careTaker = new FileWriterCareTaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");

        fileWriter.write("First set of data\n");
        System.out.println(fileWriter + "\n\n");

        fileWriter.write("Second set of data\n");
        System.out.println(fileWriter + "\n\n");

        careTaker.save(fileWriter);

    }
}
