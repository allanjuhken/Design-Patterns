package behavioral.memento;

public class FileWriterUtil {

    private String filename;
    private StringBuilder content;

    FileWriterUtil(String file) {
        this.filename = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    void write(String str){
        content.append(str);
    }
    Memento save(){
        return  new Memento(this.filename, this.content);
    }

    void undoToLastSave(Object object)
    {
        Memento memento = (Memento) object;
        this.filename = memento.getFilename();
        this.content= memento.getContent();
    }
}
