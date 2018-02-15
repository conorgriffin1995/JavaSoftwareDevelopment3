/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11ex2;

/**
 *
 * @author conorgriffin
 */
public class Motherboard {

    private String manufacturer;
    private int totalMemCap;
    private MemoryModule [] memoryModules;
    
    public Motherboard(String manufacturer, int totalMemCap, int memoryModules){
        manufacturer = manufacturer;
        totalMemCap = totalMemCap;
        this.memoryModules = new MemoryModule [memoryModules];
        
    }

    @Override
    public String toString()
    {
        return "Motherboard Manufacturer: " +manufacturer;
                
    }
    
    private class MemoryModule
    {
        
        private int capacity;

        public MemoryModule(int capacity) {
            this.capacity = capacity;
        }

        @Override
        public String toString()
        {
            return " containing: " + capacity;
        }    
        
    }
    
    public void print()
    {
        
    }
    
    
}
