package org.horizoncolumbus.hs;

public class TechDistribution {

    public static void main(String[] args) {
        boolean Junior = false;
        boolean Senior = false;
        boolean CTE = false;
        boolean Teacher = false;
        boolean admin = true;
        boolean home =  true;

        if(Junior || Senior && CTE){
            System.out.println("You get windows laptop");
        }
        else if (Teacher || admin && home){
            System.out.println("you get macbook");
        }
        else{
            System.out.println("chromebook for you");
        }
    }
}
