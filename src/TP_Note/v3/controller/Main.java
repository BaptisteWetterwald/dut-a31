package TP_Note.v3.controller;

import TP_Note.v3.controller.CookieFactory;
import TP_Note.v3.model.CookieLemon;
import TP_Note.v3.view.CookieObserver;

public class Main
{
    public static void main(String[] args)
    {
        PaquetCookies paquet = new PaquetCookies();
        paquet.addObserver(new CookieObserver(new CookieLemon()));
    }
}
