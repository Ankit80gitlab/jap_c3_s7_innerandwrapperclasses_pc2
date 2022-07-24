package com.jap.oops;

public class Address {

    private String area;
    private String city;

    //default constructor
    public Address(){
    }

    public Address(String area, String city) {
        this.area=area;
        this.city=city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object other)
    {
        boolean result = false;

        Address add = (Address) other;

        if((this.area==null && add.area==null)||(this.city==null && add.city==null))
        {
            result=true;
        }
        else if(this.area.equalsIgnoreCase(add.area) && (this.city.equalsIgnoreCase(add.city)))
        {
            result=true;
        }
        else
        {
            result=false;
        }

        return result;
    }
}
