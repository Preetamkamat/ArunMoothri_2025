package com.javapractice.practice.finallevel;

import com.javapractice.practice.protectedmodifier.ChildProtectedModifier;
import com.javapractice.practice.protectedmodifier.ProtectedParentClass;

public class ProtectedClassOutSidePackage extends ProtectedParentClass {
    public static void main(String[] args) {
        ProtectedClassOutSidePackage p = new ProtectedClassOutSidePackage();
        p.m1();

    }
}
