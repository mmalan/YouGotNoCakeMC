/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Clayton
 */
public class Progress implements Serializable {

    //class instance vaiables

    private String youWin;
    private String youLoose;
    private double calculate;

    public Progress() {
    }

    public String getYouWin() {
        return youWin;
    }

    public void setYouWin(String youWin) {
        this.youWin = youWin;
    }

    public String getYouLoose() {
        return youLoose;
    }

    public void setYouLoose(String youLoose) {
        this.youLoose = youLoose;
    }

    public double getCalculate() {
        return calculate;
    }

    public void setCalculate(double calculate) {
        this.calculate = calculate;
    }

    @Override
    public String toString() {
        return "Progress{" + "youWin=" + youWin + ", youLoose=" + youLoose + ", calculate=" + calculate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.youWin);
        hash = 31 * hash + Objects.hashCode(this.youLoose);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.calculate) ^ (Double.doubleToLongBits(this.calculate) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Progress other = (Progress) obj;
        if (!Objects.equals(this.youWin, other.youWin)) {
            return false;
        }
        if (!Objects.equals(this.youLoose, other.youLoose)) {
            return false;
        }
        if (Double.doubleToLongBits(this.calculate) != Double.doubleToLongBits(other.calculate)) {
            return false;
        }
        return true;
    }
}
