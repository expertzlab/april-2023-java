package com.example.comp;

public class MCompare  {
    public static void main(String[] args) {
        Address a1 = new Address("palarivattom", "ACT Chambers", "682025");
        Address a2 = new Address("peringala", "Snehanjali", "683645");
        if(a1.equals(a2)){
            System.out.println("Equal");
        } else {
            System.out.println("NOT equal");
        }

        System.out.println("Address:" + a1);
       
    }
}


class Address{
    String location;
    String houseORFlatName;
    String pinCode;

    public String getLocation() {
        return location;
    }

    public String getHouseORFlatName() {
        return houseORFlatName;
    }

    public String getPinCode() {
        return pinCode;
    }

    
    public void setLocation(String location) {
        this.location = location;
    }

    public void setHouseORFlatName(String houseORFlatName) {
        this.houseORFlatName = houseORFlatName;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Address(String l, String hf, String pc){
        location = l;
        houseORFlatName = hf;
        pinCode = pc;
    }

    public boolean equals(Address a){

        if(this.hashCode() != a.hashCode()){
            return false;
        }

        if(location.equals(a.getLocation()) && 
           houseORFlatName.equals(a.getHouseORFlatName()) &&
           pinCode.equals(a.getPinCode())){
            return true;
        } else {
            return false;
        }
    }

    public int hashCode(){
        return (pinCode.length() + 
                 houseORFlatName.length() + 
                 location.length());
    }

    public String toString(){
        return pinCode+ ", " + location + ", "+ houseORFlatName;
    }

}
