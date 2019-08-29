package org.apache.cayenne.testdo.embeddable.auto;

import java.io.Serializable;

import org.apache.cayenne.EmbeddableObject;
import org.apache.cayenne.Persistent;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;

/** 
 * Embeddable class _Embeddable1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually, 
 * since it may be overwritten next time code is regenerated. 
 * If you need to make any customizations, please use subclass. 
 */
public abstract class _Embeddable1 implements EmbeddableObject, Serializable {

    public static final StringProperty<String> EMBEDDED20 = PropertyFactory.createString("embedded20", String.class);
    public static final StringProperty<String> EMBEDDED10 = PropertyFactory.createString("embedded10", String.class);

    // special properties injected by Cayenne
    private Persistent owner;
    private String embeddedProperty;
    
    // declared properties
    protected String embedded20;
    protected String embedded10;

    // lifecycle methods
    protected void propertyWillChange(String property, Object oldValue, Object newValue) {
        if (owner != null && owner.getObjectContext() != null) {
            owner.getObjectContext().propertyChanged(
                    owner,
                    embeddedProperty + "." + property,
                    oldValue,
                    newValue);
        }
    }

    // declared getters and setters
    public void setEmbedded20(String embedded20) {
        propertyWillChange("embedded20", this.embedded20, embedded20);
        this.embedded20 = embedded20;
    }
    public String getEmbedded20() {
        return embedded20;
    }

    public void setEmbedded10(String embedded10) {
        propertyWillChange("embedded10", this.embedded10, embedded10);
        this.embedded10 = embedded10;
    }
    public String getEmbedded10() {
        return embedded10;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "embedded20":
                return this.embedded20;
            case "embedded10":
                return this.embedded10;
            default:
                return null;
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "embedded20":
                this.embedded20 = (String)val;
                break;
            case "embedded10":
                this.embedded10 = (String)val;
                break;
            default:
                throw new IllegalArgumentException("Unknown property: " + propName);
        }
    }
}
