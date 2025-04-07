import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TestCounterBean {
    public static void main(String[] args) {
        CounterBean counter = new CounterBean();
        
        // Add listener
        counter.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Counter changed from " + evt.getOldValue() + 
                                 " to " + evt.getNewValue());
            }
        });
        
        // Test operations
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.setCount(10);
    }
}