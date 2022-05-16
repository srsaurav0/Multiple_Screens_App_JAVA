package Branch;

public class Branch {
    int p;
    float q;
    String r;
    double dd;

    public Branch(int p, float q, String r, double dd) {
        this.p = p;
        this.q = q;
        this.r = r;
        this.dd = dd;
    }

    public double getDd() {
        return dd;
    }

    public void setDd(double dd) {
        this.dd = dd;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public float getQ() {
        return q;
    }

    public void setQ(float q) {
        this.q = q;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }
}
