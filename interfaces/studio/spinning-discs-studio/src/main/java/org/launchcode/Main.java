package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD theNorthBorders = new CD("The North Borders", true);
        CD graphicDesignProjects = new CD("Graphic Design Projects");
        DVD friendsSeason3 = new DVD("Friends: Season 3");

        File firstFires = new File("First Fires", 50);
        File cirrus = new File("Cirrus", 61);
        File transit = new File("Transit", 57);
        theNorthBorders.writeFile(firstFires);
        theNorthBorders.writeFile(cirrus);
        theNorthBorders.writeFile(transit);

        File festivalPoster = new File("festival-poster.psd", 240);
        File companyLogo = new File("company-logo.ai", 52);
        graphicDesignProjects.writeFile(festivalPoster);
        graphicDesignProjects.writeFile(companyLogo);

        File s3e1 = new File("S3:E1 - The One With the Princess Leia Fantasy", 420);
        File s3e2 = new File("S3:E2 - The One Where No One's Ready", 420);
        File s3e3 = new File("S3:E3 - The One With the Jam", 420);
        File s3e4 = new File("S3:E4 - The One With the Metaphorical Tunnel", 420);
        friendsSeason3.writeFile(s3e1);
        friendsSeason3.writeFile(s3e2);
        friendsSeason3.writeFile(s3e3);
        friendsSeason3.writeFile(s3e4);

        System.out.println(theNorthBorders);
        System.out.println(graphicDesignProjects);
        System.out.println(friendsSeason3);

        theNorthBorders.runFile(cirrus);
        graphicDesignProjects.runFile(companyLogo);

        friendsSeason3.writeFile(s3e2);

        graphicDesignProjects.removeFile(festivalPoster);
        theNorthBorders.runFile(festivalPoster);

        theNorthBorders.reformatDisc();
        theNorthBorders.runFile(transit);

        File tooBigFile = new File("too-big-file.mp4", 720);
        theNorthBorders.writeFile(tooBigFile);
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}