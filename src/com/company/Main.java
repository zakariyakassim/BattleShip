package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {



    Object grid[][];

    HashMap<Integer, String> map = new HashMap<>();

    int gridSize;
    int index;

    ArrayList<Integer> player;


    public Main(int gridSize){

        this.gridSize = gridSize;

        player();

        grid = new Object[gridSize][gridSize];

        index = 1;



        for (int i = 0; i < grid.length; i++){



            for (int j = 0; j < grid[i].length; j++){


                map.put(index, "█");

                grid[i][j] = index;

               // grid[i][j] = index;



                for (int x = 0; x < player.size(); x++){
                    if (index == player.get(x)) {
                        grid[i][j] = index;

                        map.replace(index, "◯");


                                //"╳";
                    }
                }



                index++;


            }


        }
    }

    public void startGame(){

        drawGrid();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x:");

        int x = input.nextInt();



        System.out.println("Enter y:");
        int y = input.nextInt();




        for (int i = 0; i < gridSize+1; i++) {
            for (int t = 0; t < gridSize+1; t++) {

                if(x==t && y==i) {

                    int position = (int) grid[y - 1][x - 1];

                    System.out.println("Selected position: "+position);

                    for (int f = 0; f < player.size(); f++) {

                      //  System.out.println("postion: " + position + "  selected: " + player.get(f));

                        if (position == player.get(f)) {
                          //  System.out.println("found");
                            map.replace(position, " ");
                            break;

                        } else if (position != player.get(f)) {
                            map.replace(position, "╳");
                          //  System.out.println("missed");

                        }

                    }
                }

            }
        }

      /*  for (int i = 0; i < player.size(); i++) {



            if(ss == player.get(i)) {
                System.out.println("found");
                map.replace(ss, " ");
                break;

            } else if (ss != player.get(i)) {
                map.replace(ss, "╳");
                System.out.println("missed");

            }
        } */

        startGame();


      /*  for (int i = 0; i < grid.length; i++){



            for (int j = 0; j < grid[i].length; j++) {


                if (ss == map.)


            }

            } */



    }

    public void player(){

        player = new ArrayList<>();

        player.add(3);
        player.add(66);
        player.add(67);
        player.add(68);
        player.add(69);
        player.add(5);
        player.add(4);
        player.add(22);
        player.add(33);
        player.add(44);

    }


    public void drawGrid(){


        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println();

        for (int f = 0; f < gridSize+1; f++){
            System.out.printf("%5s",f);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < grid.length; i++){

            System.out.printf("%5s",i+1);

            for (int j = 0; j < grid[i].length; j++){

               // System.out.printf("%5s",grid[i][j]);
                System.out.printf("%5s",map.get(grid[i][j]));
               // System.out.println(grid[i][j]);


            }
            System.out.println();
            System.out.println();
        }




    }

    /*public Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    } */


    public static void main(String[] args) {
        new Main(12).startGame();
       // System.out.println("█");

    }
}
