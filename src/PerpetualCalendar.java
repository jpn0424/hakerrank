import java.util.Scanner;

public class PerpetualCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************歡迎使用萬年曆**************************");
        System.out.println("*********請選擇你需要進行的操作（輸入進行操作之前的數位）************");
        System.out.println("********************1.查詢某年某月的日曆************************");
        System.out.println("********************2.結束操作********************************");
        System.out.print("請選擇你需要進行的操作：");

        int a = scanner.nextInt();
        while (true) {
            switch (a) {
                case 1:
                    System.out.print("請選擇年份：");
                    int year = scanner.nextInt();
                    System.out.print("請選擇月份：");
                    int month = scanner.nextInt();
                    printCalendar(month, year);
                    System.out.print("\n請選擇你需要進行的操作：");
                    a = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("退出程式成功！");
                    return;
            }
        }
    }

    //每個月的天數
    public static int monthday(int month, int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            int[] day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return day[month];
        } else {
            int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return day[month];
        }
    }

    //月份總天數
    public static int monthdays(int month, int year) {
        int totaldays = 0;
        for (int i = 1; i < month; i++) {
            totaldays = totaldays + monthday(i, year);
        }
        return totaldays;
    }

    //距離1900年的年份總天數
    public static int yeardays(int year) {
        int yeardays = 0;
        for (int i = 1900; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                yeardays = yeardays + 366;
            } else {
                yeardays = yeardays + 365;
            }
        }
        System.out.println(year + "年距離1900年的總天數" + yeardays);
        return yeardays;
    }

    //輸出日曆
    public static void printCalendar(int month, int year) {
        int totaldays = 0;
        if (year >=  1900) {
            if (month > 0 && month < 13) {
                //距離1900年1月1日總天數
                totaldays = monthdays(month, year) + yeardays(year);
                System.out.println(year + "年" + month + "月1日距離1900年的總天數:" + totaldays);
                System.out.println("**********" + year + "年" + month + "月的日曆為**********");
                System.out.println("一\t二\t三\t四\t五\t六\t日\t");
                int week = 1 + totaldays % 7;
                //根據1日為周幾輸出空格
                for (int i = 1; i < week; i++) {
                    System.out.print(" \t");
                }
                //輸入具體日期
                for (int i = 1; i <= monthday(month, year); i++) {
                    System.out.print(i + "\t");
                    if (week == 7) {
                        week = 1;//重置為星期一
                        System.out.println();
                    } else {
                        week++;
                    }
                }
            } else {
                System.out.println("輸入的月份不合法！");
            }
        } else {
            System.out.println("輸入的年份不合法！");
        }
    }
}