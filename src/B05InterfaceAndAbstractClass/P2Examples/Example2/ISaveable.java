package B05InterfaceAndAbstractClass.P2Examples.Example2;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
