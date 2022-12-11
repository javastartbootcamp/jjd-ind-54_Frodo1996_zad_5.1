package pl.javastart.task;

public class Quarter {

    public String quarterCheck(int x, int y) {
        String result;
        if (x > 0 && y > 0) {
            result = " leży w I ćwiartce układu współrzędnych";
        } else if (x < 0 && y > 0) {
            result = " leży w II ćwiartce układu współrzędnych";
        } else if (x < 0 && y < 0) {
            result = " leży w III ćwiartce układu współrzędnych";
        } else if (x > 0 && y < 0) {
            result = " leży w IV ćwiartce układu współrzędnych";
        } else if (x == 0 && y > 0 || y < 0) {
            result = " leży na osi Y";
        } else if (x != 0) {
            result = " leży na osi X";
        } else {
            result = " leży na środku układu współrzędnych";
        }
        return result;
    }
}
