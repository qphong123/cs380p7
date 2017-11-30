public final class AckMessage extends Message {

    private static final long serialVersionUID = 0L;

    private final int seq;

   
    public AckMessage(int seq) {
        super(MessageType.ACK);
        this.seq = seq;
    }

    
    public int getSeq() {
        return seq;
    }
}