/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pair;
import java.math.*;
/**
 *
 * @author DELL
 */
public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    
    private boolean nt(Integer n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isPrime(){
        return nt((Integer) first) && nt((Integer) second);
    }
    
    public String toString(){
        return first + " " + second;
    }
}
