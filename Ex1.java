
public class Ex1{
    public static void main(String args[]){
        
        // Initialising String 
        String Str = new String("we are happy"); 
          
        // original string  
        System.out.print("Original String : " ); 
        System.out.println(Str); 
          
        // Using replaceFirst to replace regex with replace_str 
        // Replaces 1st occurrence of geeks with ASTHA 
        System.out.print("After replacing  : " ); 
        System.out.println(Str.replaceFirst(" are happy", "%20are%20happy"));     

    }

 }