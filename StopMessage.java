public final class StopMessage extends Message {

    private static final long serialVersionUID = 0L;

    private final String file;
    
    
    public StopMessage(String file) {
        super(MessageType.STOP);
        this.file = file;
    }
    
    
    public String getFile() {
        return file;
    }
}