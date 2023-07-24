
public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("-------------------------------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,24));
        System.out.println("---------------------------------------");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("---------------------------------------");
        System.out.println(rectangleArea(5.0,4.0));
        System.out.println(rectangleArea(-1.0, 4));
        System.out.println("---------------------------------------");
        System.out.println(circleArea(5.0));
        System.out.println(circleArea(-1));

    }

    public static boolean shouldWakeUp(boolean isDogBark, int number) {
        if (!isDogBark) {
            return false;
        } else if (isDogBark && number < 0 || number > 23) {
            return false;
        } else if (isDogBark && number > 20 || number < 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        int[] myNum = {num1, num2, num3};
        for (int j : myNum) {
            if (j >= 13 && j <= 19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying (boolean isSummer, int num) {
        if(isSummer && num >= 25 && num <= 45) {
            return true;
        } else if (!isSummer && num >=25 && num <= 35) {
            return true;
        }else {
            return false;
        }
    }

    public static double rectangleArea (double num1, double num2) {

        if ( num1 < 0 || num2 < 0 ) {
            return -1;
        }

        return num1 * num2;
    }

    public static double circleArea (double radious) {
        if(radious < 0) {
            return -1;
        }
        return radious * radious * Math.PI;
    }

}