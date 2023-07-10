package bai3;
import java.util.*;

public class Main {
    public static double caculateDistance(double[] x, double[] y){
        double dis = Math.sqrt((x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]));
        return dis;
    }
    public static double caculateTotalDistance(double[] currentCity, double[][] coordinate2D){
        double totalDistance = 0;
        for(int i = 0; i < 5; i++){
            totalDistance = totalDistance + caculateDistance(currentCity, coordinate2D[i]);
        }

        return totalDistance;
    }

    public static int findMinimumIndex(double[] totalDistance){
        int index = 0;
        double minvalue = totalDistance[0];
        for(int i = 0; i < 5; i++){
            if (minvalue >= totalDistance[i]){
                minvalue = totalDistance[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] coordinate = sc.nextLine().split(" ");

        double[][] coordinate2D = new double[5][2];
        int index = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 2; j++){
                coordinate2D[i][j] = Double.parseDouble(coordinate[index]);
                index ++;
            }
        }

        double[] totalDistance = new double[5];
        for(int i = 0; i < 5; i ++){
            totalDistance[i] = caculateTotalDistance(coordinate2D[i], coordinate2D);
        }

        int indexMinimum = findMinimumIndex(totalDistance);
        double[] coorMinimum = coordinate2D[indexMinimum];
        double totalDistanceMinimum = totalDistance[indexMinimum];
        System.out.println(String.format("The central city is at (%s, %s)",coorMinimum[0], coorMinimum[1]));
        System.out.println(String.format("The total distance to all other cities is %s", totalDistanceMinimum));

        for(int i = 0; i < coordinate2D.length; i++){
            for(int j = 0; j < coordinate2D[i].length; j ++){
                System.out.println(coordinate2D[i][j] + " ");
            }

        }










    }
}
