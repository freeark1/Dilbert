/**
 * DilbertCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package net.gcomputer.webservices;


/**
 *  DilbertCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class DilbertCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public DilbertCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public DilbertCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for todaysDilbert method
     * override this method for handling normal response from todaysDilbert operation
     */
    public void receiveResulttodaysDilbert(
        net.gcomputer.webservices.DilbertStub.TodaysDilbertResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from todaysDilbert operation
     */
    public void receiveErrortodaysDilbert(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for dailyDilbert method
     * override this method for handling normal response from dailyDilbert operation
     */
    public void receiveResultdailyDilbert(
        net.gcomputer.webservices.DilbertStub.DailyDilbertResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from dailyDilbert operation
     */
    public void receiveErrordailyDilbert(java.lang.Exception e) {
    }
}
