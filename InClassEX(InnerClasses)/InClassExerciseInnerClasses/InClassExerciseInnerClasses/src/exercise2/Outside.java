/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author pmage_000
 */
public class Outside {

    private int x;

    public Outside(int x) {
        this.x = x;
    }

    class Inside {

        private int y;

        public Inside(int y) {
            this.y = y;
        }

        public void add() {
            System.out.println("Addition: " + (x + y));
        }
    }

    public void multiply() {
        int answer;
        Inside i = new Inside(5);
        answer = x * i.y;
        System.out.println("Multiplication: " + answer);
        i.add();
    }
    

}
