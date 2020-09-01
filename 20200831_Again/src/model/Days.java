package model;

public class Days {
    private String day;
    private int date;
    private int month;
    private int year;

    public Days(int month, int date, int year, int day) {
        this.month = month;
        this.date = date;
        this.year = year;
        setDay(day);
    }

    public void setDay(int d) {
        switch (d) {
            case 1:
                this.day = "Sun";
            case 2:
                this.day = "Mon";
            case 3:
                this.day = "Tue";
            case 4:
                this.day = "Wed";
            case 5:
                this.day = "Thu";
            case 6:
                this.day = "Fri";
            case 7:
                this.day = "Sat";
            default:
                this.day = "";
        }
    }



    public void display() {
        System.out.println(this.month + "/" + this.date + "/" + this.year + " " + this.day);
    }

}
