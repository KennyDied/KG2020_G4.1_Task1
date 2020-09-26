package ru.vsu.cs.kg2020.danila.objects_on_picture;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public  class RandomTree {

    public static ArrayList<Tree> Trees(int numOfTrees) {
        ArrayList<Tree> arrayOfTree = new ArrayList<>();

        for (int i = 0; i < numOfTrees; i++) {
            double randomWidthOfStump = rndDoubleNumberInRange(0.011, 0.0167);
            double heightOfLeaves = rndDoubleNumberInRange(0.142, 0.39);
            double distanceBetweenTrees = (10 / numOfTrees) * 0.1;

            double y = rndDoubleNumberInRange(0.7, 0.75);
            double h = rndDoubleNumberInRange(0.25, 0.5);
            double w = rndDoubleNumberInRange(0.2, distanceBetweenTrees);

            int randomStumpColorR = 255;
            int randomStumpColorG = rndNumberInRange(0, 150);
            int randomStumpColorB = rndNumberInRange(0, 1);

            int randomLeavesColorR = rndNumberInRange(0, 205);
            int randomLeavesColorG = 255;
            int randomLeavesColorB = rndNumberInRange(0, 140);

            Color c[] = {new Color(randomStumpColorR, randomStumpColorG, randomStumpColorB), new Color(randomLeavesColorR, randomLeavesColorG, randomLeavesColorB)};

            arrayOfTree.add(new Tree(w, h, distanceBetweenTrees * i + 0.025, y, randomWidthOfStump, heightOfLeaves, c));
        }
        return arrayOfTree;
    }

    static int rndNumberInRange(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    static double rndDoubleNumberInRange(double min, double max) {
        double random = new Random().nextDouble();
        random = Math.round(random * 100) * 0.01;
        return (min + (random * (max - min)));
    }
}