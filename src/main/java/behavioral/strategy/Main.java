package behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();

        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        ArrayList<File> fileList = new ArrayList<>();
        File file = new File("test");
        fileList.add(file);
        System.out.println(ctx.createArchive(fileList));

        ctx.setCompressionStrategy(new RarCompressionStrategy());
        System.out.println(ctx.createArchive(fileList));

        ctx.setCompressionStrategy(new SevenCompressionStrategy());
        System.out.println(ctx.createArchive(fileList));

        ctx.setCompressionStrategy(new MyCustomizedCompressionStrategy());
        System.out.println(ctx.createArchive(fileList));
    }
}
