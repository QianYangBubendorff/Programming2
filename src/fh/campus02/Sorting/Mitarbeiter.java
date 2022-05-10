package fh.campus02.Sorting;

public class Mitarbeiter implements Comparable<Mitarbeiter>{
    private String vname;
    private String zname;
    private int geburstsjahr;

    public Mitarbeiter(String vname, String zname, int geburstsjahr) {
        this.vname = vname;
        this.zname = zname;
        this.geburstsjahr = geburstsjahr;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public int getGeburstsjahr() {
        return geburstsjahr;
    }

    public void setGeburstsjahr(int geburstsjahr) {
        this.geburstsjahr = geburstsjahr;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "vname='" + vname + '\'' +
                ", zname='" + zname + '\'' +
                ", geburstsjahr=" + geburstsjahr +
                '}';
    }

// sort by age ascending
    @Override
    public int compareTo(Mitarbeiter o) {
        if(this.geburstsjahr>o.geburstsjahr){
            return -1;
        }
        else if (this.geburstsjahr<o.geburstsjahr) {
            return 1;
        }
        return 0;
    }


}
