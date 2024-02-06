public class NODE {

    private double coff; //co-efficient
    private  double exp; //exponent
    private NODE next;


    public NODE(double coff, double exp) {
        this.coff = coff;
        this.exp = exp;
        this.next=null;
    }

    public double getCoff() {
        return coff;
    }

    public void setCoff(double coff) {
        this.coff = coff;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public NODE getNext() {
        return next;
    }

    public void setNext(NODE next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" + coff + "," + exp + "}" ;
    }
}
