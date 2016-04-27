/**
 * Created by Mitchell on 4/15/16.
 */
public class nextDate {

    public int day, month, year;

    public nextDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //function to run the test case for this object
    public void run(){

        boolean valid = true;

        System.out.printf("%s %10d %10d %10d %10s", "Testing: ", month, day, year, "");

        int tomorrowDay = day, tomorrowMonth = month, tomorrowYear = year;

        if (month < 1 || month > 12){
            System.out.printf("%s %32s %20s %20s", "Output: ", "Invalid Month", "_______________", "_______________");
        }
        else if (day < 1 || day > 31){
            System.out.printf("%s %32s %20s %20s", "Output: ", "Invalid Day", "_______________", "_______________");
        }
        else if (year < 1801 || year > 2021){
            //System.out.printf("%s %10d %10d %10d %20s", "Output: ", tomorrowMonth, tomorrowDay, tomorrowYear, "_______________\n");
            System.out.printf("%s %32s %20s %20s", "Output: ", "Invalid Year", "_______________", "_______________");
        }
        else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                if (day < 31) {
                    tomorrowDay++;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth++;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day < 30) {
                    tomorrowDay++;
                } else if (day == 30){
                    tomorrowDay = 1;
                    tomorrowMonth++;
                }
                else{
                    System.out.printf("%s %32s %20s %20s", "Output: ", "Invalid Day", "_______________", "_______________");
                    valid = false;
                }
            } else if (month == 12) {
                if (day < 31) {
                    tomorrowDay++;
                } else {
                    tomorrowDay = 1;
                    tomorrowMonth = 1;
                    if (year == 2021) {
                        System.out.printf("%s %32s %20s %20s", "Output: ", "Invalid Year", "_______________", "_______________");
                        valid = false;
                    }
                    else {
                        tomorrowYear++;
                    }
                }
            } else if (month == 2) {
                if (day < 28) {
                    tomorrowDay++;
                } else if (day == 28) {
                    if (isLeapYear(year)) {
                        tomorrowDay = 29;
                    } else {
                        tomorrowDay = 1;
                        tomorrowMonth = 3;
                    }
                } else if (day == 29) {
                    if(isLeapYear(year)){
                        tomorrowDay = 1;
                        tomorrowMonth = 3;
                    }

                }
                else if (day > 29){
                    System.out.printf("%s %32s %20s %20s", "Output: ", "Invalid Day", "_______________", "_______________");
                    valid = false;
                }
            }

            if(valid) {
                System.out.printf("%s %10d %10d %10d %20s %20s", "Output: ", tomorrowMonth, tomorrowDay, tomorrowYear, "_______________", "_______________");
            }
        }
        System.out.println();

    }

    //function to check if it is a leap year or not
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0);
    }
}
