public final class Chunk extends Message {

    private static final long serialVersionUID = 0L;
    
    private final int seq;
    private final byte[] data;
    private final int crc;
    
   
    public Chunk(int seq, byte[] data, int crc) {
        super(MessageType.CHUNK);
        this.seq = seq;
        this.data = data;
        this.crc = crc;
    }

    
    public int getSeq() {
        return seq;
    }

    
    public byte[] getData() {
        return data;
    }

   
    public int getCrc() {
        return crc;
    }
}