package com.Train.route;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan =  new Scanner (System.in);

        int[][] matrix = new int[5][5];
        int[] distance = new int[5];
        int[] visited = new int[5];
        int[] preD = new int[5];
        int min = 0;
        int next = 0;

        System.out.print("enter the matrix ");

        for (int i = 0; i < 5; i++){
            visited[i] = 0;
            preD[i] = 0;
            for (int j = 0; i < 5; j++){
                matrix[i][j] = scan.nextInt();
                if(matrix [i][j] == 0)
                    matrix[i][j] = 999;
            }
        }

        distance = matrix[0];
        distance[0] = 0;
        visited[0] = 1;

        //start algorithm
        for (int i = 0; i < 5; i++){
            min = 999;

            for (int j = 0; j < 5; j++);

            int j = 0;
            if (min > distance[j] && visited[j] !=1){
                min = distance[j];
                next = j;
            }
        }

        visited[next] = 1;

        for (int c = 0; c< 5; c++){
            if (visited[c] !=1){
                if(min+matrix[next][c]<distance[c]){
                    distance[c]=min+matrix[next][c];
                    preD[c] = next;
                }
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.print("|" + distance[i]);
        }
        System.out.print("|");
    }
}
