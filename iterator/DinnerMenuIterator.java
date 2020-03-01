import java.util.ArrayList;

/**
 * Since the DinnerMenu has a different type of 
 * array, we have to create an implementation
 * to loop it's elements
 */
public class DinnerMenuIterator implements Iterator<MenuItem> {

    ArrayList<MenuItem> items;
    int position = 0;

    public DinnerMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    public boolean hasNext(){
        if (position < items.size()){
            return true;
        } else {
            return false;
        }
    }

    public MenuItem next(){
        MenuItem returnItem = items.get(position);
        position=position+1;
        return returnItem;
        
    }
}