/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.application;

import mooc.logic.ApplicationLogic;
import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;

/**
 *
 * @author Caio
 */
public class Main {

    public static void main(String[] args) {

        UserInterface ui = new TextUserInterface();

        new ApplicationLogic(ui).execute(3);

    }
}
