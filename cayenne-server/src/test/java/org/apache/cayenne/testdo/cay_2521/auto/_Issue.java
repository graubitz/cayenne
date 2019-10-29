package org.apache.cayenne.testdo.cay_2521.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.cay_2521.Location;
import org.apache.cayenne.testdo.cay_2521.Team;

/**
 * Class _Issue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Issue extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<Location> LOCATION = Property.create("location", Location.class);
    public static final Property<Team> HOME_TEAM = Property.create("homeTeam", Team.class);


    protected Object location;
    protected Object homeTeam;

    public void setLocation(Location location) {
        setToOneTarget("location", location, true);
    }

    public Location getLocation() {
        return (Location)readProperty("location");
    }

    public void setHomeTeam(Team homeTeam) {
        setToOneTarget("homeTeam", homeTeam, true);
    }

    public Team getHomeTeam() {
        return (Team)readProperty("homeTeam");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "location":
                return this.location;
            case "homeTeam":
                return this.homeTeam;
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
            case "location":
                this.location = val;
                break;
            case "homeTeam":
                this.homeTeam = val;
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
        out.writeObject(this.location);
        out.writeObject(this.homeTeam);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.location = in.readObject();
        this.homeTeam = in.readObject();
    }

}