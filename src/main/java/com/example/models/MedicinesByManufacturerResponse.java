/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MedicinesByManufacturerResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4946237510100387800L;
    private String name;
    private String form;
    private int standardUnits;
    private String packageForm;
    private double price;
    private String size;
    private String manufacturer;
    private List<Constituent> constituents;
    private Schedule schedule;
    private String medicineId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("form")
    public String getForm ( ) { 
        return this.form;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("form")
    public void setForm (String value) { 
        this.form = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("standardUnits")
    public int getStandardUnits ( ) { 
        return this.standardUnits;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("standardUnits")
    public void setStandardUnits (int value) { 
        this.standardUnits = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("packageForm")
    public String getPackageForm ( ) { 
        return this.packageForm;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("packageForm")
    public void setPackageForm (String value) { 
        this.packageForm = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("price")
    public double getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("price")
    public void setPrice (double value) { 
        this.price = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("size")
    public String getSize ( ) { 
        return this.size;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("size")
    public void setSize (String value) { 
        this.size = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("manufacturer")
    public String getManufacturer ( ) { 
        return this.manufacturer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("manufacturer")
    public void setManufacturer (String value) { 
        this.manufacturer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("constituents")
    public List<Constituent> getConstituents ( ) { 
        return this.constituents;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("constituents")
    public void setConstituents (List<Constituent> value) { 
        this.constituents = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("schedule")
    public Schedule getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("schedule")
    public void setSchedule (Schedule value) { 
        this.schedule = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("medicine_id")
    public String getMedicineId ( ) { 
        return this.medicineId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("medicine_id")
    public void setMedicineId (String value) { 
        this.medicineId = value;
    }
 
}
 