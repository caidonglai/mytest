package com.cdl.headfirst.observerexample.common.subject;

import com.cdl.headfirst.observerexample.common.observer.Observer;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
