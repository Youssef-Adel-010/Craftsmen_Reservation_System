package craftsmenreservation;

import java.util.ArrayList;

/**
 *
 * @author Dola
 */
public class SharedData {

    public ArrayList<Craftsman> crafstmen = new ArrayList<>();

    // Adding dummy data to the list
    public SharedData(){
        
        // Craftsman 1
        Craftsman craftsman1 = new Craftsman();
        craftsman1.Name = "John Doe";
        craftsman1.Craft = "Plumber";
        craftsman1.Phone = "123-456-7890";
        craftsman1.City = "Cityville";
        craftsman1.Experience = "5";
        craftsman1.Licence = "No License";
        craftsman1.Clients = "100";
        craftsman1.Fees = "50";
        craftsman1.Notes = "Prompt and reliable.";
        
        crafstmen.add(craftsman1);
        
        // Craftsman 2
        Craftsman craftsman2 = new Craftsman();
        craftsman2.Name = "Jane Smith";
        craftsman2.Craft = "Electrician";
        craftsman2.Phone = "987-654-3210";
        craftsman2.City = "Electro City";
        craftsman2.Experience = "8";
        craftsman2.Licence = "License";
        craftsman2.Clients = "80";
        craftsman2.Fees = "60";
        craftsman2.Notes = "Specializes in residential wiring.";
    
        crafstmen.add(craftsman2);
        
        // Craftsman 3
        Craftsman craftsman3 = new Craftsman();
        craftsman3.Name = "Bob Carpenter";
        craftsman3.Craft = "Carpenter";
        craftsman3.Phone = "555-123-4567";
        craftsman3.City = "Woodland";
        craftsman3.Experience = "10";
        craftsman3.Licence = "No License";
        craftsman3.Clients = "120";
        craftsman3.Fees = "45";
        craftsman3.Notes = "Skilled in custom furniture.";

        crafstmen.add(craftsman3);
        
        // Craftsman 4
        Craftsman craftsman4 = new Craftsman();
        craftsman4.Name = "Alice Painter";
        craftsman4.Craft = "Painter";
        craftsman4.Phone = "789-456-1230";
        craftsman4.City = "Colorville";
        craftsman4.Experience = "7";
        craftsman4.Licence = "License";
        craftsman4.Clients = "90";
        craftsman4.Fees = "40";
        craftsman4.Notes = "Expert in interior painting.";
        
        crafstmen.add(craftsman4);
        
        // Craftsman 5
        Craftsman craftsman5 = new Craftsman();
        craftsman5.Name = "Sam Handyman";
        craftsman5.Craft = "Blacksmith";
        craftsman5.Phone = "111-222-3333";
        craftsman5.City = "Fixington";
        craftsman5.Experience = "6";
        craftsman5.Licence = "License";
        craftsman5.Clients = "70";
        craftsman5.Fees = "55";
        craftsman5.Notes = "Versatile and skilled.";
        
        crafstmen.add(craftsman5);
    }
}
