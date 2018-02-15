/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inclassexerciseinterfaces.polymorphism;

/**
 *
 * @author x00111602
 */
public interface IPayable {

    double LOW_TAX_RATE = .23;
    double HIGH_TAX_RATE = .42;
    double VAT_RATE = .235;
    double RANGE_1 = 200;
    double RANGE_2 = 300;
    
    double getPaymentAmount();
    
    
}
    

