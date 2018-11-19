/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.chege.tutorial;

import javax.ejb.Stateless;

/**
 *
 * @author chege
 */
@Stateless
public class Test {

    public int add(int a, int b) {
        return a + b;
    }
}
