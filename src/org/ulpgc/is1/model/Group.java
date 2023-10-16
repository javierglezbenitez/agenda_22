package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Group extends Contact{
    private final String name;


    private List<Member>members = new ArrayList<>();


    public Group(String name){
        this.name = name;
    }

    public List<Member>getMembers(){
        return members;
    }


    public void addMember(Contact contact){
        members.add(new Member(contact,LocalDateTime.now()));
    }
    public void removeMember(int index){
        members.remove(index);
    }

    public String getName(){
        return name;
    }
}
