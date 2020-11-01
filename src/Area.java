public class Area {

    int lengthOfRectangle;
    int breathOfRectangle;
    int totalArea;
// no idea what happened to this methods, used ide recommendations


    //question number 6 method
//    void setDim(int length, int breath){
//
//        this.totalArea = length * breath;
//
//    }
//
//     int getArea(){
//
//        return totalArea;
//
//    }

    //question number 7 constructor
    public Area(int length, int breath){

        totalArea = length * breath;

    }

    int returnArea(){

        return totalArea;

    }
}
