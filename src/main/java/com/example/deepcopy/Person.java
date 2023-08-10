package com.example.deepcopy;

public class Person implements Cloneable{
    
    String name;
    int age;
    String[] addr;

    public Person(String n, int a, String[] ar){
        name = n;
        age = a;
        addr = ar;
    }
     public Person(){

     }

     public Person(Person p){
        name = p.getName()+"";
        age = p.age;
     }

    public Person(String str){
        String[] s1 = str.split(",");
        name = s1[0]; 
        age =    Integer.valueOf(s1[1].trim()); 
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getAddr() {
        return addr;
    }

    public String toString(){
        //return ""+age+", "+name+", "+ addr[0]+", "+ addr[1];
        return ""+age+", "+name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void setAge(int x){
        this.age = x;
    }

    public void setName(String x){
        this.name = x;
    }

    class Name{
        String name;

        public void setName(String x){
            name =x;
        }

        public String getName(){
            return name;
        }
    }
}
