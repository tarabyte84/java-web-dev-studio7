package org.launchcode.studio7;

public class CD extends OpticalDisc{

    private static double storageCapacity;

    public CD(double storageCapacity, boolean isWriteOnly) {
        super(isWriteOnly);
    }

    public static double getStorageCapacity() {
        return storageCapacity;
    }

    @Override
    public void readDisc() {

    }

    @Override
    public void displayContent() {

    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void stopSpin() {

    }

    @Override
    public void saveToDisc() {

    }

    @Override
    public void deleteFromDisc() {

    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
