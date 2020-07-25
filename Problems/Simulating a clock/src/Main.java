class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
       this.minutes = (this.minutes + 1) % 60;
        if (this.minutes == 0) {
            int hour = (this.hours + 1) % 12;
            this.hours = (hour == 0) ? 12 : hour;
        }
    }
/*
    public void setHours(int hour) {
        this.hours = hour % 12 == 0 ? 12 : (hour) % 12;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    void currentTime() {
        String m;
        if (getMinutes() < 10) {
            m = "0" + getMinutes();
        } else m = String.valueOf(getMinutes());
        System.out.println(getHours() + ":" + m);
    }

    public int getHours() {
        return hours;
    }
}


class Watch {
    public static void main(String[] args) {

        Clock watch = new Clock();

        watch.currentTime(); // 12:00
        watch.next();
        watch.currentTime(); // 12:01
        watch.setHours(14);
        watch.setMinutes(59);
        watch.currentTime(); // 2:59
        watch.next();
        watch.currentTime(); // 3:00
        watch.setHours(0);
        watch.currentTime(); // 12:00
        watch.setMinutes(59);
        watch.currentTime();// 12:59
        watch.next();
        watch.currentTime(); // 1:00

    }*/
}
