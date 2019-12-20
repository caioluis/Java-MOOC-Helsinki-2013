/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caioluis
 */
public class Counter {

    int currentValue;
    boolean check = false;

    public Counter(int startingValue, boolean check) {
        this.currentValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.currentValue = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.check = check;
        this.currentValue = 0;
    }

    public Counter() {
        this.currentValue = 0;
    }

    public int value() {
        return this.currentValue;
    }

    public void increase() {
        this.currentValue++;
    }

    public void decrease() {
        if (check == false) {
            this.currentValue--;
        }
        if (check == true && this.currentValue == 0) {
            this.currentValue = 0;
        }
        if (check == true && this.currentValue > 0) {
            this.currentValue--;
            if (this.currentValue < 0) {
                this.currentValue = 0;
            }
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.currentValue += increaseAmount;
        } else {

        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check == false) {
                this.currentValue -= decreaseAmount;
            }
            if (check == true && this.currentValue == 0) {
                this.currentValue = 0;
            }
            if (check == true && this.currentValue > 0) {
                this.currentValue -= decreaseAmount;
                if (this.currentValue < 0) {
                    this.currentValue = 0;
                }
            }
        }
    }

}
