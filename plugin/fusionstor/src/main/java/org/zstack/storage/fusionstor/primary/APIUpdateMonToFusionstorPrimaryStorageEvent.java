package org.zstack.storage.fusionstor.primary;

import org.zstack.header.message.APIEvent;

/**
 * Created by frank on 8/6/2015.
 */
public class APIUpdateMonToFusionstorPrimaryStorageEvent extends APIEvent {
    private FusionstorPrimaryStorageInventory inventory;

    public APIUpdateMonToFusionstorPrimaryStorageEvent() {
    }

    public APIUpdateMonToFusionstorPrimaryStorageEvent(String apiId) {
        super(apiId);
    }

    public FusionstorPrimaryStorageInventory getInventory() {
        return inventory;
    }

    public void setInventory(FusionstorPrimaryStorageInventory inventory) {
        this.inventory = inventory;
    }
}
