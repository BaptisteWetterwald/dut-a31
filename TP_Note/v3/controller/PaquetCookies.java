package TP_Note.v3.controller;

import TP_Note.v3.view.CookieObserver;

import java.util.ArrayList;

public class PaquetCookies
{
    private ArrayList<CookieObserver> observers;

    public void addObserver(CookieObserver observer)
    {
        this.observers.add(observer);
    }
}
