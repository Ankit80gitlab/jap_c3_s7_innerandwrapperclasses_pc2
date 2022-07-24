package com.jap.oops;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private Address address;

    public Customer() {
        //default Constructor
    }

    public Customer(int customerId, String name, String email, Address address) {

        this.customerId=customerId;
        this.name=name;
        this.email=email;
        this.address=address;
    }



    @Override
    public boolean equals(Object other)
    {
        boolean result=false;

        Customer cust = (Customer)other;


        if((this.customerId==0 && cust.customerId==0))
        {
            result=true;
        }
        if((this.name==null && cust.name==null))
        {
            result=true;
        }
        if((this.email==null && cust.email==null))
        {
            result=true;
        }
        if((this.address==null && cust.address==null))
        {
            result=true;
        }

        ////////////////

        if(this.customerId==(cust.customerId))
        {
            result=true;
        }
        if(this.name==(cust.name))
        {
            result=true;
        }
        if(this.email==(cust.email))
        {
            result=true;
        }
        if(this.address==(cust.address))
        {
            result=true;
        }
        return result;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address; 
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
