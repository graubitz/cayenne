package org.apache.cayenne.testdo.relationships_many_to_many_join.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.testdo.relationships_many_to_many_join.SelfRelationshipSub;

/**
 * Class _SelfRelationship was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SelfRelationship extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String SELF_ID_PK_COLUMN = "SELF_ID";

    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final NumericProperty<Integer> TYPE = PropertyFactory.createNumeric("type", Integer.class);
    public static final ListProperty<SelfRelationshipSub> SELF_CHILDREN = PropertyFactory.createList("selfChildren", SelfRelationshipSub.class);

    protected String name;
    protected int type;

    protected Object selfChildren;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setType(int type) {
        beforePropertyWrite("type", this.type, type);
        this.type = type;
    }

    public int getType() {
        beforePropertyRead("type");
        return this.type;
    }

    public void addToSelfChildren(SelfRelationshipSub obj) {
        addToManyTarget("selfChildren", obj, true);
    }

    public void removeFromSelfChildren(SelfRelationshipSub obj) {
        removeToManyTarget("selfChildren", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<SelfRelationshipSub> getSelfChildren() {
        return (List<SelfRelationshipSub>)readProperty("selfChildren");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "type":
                return this.type;
            case "selfChildren":
                return this.selfChildren;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "name":
                this.name = (String)val;
                break;
            case "type":
                this.type = val == null ? 0 : (int)val;
                break;
            case "selfChildren":
                this.selfChildren = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.name);
        out.writeInt(this.type);
        out.writeObject(this.selfChildren);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.name = (String)in.readObject();
        this.type = in.readInt();
        this.selfChildren = in.readObject();
    }

}
