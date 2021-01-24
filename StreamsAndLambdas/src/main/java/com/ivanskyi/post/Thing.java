package com.ivanskyi.post;

public enum Thing {
    TV("TV", ThingStatus.FRAGILE),
    MOBILE("Mobile phone", ThingStatus.FRAGILE),
    REFRIGIRATOR("Refrigirator", ThingStatus.NOTFRAGILE),
    BOOK("Book", ThingStatus.NOTFRAGILE),
    DESKTOP("Desktop", ThingStatus.NOTFRAGILE);

    String name;
    ThingStatus thingStatus;

    Thing(String name, ThingStatus thingStatus) {
        this.name = name;
        this.thingStatus = thingStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThingStatus getThingStatus() {
        return thingStatus;
    }

    public void setThingStatus(ThingStatus thingStatus) {
        this.thingStatus = thingStatus;
    }
}
