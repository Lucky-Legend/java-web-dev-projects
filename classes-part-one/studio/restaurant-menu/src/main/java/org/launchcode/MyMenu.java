package org.launchcode;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.Date;

public class MyMenu {
    private Date updated;
    private ArrayList<MyMenuItem> items = new ArrayList<>();

    public MyMenu(Date updated, ArrayList<MyMenuItem> items) {
        this.updated = updated;
        this.items = items;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    public void setItems(ArrayList<MyMenuItem> items) {
        this.items = items;
    }

    public Date getUpdated() {
        return updated;
    }
    public ArrayList<MyMenuItem> getItems() {
        return items;
    }
}
