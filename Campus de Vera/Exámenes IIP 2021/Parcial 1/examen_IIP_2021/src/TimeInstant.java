public class TimeInstant {
    private int hours, minutes;

    public TimeInstant() {
        long minTotal = System.currentTimeMillis() / (60 * 1000);
        int minHoy = (int) minTotal % (24 * 60);
        this.hours = minHoy / 60;
        this.minutes = minHoy % 60;
    }

    public TimeInstant(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public boolean equals(Object o) {
        return o instanceof TimeInstant
                && this.hours == ((TimeInstant) o).hours
                && this.minutes ==((TimeInstant) o).minutes;
    }

    public String toString() {
        String hh = "0" + hours;
        hh = hh.substring(hh.length() - 2);
        String mm = "0" + minutes;
        mm = mm.substring(mm.length() - 2);
        return hh + ":" + mm;
    }
}
