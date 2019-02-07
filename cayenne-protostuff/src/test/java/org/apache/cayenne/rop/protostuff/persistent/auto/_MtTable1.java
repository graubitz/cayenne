package org.apache.cayenne.rop.protostuff.persistent.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.rop.protostuff.persistent.MtTable2;

/**
 * Class _MtTable1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MtTable1 extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String TABLE1_ID_PK_COLUMN = "TABLE1_ID";

    public static final DateProperty<LocalDate> DATE_ATTRIBUTE = PropertyFactory.createDate("dateAttribute", LocalDate.class);
    public static final StringProperty<String> GLOBAL_ATTRIBUTE = PropertyFactory.createString("globalAttribute", String.class);
    public static final DateProperty<Date> OLD_DATE_ATTRIBUTE = PropertyFactory.createDate("oldDateAttribute", Date.class);
    public static final StringProperty<String> SERVER_ATTRIBUTE = PropertyFactory.createString("serverAttribute", String.class);
    public static final DateProperty<LocalTime> TIME_ATTRIBUTE = PropertyFactory.createDate("timeAttribute", LocalTime.class);
    public static final DateProperty<LocalDateTime> TIMESTAMP_ATTRIBUTE = PropertyFactory.createDate("timestampAttribute", LocalDateTime.class);
    public static final ListProperty<MtTable2> TABLE2ARRAY = PropertyFactory.createList("table2Array", MtTable2.class);

    protected LocalDate dateAttribute;
    protected String globalAttribute;
    protected Date oldDateAttribute;
    protected String serverAttribute;
    protected LocalTime timeAttribute;
    protected LocalDateTime timestampAttribute;

    protected Object table2Array;

    public void setDateAttribute(LocalDate dateAttribute) {
        beforePropertyWrite("dateAttribute", this.dateAttribute, dateAttribute);
        this.dateAttribute = dateAttribute;
    }

    public LocalDate getDateAttribute() {
        beforePropertyRead("dateAttribute");
        return this.dateAttribute;
    }

    public void setGlobalAttribute(String globalAttribute) {
        beforePropertyWrite("globalAttribute", this.globalAttribute, globalAttribute);
        this.globalAttribute = globalAttribute;
    }

    public String getGlobalAttribute() {
        beforePropertyRead("globalAttribute");
        return this.globalAttribute;
    }

    public void setOldDateAttribute(Date oldDateAttribute) {
        beforePropertyWrite("oldDateAttribute", this.oldDateAttribute, oldDateAttribute);
        this.oldDateAttribute = oldDateAttribute;
    }

    public Date getOldDateAttribute() {
        beforePropertyRead("oldDateAttribute");
        return this.oldDateAttribute;
    }

    public void setServerAttribute(String serverAttribute) {
        beforePropertyWrite("serverAttribute", this.serverAttribute, serverAttribute);
        this.serverAttribute = serverAttribute;
    }

    public String getServerAttribute() {
        beforePropertyRead("serverAttribute");
        return this.serverAttribute;
    }

    public void setTimeAttribute(LocalTime timeAttribute) {
        beforePropertyWrite("timeAttribute", this.timeAttribute, timeAttribute);
        this.timeAttribute = timeAttribute;
    }

    public LocalTime getTimeAttribute() {
        beforePropertyRead("timeAttribute");
        return this.timeAttribute;
    }

    public void setTimestampAttribute(LocalDateTime timestampAttribute) {
        beforePropertyWrite("timestampAttribute", this.timestampAttribute, timestampAttribute);
        this.timestampAttribute = timestampAttribute;
    }

    public LocalDateTime getTimestampAttribute() {
        beforePropertyRead("timestampAttribute");
        return this.timestampAttribute;
    }

    public void addToTable2Array(MtTable2 obj) {
        addToManyTarget("table2Array", obj, true);
    }

    public void removeFromTable2Array(MtTable2 obj) {
        removeToManyTarget("table2Array", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<MtTable2> getTable2Array() {
        return (List<MtTable2>)readProperty("table2Array");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "dateAttribute":
                return this.dateAttribute;
            case "globalAttribute":
                return this.globalAttribute;
            case "oldDateAttribute":
                return this.oldDateAttribute;
            case "serverAttribute":
                return this.serverAttribute;
            case "timeAttribute":
                return this.timeAttribute;
            case "timestampAttribute":
                return this.timestampAttribute;
            case "table2Array":
                return this.table2Array;
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
            case "dateAttribute":
                this.dateAttribute = (LocalDate)val;
                break;
            case "globalAttribute":
                this.globalAttribute = (String)val;
                break;
            case "oldDateAttribute":
                this.oldDateAttribute = (Date)val;
                break;
            case "serverAttribute":
                this.serverAttribute = (String)val;
                break;
            case "timeAttribute":
                this.timeAttribute = (LocalTime)val;
                break;
            case "timestampAttribute":
                this.timestampAttribute = (LocalDateTime)val;
                break;
            case "table2Array":
                this.table2Array = val;
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
        out.writeObject(this.dateAttribute);
        out.writeObject(this.globalAttribute);
        out.writeObject(this.oldDateAttribute);
        out.writeObject(this.serverAttribute);
        out.writeObject(this.timeAttribute);
        out.writeObject(this.timestampAttribute);
        out.writeObject(this.table2Array);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.dateAttribute = (LocalDate)in.readObject();
        this.globalAttribute = (String)in.readObject();
        this.oldDateAttribute = (Date)in.readObject();
        this.serverAttribute = (String)in.readObject();
        this.timeAttribute = (LocalTime)in.readObject();
        this.timestampAttribute = (LocalDateTime)in.readObject();
        this.table2Array = in.readObject();
    }

}