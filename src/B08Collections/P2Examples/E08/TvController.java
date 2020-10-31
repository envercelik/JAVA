package B08Collections.P2Examples.E08;

import java.util.ArrayList;
import java.util.Iterator;

public class TvController implements Iterable<String>{

    private ArrayList<String> channels = new ArrayList<>();


    public void addChannel(String channel) {
        channels.add(channel);
    }

    public void removeChannel(String channel) {
        channels.remove(channel);
    }

    public int getChannelSize() {
        return channels.size();
    }



    @Override
    public Iterator<String> iterator() {
        return new TvControllerIterator();
    }




    class TvControllerIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {

            if (index < channels.size()) {
                return true;
            } else
            {
                return false;
            }
        }



        @Override
        public String next() {
            String channel = channels.get(index);
            index++;
            return channel;
        }
    }

}
