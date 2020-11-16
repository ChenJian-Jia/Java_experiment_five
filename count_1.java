package cn.itcast.experiment.five;

public class count_1 {
    public static int count(String srcStr, String findStr) {
        int count = 0;
        int index = 0;
        while ((index = srcStr.indexOf(findStr, index)) != -1) {

            index = index + findStr.length();
            count++; // +1
        }
        return count;
    }
}
