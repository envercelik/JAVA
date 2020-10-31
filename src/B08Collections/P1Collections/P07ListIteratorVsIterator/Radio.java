package B08Collections.P1Collections.P07ListIteratorVsIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Radio implements Iterable<String>{

    private ArrayList<String> channels = new ArrayList<>();

    public Radio(String[] channels) {

        for (String channel : channels) {
            this.channels.add(channel);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new RadioIterator();
    }





    class RadioIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {

            if (index < channels.size()) {
                return true;
            }
            else {
                return false;
            }

        }

        @Override
        public String next() {

            String value = channels.get(index);
            index++;
            return  value;


        }
    }



}
