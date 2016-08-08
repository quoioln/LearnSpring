/**
 * 
 */
package com.quoioln.model;

/**
 * @author vpquoi
 *
 */
public class Student {
    /** The name of student */
    private String name;
    
    /** The age of student*/
    private Integer age;
    
    /** The id of student*/
    private Integer id;

    public Student() {
    }
    
    public Student(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    /**
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public final Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public final void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public final void setId(Integer id) {
        this.id = id;
    }
    
    
}
