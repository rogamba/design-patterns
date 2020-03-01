import java.util.ArrayList;

/**
 * Morning menu has a different collection type than
 * the Dinner menu. Iterators help dealing with that
 */
public class MorningMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public MorningMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public boolean hasNext(){
        if (position < items.length && items[position] != null){
            return true;
        } else {
            return false;
        }
    }

    public MenuItem next(){
        MenuItem returnItem = items[position];
        position = position+1;
        return returnItem;
        
    }
}