import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class CounterBean implements Serializable {
    private int count;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    public CounterBean() {
        this.count = 0;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int newCount) {
        int oldCount = this.count;
        this.count = newCount;
        pcs.firePropertyChange("count", oldCount, newCount);
    }
    
    public void increment() {
        setCount(count + 1);
    }
    
    public void decrement() {
        setCount(count - 1);
    }
    
    // Methods to manage property change listeners
    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}