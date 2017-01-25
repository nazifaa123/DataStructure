/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author nazifabegum
 */
interface WordStore {

    public void add(String word);

    public int count(String word);

    public void remove(String word);
}
