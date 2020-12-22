package org.launchcode.studio7;

import javax.swing.*;

public abstract class OpticalDisc implements Readable, Writable, Spinnable{
//    Shared *behaviors* between CD and DVD:
//    They both spin ~
//    Stop spinning ~
//    They both store data ~
//    Overwrite data ~
//    Data gets written to the discs by using a laser,
//    The data on the discs can be read by using a laser,
//    Once loaded, they both report information like name, capacity, contents, and disc type

//    Shared fields:
//    Storage capacity
//    is read/write capable?

    private boolean isWriteOnly;

    public OpticalDisc(boolean isWriteOnly) {
        this.isWriteOnly = isWriteOnly;
    }

    public boolean isWriteOnly() {
        return isWriteOnly;
    }

    public void setWriteOnly(boolean writeOnly) {
        isWriteOnly = writeOnly;
    }
}
