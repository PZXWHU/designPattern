package com.pzx.observer.custom;

public interface Subject {
    void registerObserver(Observer observer);

    void removerObserver(Observer observer);

    void notifyObservers();
}
