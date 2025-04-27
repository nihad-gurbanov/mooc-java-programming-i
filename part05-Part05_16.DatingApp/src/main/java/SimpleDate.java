
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        advance(1);
    }

    public void advance(int howManyDays) {

        int dayIncrement = howManyDays % 30;
        int monthIncrement = howManyDays / 30;

        day += dayIncrement;
        if (day > 30) {
            day -= 30;
            month += 1;
        }

        month += monthIncrement;
        if (month > 12) {
            year += month/12;
            month = month % 12;
            
            if (month == 0) {
                month = 12;
                year -= 1;
            }           
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate afterDate = new SimpleDate(day, month, year);
        afterDate.advance(days);

        return afterDate;
    }

}
