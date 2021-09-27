package com.company;

import com.company.interfaces.Observer;

public class MagazineSubscriber implements Observer {
    private int magazineNumber;
    public int getMagazineNumber() {
        return magazineNumber;
    }
    @Override
    public void update(int magazineNumber) {
        this.magazineNumber = magazineNumber;
    }
}
