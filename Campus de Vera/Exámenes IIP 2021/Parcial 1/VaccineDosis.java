public class VaccineDosis {
    public static final int JANSSEN = 1, ASTRAZENECA = 2, PFIZER = 3;

    private int type;
    private double dosis;
    private TimeInstant prepTime;
    private String sip;

    public VaccineDosis(int type, double dosis, int hours, int minutes,
            String sip) {
        this.type = type;
        this.dosis = dosis;
        this.prepTime = new TimeInstant(hours, minutes);
        this.sip = sip;
    }

    public VaccineDosis() {
        this.type = ASTRAZENECA;
        this.dosis = 0.5;
        this.prepTime = new TimeInstant();
        this.sip = "";
    }

    public boolean equals(Object o) {
        return o instanceof VaccineDosis
                && this.type == ((VaccineDosis) o).type
                && this.dosis == ((VaccineDosis) o).dosis
                && this.prepTime.equals(((VaccineDosis) o).prepTime);
    }

    public int compareTo(VaccineDosis other) {
        int dif = this.type - other.type;
        if (dif == 0) {
            if (this.dosis > other.dosis) { dif = -1; }
            else if (this.dosis < other.dosis) { dif = 1; }
        }
        return (int) Math.signum(dif);
    }

    public String toString() {
        String res = "Vaccine: ";
        switch (type) {
            case JANSSEN:
                res += "Jannsen ";
                break;
            case ASTRAZENECA:
                res += "Astrazeneca ";
                break;
            case PFIZER:
                res += "Pfizer ";
                break;
        }
        res += Math.round(dosis * 10) / 10.0;
        res += " ml. prepared at " + prepTime.toString();
        if (!this.sip.equals("")) {
            res += "injected to SIP = " + sip;
        }
        return res;
    }
}
