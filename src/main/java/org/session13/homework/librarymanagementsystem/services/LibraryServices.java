package org.session13.homework.librarymanagementsystem.services;

import org.session13.homework.librarymanagementsystem.application.Library;
import org.session13.homework.librarymanagementsystem.srcdomain.Member;

import java.util.ArrayList;
import java.util.List;

public class LibraryServices {

    private final Library library;

    public LibraryServices(Library library) {
        this.library = library;
    }

    public List<Member> findMembersByName(String searchName) {
        List<Member> foundMembers = new ArrayList<>();
        for (Member member : library.getMembers()) {
            if (member.getName().equals(searchName)) {
                foundMembers.add(member);
            }
        }
        System.out.println("Member does not exist.");
        return foundMembers;
    }

    public Member findMemberByID(int ID) {
        for (Member member : library.getMembers()) {
            if (member.getID() == ID) {
                return member;
            }
        }
        System.out.println("Member does not exist.");
        return null;
    }
}
