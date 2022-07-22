package Calendar_Java;

import java.util.Scanner;

public class Date{
    private int monthNum;
    private int year;
    private int dayNum;
    private boolean isDateProper;


    private final String[] monthNames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    private final String[] dayNames = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    
    Date(int dayNum,int monthNum,int year){
        if(monthNum <= 12 && monthNum > 0){
            this.monthNum = monthNum;
        }
        else
            isDateProper = false;

        if(dayNum > 0){
            if(monthNum % 2 == 0 && dayNum <= 31 && monthNum != 2){
                this.dayNum = dayNum;
            }
            else if(monthNum % 2 != 0 && dayNum < 31 && monthNum != 2){
                this.dayNum = dayNum;
            }
            else if(!leapYearCheck(year) && monthNum == 2 && dayNum < 29){
                this.dayNum = dayNum;
            }
            else if(leapYearCheck(year) && monthNum == 2 && dayNum <= 29){
                this.dayNum = dayNum;
            }
        }
        else{
            isDateProper = false;
        }

        this.year = year;
    }


    public boolean leapYearCheck(int year){
        return year % 4 == 0 && (year % 100 == 0 || year % 400 == 0);
    }

    public int getDayNum(){
        return dayNum;
    }

    public int getMonthNum(){
        return monthNum;
    }

    public int getYear(){
        return year;
    }

    public String getMonthName(){
        return monthNames[getMonthNum() - 1];
    }

    
}