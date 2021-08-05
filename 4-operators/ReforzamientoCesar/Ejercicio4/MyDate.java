import java.util.Objects;

class MyDate {
    private int day;
    private int month;
    private int year;

    //Missing constructor. Inicializar objeto.
    public MyDate(int date, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }




    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //cambiar por instance of
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }




}
