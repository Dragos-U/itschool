package org.session13.homework.librarymanagementsystem.services;

import org.session13.homework.librarymanagementsystem.librarymanagement.Library;
import org.session13.homework.librarymanagementsystem.profiles.Member;

import java.util.ArrayList;
import java.util.List;

public class LibraryServices {

    private LibraryServices() {
        throw new IllegalStateException("This class should not be instantiated.");
    }

    public static List<Member> findMembersByName(String searchName, Library library) {
        List<Member> foundMembers = new ArrayList<>();
        for (Member member : library.getMembers()) {
            if (member.getName().equals(searchName)) {
                foundMembers.add(member);
            }
        }
        System.out.println("Member does not exist.");
        return foundMembers;
    }

    public static Member findMemberByID(int ID, Library library) {
        for (Member member : library.getMembers()) {
            if (member.getID() == ID) {
                return member;
            }
        }
        System.out.println("Member does not exist.");
        return null;
    }
}
