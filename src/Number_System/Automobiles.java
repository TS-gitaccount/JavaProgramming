//An automobile company manufactures Wheeler (TW) and a four-conceler (FW).
//A company manager wants to make the production of both types df vehicle
//according to the given data below
//data: Total number of wheels = W
//data: Total number of vehicles =v
//The task is to find how many two wheelers as well as four-wheelers
//need to be manufactured as per the given

//tv= v*4-w/2

package Number_System;

public class Automobiles {
    static void main(String[] args) {
        int v=57;
        int w=184;
        vehicles(v,w);
    }

    private static void vehicles(int v, int w) {
        if(v<w && w%2==0){
            int tw=(v*4-w)/2;
            int fw=v-tw;
            System.out.println("Four wheeler : "+fw);
            System.out.println("Two wheeler : "+tw);

        }
    }
}
