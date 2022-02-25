package Learn.Class;

public class Flight {
    int passengers;
    int seats;
    Flight(){
        seats = 150;
        passengers =0;
    }
    //A constructor is always executed whenever a new object is created.
    /*
    A Class can contain
    Fields which store objects State
    Methods which are the executable code that manipulate state and performs operations
    Constructors - Executable code used during object creation to set initial state.
     */

    void add1passenger(){
        if(passengers < seats){
            passengers += 1;
        }
    }
}
