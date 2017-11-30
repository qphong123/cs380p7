import java.io.File;



public final class StartMessage extends Message {

    private static final long serialVersionUID = 0L;

    private final String file;
    private final long size;
    private final int chunkSize;
    private final byte[] encryptedKey;
    
    
    public StartMessage(String file, byte[] encryptedKey) {
        this(file, encryptedKey, 1024);
    }
    
    
    public StartMessage(String file, byte[] encryptedKey, int chunkSize) {
        super(MessageType.START);
        this.file = file;
        this.size = new File(file).length();
        this.chunkSize = chunkSize;
        this.encryptedKey = encryptedKey;
    }
    
    
    public String getFile() {
        return file;
    }
    
    
    public long getSize() {
        return size;
    }
    
   
    public int getChunkSize() {
        return chunkSize;
    }
    
   
    public byte[] getEncryptedKey() {
        return encryptedKey;
    }
}