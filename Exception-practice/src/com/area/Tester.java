package com.area;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> areas = new ArrayList<>();
        ArrayList<String> postCodes = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("data.txt"));
            String line = in.readLine();
            String lastCity = "";
            while (line != null) {
                System.out.println(line);
                String[] token = line.split(",");
                if (!token[0].equals(lastCity)){
                    lastCity = token[0];
                     cities.add(lastCity);
                }
                areas.add(token[1]);
                postCodes.add(token[2]);
                line = in.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(cities);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose city:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(i + " : " + cities.get(i));
        }
        int cityId = Integer.parseInt(scanner.nextLine());
        System.out.println(cityId);
    }
}
