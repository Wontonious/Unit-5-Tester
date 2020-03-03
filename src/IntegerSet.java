import java.util.ArrayList;

public class IntegerSet {

    ArrayList<Integer> nums;

    IntegerSet(){
        nums = new ArrayList<>();
    }
    //Requires: int
    //Modifier: This
    //Effects: Insert an integer into a set unless it's already there, in which case do nothing.
    public void insert(Integer num){
        if(!nums.contains(num)){ nums.add(num); } }
    //Requires: int
    //Modifier: This
    //Effects: Removes an integer from a set unless it's not there, in which case do nothing.
    public void remove(Integer num){ nums.remove(num); }
    //Requires:
    //Modifier: this
    //Effects: Checks the size of the integer set
    public int size(){
        return nums.size();
    }
    //Requires: int
    //Modifier: this
    //Effects: Checks for a certain integer in a set
    public boolean contains(Integer num){
        return nums.contains(num);
    }
}
