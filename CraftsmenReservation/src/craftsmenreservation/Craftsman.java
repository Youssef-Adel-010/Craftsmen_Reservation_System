/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package craftsmenreservation;

/**
 *
 * @author Dola
 */
public class Craftsman {
    
    public String Name;
    public String Craft;
    public String Phone;
    public String City;
    public String Experience;
    public String Licence;
    public String Clients;
    public String Fees;
    public String Notes;
    
    public Craftsman() { }
    public Craftsman(String Name, String Craft, String Phone, String City, 
                    String Experience, String Licence, String Clients, String Fees, String Notes){
        
        this.Name = Name;
        this.Craft = Craft;
        this.City = City;
        this.Clients = Clients;
        this.Fees = Fees;
        this.Licence = Licence;
        this.Experience = Experience;
        this.Phone = Phone;
        
        
    }
        
}
