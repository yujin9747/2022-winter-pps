public class DayOfYear {
    boolean leapYear;
    int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int year;
    int month;
    int day;

    // string으로 들어온 date로 month와 day를 설정
    private void setDate(String date){
        String[] tokens = date.split("-");
        year = Integer.parseInt(tokens[0]);
        month = Integer.parseInt(tokens[1]);
        day = Integer.parseInt(tokens[2]);
    }

    private boolean checkLeapYear(){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0) {
                    return true;
                }
                else return false;
            }
            return true;
        }
        return false;
    }

    public int getDaysOfYear(String date){
        setDate(date);
        this.leapYear = checkLeapYear();
        if(this.leapYear){
            this.daysOfMonth[1] = 29;
        }
        int days=0;
        for(int i=0; i<month-1; i++) days += daysOfMonth[i];
        days += day;
        return days;
    }
}
