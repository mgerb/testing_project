/**
 * Created by Mitchell on 4/15/16.
 */
public class nextDate {


    public nextDate(){

    }


    public static String calculate(int month, int day, int year){

        int tomorrowDay = day, tomorrowMonth = month, tomorrowYear = year;

        if (month < 1 || month > 12){
            return "Invalid Month";
        }

        if (day < 1 || day > 31){
            return "Invalid Day";
        }

        if (year < 1801 || year > 2021){
            return "Invalid Year";
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10){
            if (day < 31){
                tomorrowDay++;
            }
            else {
                tomorrowDay = 1;
                tomorrowMonth++;
            }
        }

        if(month == 4 || month == 6 || month == 9 || month == 11){
            if (day < 30){
                tomorrowDay++;
                tomorrowMonth++;
            }

            else {
                return "Invalid Input Date";
            }
        }

        if (month == 12){
            if (day < 31){
                tomorrowDay++;
            }
            else{
                tomorrowDay = 1;
                tomorrowMonth = 1;

                if(year == 2021){
                    return "Invalid Input Date";
                }
                else {
                    tomorrowYear++;
                }
            }
        }

        if (month == 2){
            if (day < 28){
                tomorrowDay++;
            }
            else if (day == 28){
                if(year % 4 == 0){
                    tomorrowDay = 29;
                }
                else{
                    tomorrowDay = 1;
                    tomorrowMonth = 3;
                }
            }
            else if (day == 29){
                tomorrowDay = 1;
                tomorrowMonth = 3;
            }
            else {
                return "Invalid Input Date";
            }
        }

        return "Date Incremented Successfully";
    }
}
