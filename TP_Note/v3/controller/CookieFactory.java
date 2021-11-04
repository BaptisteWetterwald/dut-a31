package TP_Note.v3.controller;

import TP_Note.v3.model.CookieBlueberries;
import TP_Note.v3.model.CookieChocolate;
import TP_Note.v3.model.CookieLemon;
import TP_Note.v3.view.CookieTemplate;

public class CookieFactory
{
    public CookieFactory()
    {

    }

    public CookieTemplate createCookieChocolate()
    {
        return new CookieChocolate();
    }

    public CookieTemplate createCookieLemon()
    {
        return new CookieLemon();
    }

    public CookieTemplate createCookieBlueberries()
    {
        return new CookieBlueberries();
    }
}
