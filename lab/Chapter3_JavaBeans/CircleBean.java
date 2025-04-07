import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;

public class CircleBean implements Serializable {
    private double radius;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private final VetoableChangeSupport vcs = new VetoableChangeSupport(this);
    
    public CircleBean() {
        this.radius = 1.0; // Default radius
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double newRadius) throws PropertyVetoException {
        double oldRadius = this.radius;
        
        // First notify veto listeners
        vcs.fireVetoableChange("radius", oldRadius, newRadius);
        
        // If no exception was thrown, proceed with change
        this.radius = newRadius;
        pcs.firePropertyChange("radius", oldRadius, newRadius);
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    
    // Methods for property change listeners
    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
    
    // Methods for vetoable change listeners
    public void addVetoableChangeListener(java.beans.VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }
    
    public void removeVetoableChangeListener(java.beans.VetoableChangeListener listener) {
        vcs.removeVetoableChangeListener(listener);
    }
}